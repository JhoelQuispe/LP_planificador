import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Limites {
	public int fecha1;
	public int fecha2;
	
	public Limites(String raw) {
		// TODO Auto-generated constructor stub
		String[] rango = raw.split("-");
		for (int i = 0  ; i < rango.length ;  i++){
			String[]sep = rango[i].split(":");
			int[] a = new int [2];
			a[0] = Integer.parseInt(sep[0]);
			a[1] = Integer.parseInt(sep[1]);
			int time = a[0]*60+a[1];
			if (i%2 == 0){
				fecha1 = time;
			}
			else	fecha2 = time;
		}
		System.out.println(fecha1+" "+fecha2);
			
	}
	
	
					
			
			
	
	
}