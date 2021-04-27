package Module_2;

public class Laptop {
	
	private double _price;
	private String _brand;
	private final double k = 1.5;
	
	public Laptop() {}
	
	public Laptop(double cost, String brand) {
		_price = cost * k;
		_brand = brand;
	}

	public void setBrand(String newBrand) {
		_brand = newBrand;
	}
	
	public String getBrand() {
		return _brand;
	}
	
	public Laptop makeCopy() {
		
		Laptop newLaptop = new Laptop(_price / k, _brand);
		//newLaptop._brand = _brand;
		// newLaptop._price = _price;
		
		return newLaptop;
	}
	
	@Override
	public String toString() {
		return "Brand " + _brand + " $" + _price;
	}

}
