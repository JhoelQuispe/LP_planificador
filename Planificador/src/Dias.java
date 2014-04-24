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
	
	public void Pre_Find_Intersections(int time){
		Vector<Limites> v1;
		Vector<Limites> v2;
		if(intervalos.size() > 1){
			if(intervalos.get(0).get(0).fecha1 < intervalos.get(1).get(0).fecha1){
				v1 = intervalos.get(0);
				v2 = intervalos.get(1);
				
			
	//			Vector<Limites> a = intervalos.get(i);
	//			Vector<Limites> b = intervalos.get(i+1);
				
			
			}
			else {
				v2 = intervalos.get(0);
				v1 = intervalos.get(1);
				
			}
			
			Find_Intersectoins(v1, v2, time );
			System.out.println();
		}
		
	}
	
	public void TransfDate(int a){
		int b = a/60;
		int c = a%60;
		String b2 = Integer.toString(b);
		String c2 = Integer.toString(c);
		if (c2.length() == 1){
			c2 = '0'+c2;
		}
		if (b2.length() == 1){
			b2 = '0'+b2;
		}
		System.out.print(b+":"+c2);
	}
	
	public void Find_Intersectoins(Vector<Limites> v1 , Vector<Limites>v2 , int time){
		int j = 0;
		int i = 0;
		while( i < v1.size() && j < v2.size()){
			Limites t1 = v1.get(i);
			Limites t2 = v2.get(j);
			if (t1.fecha1 < t2.fecha2){
				if(t1.fecha1 > t2.fecha1){
					if(t1.fecha2 < t2.fecha2){
						if(t1.fecha2 - t1.fecha1 >= time ){
							TransfDate(t1.fecha1);
							System.out.print("-");
							TransfDate(t1.fecha2);
							System.out.print(" ");
						}
						i++;
					}
					else{
						if(t2.fecha2 - t1.fecha1 >= time ){
							TransfDate(t1.fecha1);
							System.out.print("-");
							TransfDate(t2.fecha2);
							System.out.print(" ");
							
						}
						j++;
					}
				}
				else{
					if(t1.fecha2 < t2.fecha1){
						i++;
					}
					else{
						if(t1.fecha2 < t2.fecha2){
							if(t1.fecha2 - t2.fecha1 >= time){
								TransfDate(t2.fecha1);
								System.out.print("-");
								TransfDate(t1.fecha2);
								System.out.print(" ");
								
							}
							i++;
						}
						else{
							if(t2.fecha2 - t2.fecha1 >= time){
								TransfDate(t2.fecha1);
								System.out.print("-");
								TransfDate(t2.fecha2);
								System.out.print(" ");
							}
							j++;
						}
					}
				}
			}
			else{
				j++;
			}
		}
	}
	
	
		
	
		// TODO Auto-generated constructor stub
	
	
	
}
