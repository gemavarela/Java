import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Utilizando un bucle while
		 * 
		 * 1.- Crea una nueva clase llamada Tabla 2.- Copia el siguiente codigo y
		 * verifica que funcione
		 */

				        Scanner console = new Scanner(System.in);
				        int num;
				        System.out.println("TABLITAS DE MULTIPLICAR n.n ");
				        
				        System.out.println("Ingresa cualquier número positivo: ");
				        num = console.nextInt();
				                
				        System.out.println("Tabla de multiplicar del  " + num);
				        
				       //Implementa un bucle while que imprima el resultado
				    int cont=1, mult=0;
					while(cont<=10) {
						mult=num*cont;
						System.out.println("\t"+num+" x "+cont+ " : "+mult);
						cont++;
						
					}

			//3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)


	}

}
