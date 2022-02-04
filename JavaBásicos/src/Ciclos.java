
public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int control = 0;
		
		while(control<10) {
			System.out.println("control = "+control);
			control++;
		}
		*/
		//int control = 0;
		/*
		 * do { System.out.println("control = "+control); control++;//modificador de la
		 * variable }while(control <=10);
		 */
		
		for(int i=0; i<3; i++) {
			//System.out.println("control = "+i);
			if(i%2==0) {//cuando el valor de i es par
				//break://permite saltarnos una ejecución del ciclo
				continue;//deja que continue el ciclo
			}
			System.out.println("control = "+i);
			
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("control = "+i);
			continue;//no puede tener código después
			
		}
		
		

	}

}
