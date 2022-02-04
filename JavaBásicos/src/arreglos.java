
public class arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[];
		numeros = new int [4];
		
		String[] nombres = new String[4];
		
		String []nombreFrutas=new String[] {"manzana","Plátano","uva",
				"Pera"};//array literal
		
		
		numeros[0]=10;
		numeros[1]=8;
		numeros[2]=100;
		numeros[3]=200;
		
		nombres[0]="Juana";
		nombres[1]="Yolanda";
		nombres[2]="Antonio";
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(nombres[i]);
			System.out.println("-----------");
		}
		

	}

}
