import java.util.Scanner;

public class ScannerYBufer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Ingresa un número: ");
		Scanner num2 = new Scanner(System.in);
		int n2 = num2.nextInt();
		sc.nextLine();
		System.out.println("Ingresa tu nombre ");
		Scanner name = new Scanner(System.in);
		String nombre = name.next();
		System.out.println("Tu nombre es: "+nombre+" Tu número es: "+n2);
		

	}

}
