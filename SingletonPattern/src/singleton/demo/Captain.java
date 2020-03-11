package singleton.demo;

final class Captain {

	private static Captain captain;
	
	//Constructor privado para prevenir el uso de "new"
	private Captain() {
		
	}
	
	public static synchronized Captain getCaptain() {
		if(captain == null) {
			captain = new Captain();
			System.out.println("Nuevo capitán elegido");
		}else {
			System.out.println("Ya existe un capitán");
		}
		return captain;
	}
}
