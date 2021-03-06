package singleton.demo;

final class Captain {

	private static Captain captain;
	
	//Constructor privado para prevenir el uso de "new"
	private Captain() {
		
	}
	
	public static synchronized Captain getCaptain() {
		//Early initialization
		//private static final Captain captain = new Captain();
		
		//lazy initiallization
		if(captain == null) {
			captain = new Captain();
			System.out.println("Nuevo capit�n elegido");
		}else {
			System.out.println("Ya existe un capit�n");
		}
		return captain;
	}
}
