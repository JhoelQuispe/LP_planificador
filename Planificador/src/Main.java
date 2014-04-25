
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String[] archivos = {"a","b"};
		String[] dias = {"mon","tue","wed","thu","fri"};	
		List<String> list_days = Arrays.asList(dias);
		Dias[] week = new Dias [dias.length];
		for(int i = 0 ; i < dias.length ; i++){
			week[i] = new Dias();
		}
		for(int j = 0 ; j < archivos.length ; j++){
			File f = new File(archivos[j]);
			BufferedReader entrada;
			try {
				entrada = new BufferedReader( new FileReader( f ) );
				String linea;
				while(entrada.ready()){
					linea = entrada.readLine();
					String nameday = linea.substring(0,3);
					int index = list_days.indexOf(nameday);
					week[index].Add(linea);
					
				}			
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0 ; i < dias.length ; i++){
			System.out.print(dias[i]+" ");
			week[i].Pre_Find_Intersections(10);
		}
		
		BufferedReader dis = new BufferedReader(new
		InputStreamReader(System.in));
	}
}
