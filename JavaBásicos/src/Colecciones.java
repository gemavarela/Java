import java.util.HashSet;
import java.util.Set;


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Las colecciones nos sirvenpara almacenar cconjuntos de 
		
		//set tiene 3 implementaciones
		//HashSet
		//Los elementos no mantinen un orden
		//Es la implementación más rápida
		Set <String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandía");
		frutas.add("fresa");
		
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		

	}

}
