package demo;

class Nano extends BasicCar{
	
	public int basePrice=10000;
	public Nano(String m) {
		modelName = m;
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Nano)super.clone();
	}

	
}
