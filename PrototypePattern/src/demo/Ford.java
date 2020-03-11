package demo;

public class Ford extends BasicCar{

	public int basePrice = 10000;
	public Ford(String m) {
		modelName = m;
	}
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Ford)super.clone();
	}
	
	
}
