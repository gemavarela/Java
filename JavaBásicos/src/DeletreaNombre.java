

import java.util.Scanner;

public class DeletreaNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ingresa nombre y deletrea
		
		System.out.println("DELETREO DE TU NOMBRE n.n ");
		Scanner console = new Scanner(System.in);
		System.out.println("Ingresa tu nombre ");
		Scanner name = new Scanner(System.in);
		String nombre = name.next();
		
		
		for(int i=0; i<nombre.length(); i++) {
			System.out.println(""+nombre.charAt(i));
						
			
		}
         

	}

}
