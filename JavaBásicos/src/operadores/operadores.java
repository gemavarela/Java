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
		System.out.println("El resultado de la división es:"+division);
		
		double division2 = (double) c/b;
		//por lo menos uno de los datos debe ser de tipo double;
		//10.0 /20=0.5
		System.out.println("El resultado de la división es" +division2);
		
		//multiplicación
		double multiplicacion= c*a;
		System.out.println("El resultado de la multiplicación es: " +multiplicacion);
		
		//modulo
		double modulo=a%b;
		System.out.println("El resultado de la operación es: " +modulo);
		
		//Operador de asignación
		int d=5, e;
		e=6;
		System.out.println(d+" |  "+e);
		
		//Operadores de declaración compuesta
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
		//PRE-asignación ++k Se le asigna un valor antes de usarse
		//POSTasignación k++ primero lee el valor y desúes le suma 1
		
		int k=0, l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//precedencia de operadores-JERARQUÍA
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
		
		
		//Operadores lógicos
		
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);
		System.out.println(false || false);
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
