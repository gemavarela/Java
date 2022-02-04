import java.util.Scanner;

/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */

public class NumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el numero 1");
		Scanner num1 = new Scanner (System.in);
		int numero1 = num1.nextInt();
		System.out.println("Introduce el numero 2");
		Scanner num2 = new Scanner (System.in);
		int numero2 = num2.nextInt();
		System.out.println("Introduce el numero 3");
		Scanner num3 = new Scanner (System.in);
		int numero3 = num3.nextInt();
		int mayor=0;
		int menor1=0, menor2=0;
		
		if(numero1!=numero2 && numero1!=numero3 && numero2!=numero3) {
			if(numero1>numero2 && numero1>numero3) {
				mayor=numero1;
				menor1=numero2;
				menor2=numero3;
				
			}
			else if(numero2>numero1 && numero2>numero3) {
				mayor=numero2;
				menor1=numero1;
				menor2=numero3;
			}
			else if(numero3>numero2 && numero3>numero1) {
				mayor=numero3;
				menor1=numero2;
				menor2=numero1;
	       	}
			
			System.out.println("El número "+ mayor+" es mayor que "+menor1+" y "+menor2);

		}
		else if(numero1==numero2 && numero1>numero3) {
			mayor=numero1;
			System.out.println("El número "+ mayor+" es mayor que "+numero3);
		}
		else if (numero2==numero3 && numero2>numero1){
			mayor=numero2;
			System.out.println("El número "+ mayor+" es mayor que "+numero1);
		}else if(numero1==numero3 && numero1>numero2) {
			mayor=numero3;
			System.out.println("El número "+ mayor+" es mayor que "+numero2);
		}else {
			System.out.println("Los números son iguales");
			
		}
		
}}
