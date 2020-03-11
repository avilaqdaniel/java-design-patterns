package innerclass.demo;

public class SingletonPatternExample {

	public static void main(String[] args) {
		// Constructor privado, no se puede usar new
		//Captain c3 = new Captain();

		Captain capitan1 = Captain.getCaptain();
		System.out.println("Intenta crear otra instancia de la clase Captain");
		
		Captain capitan2 = Captain.getCaptain();
		if (capitan1 == capitan2) {
			System.out.println("capitán1 y capitán2 son la misma instancia");
		}
		Captain.CaptainDerived derivado = capitan1.new CaptainDerived();
				
	}

}
