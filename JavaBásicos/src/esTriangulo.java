import java.util.Scanner;

public class esTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el ángulo 1");
		Scanner a1 = new Scanner (System.in);
		int angulo1 = a1.nextInt();
		System.out.println("Introduce el ángulo 2");
		Scanner a2 = new Scanner (System.in);
		int angulo2 = a2.nextInt();
		System.out.println("Introduce el ángulo 3");
		Scanner a3 = new Scanner (System.in);
		int angulo3 = a3.nextInt();
		int suma=angulo1+angulo2+angulo3;
		
		if(suma==180) {
			System.out.println("Es triángulo");
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
				System.out.println("Tipo: ACUTÁNGULO");
				
			}
			if((TC*TC) == ((TA*TA)+(TB*TB))) {
				System.out.println("Tipo: RECTÁNGULO");
				
			}
			if((TC*TC) > ((TA*TA)+(TB*TB))) {
				System.out.println("Tipo: OBTUSÁNGULO");
				
			}
			
			
			
		}else {
			System.out.println("No es triángulo");
		}
		
		//c>a y b ACUTÁNGULO
		//c= a+b RECTÁNGULO
		//c>a+b OBTUSÁNGULO

	}

}
