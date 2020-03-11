package innerclass.demo;

//final class Captain
class Captain{

	private static Captain captain;
	
	//Constructor privado para prevenir el uso de "new"
	static int numberOfInstance=0;
	private Captain() {
		
		numberOfInstance++;
		System.out.println("Número de instancias en este momento = "+numberOfInstance);
		
	}
	
	public static synchronized Captain getCaptain() {
		//Inicialización perezosa
		if(captain == null) {
			captain = new Captain();
			System.out.println("Nuevo capitán elegido");
		}else {
			System.out.println("Ya existe un capitán");
		}
		return captain;
	}
	
	//Una clase anidada no estática (INNER CLASS)
	public class CaptainDerived extends Captain{
		//algo de código
	}
}
