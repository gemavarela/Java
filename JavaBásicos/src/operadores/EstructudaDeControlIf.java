package operadores;

import java.util.Scanner;

public class EstructudaDeControlIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estructuras de control de flujo
		//Nos sirve para la toma de decisiones
		//Cambiar el flujo de nuestro programa
		//evaluando una condici�n y a partir de la evaluaci�n
		//se realiza una acci�n u ota
		
		System.out.println("Introduce tu edad");
		Scanner sc = new Scanner (System.in);
		int edad = sc.nextInt();
		
		if(edad>=18) {
			System.out.println("Eres mayor de edad");
			
		}else {
			System.out.println("Eres menor de edad");
		}
		
		
		

			

	}

}
