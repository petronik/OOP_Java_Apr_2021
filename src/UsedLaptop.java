
public class UsedLaptop {
	
	private double _price;
	private String _brand;
	
	public UsedLaptop( double cost, String brand ) {
		_price = cost * 1.5;
		_brand = brand;
	}
	
	public double getPrice() {
		return _price;
	}
	
	public double getCost() {
		return _price / 1.5;
	}
	
	public void display() {
		System.out.println(_brand + " $" + _brand);
	}
	
	public boolean equals(UsedLaptop obj) {
		
		return _price == obj._price && _brand.equals(obj._brand);
	}
}
