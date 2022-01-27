
public class conversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		byte numeroByte= 10;
		short numeroShort = numeroByte;
		int numeroInt=numeroShort;
		long numeroLong= numeroShort;
		
		
		int otroInt = (int)numeroLong;
		
		short numero1=123;
		short numero2=7343;
		byte numero3=12;
		byte numero4=33;
		
		short suma = (short)(numero1 + numero2);//LAS OPERACIONES ARITMÉTICAS SE HACEN SIEMPRE DESDE INT INTERNAMENTE
		byte suma2=(byte)(numero3+numero4);
		int suma3=(numero3+numero4);
		//short suma4=numero1+numero3;
		
		
		

	}

}
