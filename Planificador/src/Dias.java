import java.util.Vector;

public class Dias {

	public String nombre;
	private Vector<Limites> soluc;
	public Vector<Vector<Limites>> intervalos;
	public Dias() {
		
		intervalos = new Vector<Vector<Limites>>();
		
	}
		
	public void Add (String raw){
		String horas = raw.substring(4, raw.length());
		String[] fix = horas.split(" ");
		Vector<Limites> vl = new Vector<Limites>();
		for (int i = 0 ; i < fix.length ; i++){
			Limites l = new Limites(fix[i]);
			vl.add(l);
		}
		intervalos.add(vl);
	}
	
	public void Find_Intersections(){
		System.out.println(intervalos.size());
		for(int i = 0 ;i < intervalos.size() ; i++){
			Vector<Limites> a = intervalos.get(i);
			Vector<Limites> b = intervalos.get(i+1);
			
			
			
			for(int j = 0 ; j < intervalos.get(i).size() ; j++){
				System.out.println(intervalos.get(i).get(j).fecha1);
				System.out.println(intervalos.get(i).get(j).fecha2);
			}
		}
	}
		
		// TODO Auto-generated constructor stub
	
	
	
}
