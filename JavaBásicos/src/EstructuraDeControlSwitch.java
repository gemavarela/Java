import java.util.Scanner;

public class EstructuraDeControlSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estructuras de control nos sirve para controlar
		//el flujo de comportamiento de un programa. 
		//Para la toma de decisiones
		
		/*
		switch(condicion_a_evaluar) {
		case "valor":
			codigo a ejecutar
			break;
			..a.
		case "n": código
		break;
			default: código
				
		}
		*/
		
		//Solicitar al usuario un día de la semana
		//y mostrar un mensaje
		System.out.println("Ingresa el día en que dicen que vives");
		Scanner sc = new Scanner(System.in);
		String dia=sc.nextLine(); //recupera texto
		
		switch(dia.toLowerCase()) {
		case "lunes": System.out.println("ya mero es viernees, toma un tesito");
		
		break;
		case "martes": System.out.println("vas avannzando poco a poco");
		
		break;
		
        case "miércoles": System.out.println("ombligo de semana");
		
		break;
        case "jueves": System.out.println("ya es juebebes");
		
		break;
        case "viernes": System.out.println("ya es viernes y el cuerpo y lo sabe");
		
		break;
		
		default: System.out.println("ya es viernes y el cuerpo y lo sabe");
		
		
		}

	}

}
