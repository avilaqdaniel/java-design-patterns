package innerclass.demo;

//final class Captain
class Captain{

	private static Captain captain;
	
	//Constructor privado para prevenir el uso de "new"
	static int numberOfInstance=0;
	private Captain() {
		
		numberOfInstance++;
		System.out.println("N�mero de instancias en este momento = "+numberOfInstance);
		
	}
	
	public static synchronized Captain getCaptain() {
		//Inicializaci�n perezosa
		if(captain == null) {
			captain = new Captain();
			System.out.println("Nuevo capit�n elegido");
		}else {
			System.out.println("Ya existe un capit�n");
		}
		return captain;
	}
	
	//Una clase anidada no est�tica (INNER CLASS)
	public class CaptainDerived extends Captain{
		//algo de c�digo
	}
}
