package Module_2;

public class Laptop {

	private double _price;
	private String _brand;

	private final double k = 1.5;

	public Laptop() {
	}

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

		Laptop newLaptop = new Laptop(this._price / k, this._brand);
		// newLaptop._brand = _brand;
		// newLaptop._price = _price;

		return newLaptop;
	}

	public void swap(Laptop toSwap) {

		// e1 => this (laptop1)
		// e2 => toSwap
		// temp -> e1

		Laptop temp = new Laptop(_price / k, _brand); // this.makeCopy()

		// e1 = e2
		_price = toSwap._price;
		_brand = toSwap._brand;
		
		// e2 = temp
		toSwap._price = temp._price;
		toSwap._brand = temp._brand;
	}
	
	
	public void finalize() {
		_brand = null;
		System.err.println(" obj is garbage collcected ");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return _brand + " $" + _price;
	}

}
