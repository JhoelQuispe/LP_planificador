
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
		//// Agregacion de datos
		for(int j = 0 ; j < archivos.length ; j++){
			System.out.println(archivos[j]);
			File f = new File(archivos[j]);
			BufferedReader entrada;
			try {
				entrada = new BufferedReader( new FileReader( f ) );
				String linea;
				while(entrada.ready()){
					linea = entrada.readLine();
					System.out.println(linea);
					String nameday = linea.substring(0,3);
					int index = list_days.indexOf(nameday);
//					System.out.println("index "+index);
					week[index].Add(linea);
					
				}			
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Termino la insercion de datos");
//		for(int i = 0 ; i < dias.length ; i++){
//			week[i].Find_Intersections();
//		}
		week[0].Find_Intersections();
	}




}
