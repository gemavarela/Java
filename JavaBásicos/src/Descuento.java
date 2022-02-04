import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// solicitar el total de una compra por consola.
				// si la cuenta es de menos de 1000
				// sila cuenta es de 1001 - 4999 10%
				// si la cuenta es de 5001 a 9999 20%
				// si la copra es de 10000 o más 30%
		
		System.out.println("Introduce el total de tu compra");
		Scanner compra = new Scanner (System.in);
		int total = compra.nextInt();
		double descuento=0, precioFinal=0;
		
		if(total<1000) {
			System.out.println("No hay descuento, compre más porfi");
		
		}else if(total>=1001 && total<=4999) {
			descuento=(double)(total*.10);
			precioFinal=total-descuento;
			
		}else if(total>=5001 && total<=9999) {
			descuento=(double)(total*.20);
			precioFinal=total-descuento;
			
		}else if(total>=10000) {
			descuento=(double)(total*.30);
			precioFinal=total-descuento;
			
			
		}
		System.out.println("Su compra fue de: "+total);
		System.out.println("Su descuento es de: "+descuento);
		System.out.println("El precio final es de: "+precioFinal);
		
		
		


	}

}
