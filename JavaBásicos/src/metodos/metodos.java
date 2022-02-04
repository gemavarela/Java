package metodos;

public class metodos {
	int a, b;
	
	public void sumar() {
		int resultado = a+b;
		System.out.println("El resultado de sumar"+a+" mas"+ b+ " es "+resultado);
		
	}
	
	public int sumaConRetorno() {
		return a+b;
	}
	
	public double multiplicarConArgumentos (int arg1, int arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
		
		
	}
	
	public static void imprimirNombre(String nombre) {//puede funcionar sin objeto porque es static void
		System.out.println("Mi nombre es: "+nombre);
	}

}
