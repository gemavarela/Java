import java.util.Scanner;

public class esTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el �ngulo 1");
		Scanner a1 = new Scanner (System.in);
		int angulo1 = a1.nextInt();
		System.out.println("Introduce el �ngulo 2");
		Scanner a2 = new Scanner (System.in);
		int angulo2 = a2.nextInt();
		System.out.println("Introduce el �ngulo 3");
		Scanner a3 = new Scanner (System.in);
		int angulo3 = a3.nextInt();
		int suma=angulo1+angulo2+angulo3;
		
		if(suma==180) {
			System.out.println("Es tri�ngulo");
			System.out.println("Introduce la hipotenusa c");
			Scanner c = new Scanner (System.in);
			int TC = c.nextInt();
			System.out.println("Introduce el lado a");
			Scanner a = new Scanner (System.in);
			int TA = a.nextInt();
			System.out.println("Introduce el lado b");
			Scanner b = new Scanner (System.in);
			int TB = b.nextInt();
			
			if((TC*TC) < ((TA*TA)+(TB*TB))) {
				System.out.println("Tipo: ACUT�NGULO");
				
			}
			if((TC*TC) == ((TA*TA)+(TB*TB))) {
				System.out.println("Tipo: RECT�NGULO");
				
			}
			if((TC*TC) > ((TA*TA)+(TB*TB))) {
				System.out.println("Tipo: OBTUS�NGULO");
				
			}
			
			
			
		}else {
			System.out.println("No es tri�ngulo");
		}
		
		//c>a y b ACUT�NGULO
		//c= a+b RECT�NGULO
		//c>a+b OBTUS�NGULO

	}

}
