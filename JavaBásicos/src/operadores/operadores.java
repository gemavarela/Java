package operadores;

public class operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b= 20;
		double c= 10.0;
		
		
		int suma= a + b;
		System.out.print(c);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		System.out.println("El resultado de la resta: "+(b -a));
		
		int division = a / b; // 10/20=0
		System.out.println("El resultado de la divisi�n es:"+division);
		
		double division2 = (double) c/b;
		//por lo menos uno de los datos debe ser de tipo double;
		//10.0 /20=0.5
		System.out.println("El resultado de la divisi�n es" +division2);
		
		//multiplicaci�n
		double multiplicacion= c*a;
		System.out.println("El resultado de la multiplicaci�n es: " +multiplicacion);
		
		//modulo
		double modulo=a%b;
		System.out.println("El resultado de la operaci�n es: " +modulo);
		
		//Operador de asignaci�n
		int d=5, e;
		e=6;
		System.out.println(d+" |  "+e);
		
		//Operadores de declaraci�n compuesta
		//+=, -=, *=, /=
		
		int f=0, g=5;
		f+=5;
		//f=f+5;
		System.out.println(f);
		
		//Operadores relacionales
		int h=15, i=25;
		String j="hola";
		System.out.println(h>i);
		System.out.println(i != h);
		
		//operador Unario
		//PRE-asignaci�n ++k Se le asigna un valor antes de usarse
		//POSTasignaci�n k++ primero lee el valor y des�es le suma 1
		
		int k=0, l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//precedencia de operadores-JERARQU�A
		int oper=4+5*6/3;
		//5*6=30
		//30/3=10
		//4+10=14
		
		System.out.println(oper);
		
		int x=0, y=0;
		int operacion2 =++x + y--;
		//x=1,Y=0
		System.out.println(operacion2);//1
		//Operador ternario-ELVIS
		
		int edad =18, valor=0, valor1=1;
		int resultado = (edad <= 18) ? 2:1;
		System.out.println(resultado);
		
		
		//Operadores l�gicos
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);
		System.out.println(false || false);
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
