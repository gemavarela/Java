import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   * Pedir al usuario 2 n�meros por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) Divisi�n
		   * 4) Multiplicaci�n
		   * 
		   * y despues imprimir el resultado
		   */

		System.out.println("Ingresa la operaci�n que deseas \n 1) Suma \n 2) Resta \n 3) Divisi�n \n 4) Multiplicaci�n ");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		sc.close();
		System.out.println("Ingresa el primer n�mero: ");
		Scanner num1 = new Scanner(System.in);
		int n1 = num1.nextInt();
		System.out.println("Ingresa el segundo n�mero: ");
		Scanner num2 = new Scanner(System.in);
		int n2 = num2.nextInt();
		int result=0;
		switch(op) {
		case 1: result=n1+n2 ;
		break;
		case 2: result=n1-n2 ;
		break;
		case 3: result=n1/n2 ;
		break;
		case 4: result=n1*n2 ;
		break;
		default: System.out.println("Error mi cielaa");
		}
		System.out.println("El resultado es: "+result);
		System.out.println("Gracias :) ");

	}

}
