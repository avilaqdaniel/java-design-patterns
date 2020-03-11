package demo;

public class PrototypePatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {

		BasicCar nano = new Nano("Green Nano");
		nano.basePrice = 10000;
		
		BasicCar ford = new Nano("Ford Yellow");
		ford.basePrice = 50000;
		
		BasicCar bc1;
		
		//Nano
		bc1 = nano.clone();
		bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
		System.out.println("Car is: "+bc1.modelName+ " and it's price is S/"+bc1.onRoadPrice);

		//Ford
		bc1 = ford.clone();
		bc1.onRoadPrice = ford.basePrice + BasicCar.setAdditionalPrice();
		System.out.println("Car is: "+bc1.modelName+ " and it's price is S/"+bc1.onRoadPrice);
	}

}
