
public class ManipularArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea una clase llamara ManipularArreglo crea un array con los siguientes
		 * números enteros:
		 * 
		 * 1, 6, 45, 53, 80, 102, 145, 326, 450, 892 Crea un programa que use un ciclo
		 * que tome los números de arreglo y devuelva la suma total, la suma de los
		 * números pares y la suma de los números impares.
		 */
		
		int enteros[];
		enteros = new int [] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int sumaPares=0, sumaImpares=0, sumaTotal=0;
		
		for(int i=0; i<enteros.length; i++) {
			System.out.println(enteros[i]);
			sumaTotal+=enteros[i];
			if(enteros[i]%2==0) {
				sumaPares+=enteros[i];
				
			}
			else {
				sumaImpares+=enteros[i];
			}
		}
		
		System.out.println("Total de la suma de los enteros: "+sumaTotal);
		System.out.println("Total de la suma de los pares: "+sumaPares);
		System.out.println("Total de la suma de los impares: "+sumaImpares);
	}

}
