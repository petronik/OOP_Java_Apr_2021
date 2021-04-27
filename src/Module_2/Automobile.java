package Module_2;

import java.util.Scanner;

public class Automobile {
	private String _color = "";
	private String _model = "";

	private static Scanner _sn = new Scanner(System.in);
	
	public Automobile() {}
	
	public Automobile(String color, String model) {
		_color = color;
		_model = model;
	}
	
	public void setMake() {
		
		char input;
		
		while(true) {
			System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): "); // book
			input = _sn.next().charAt(0);
			
			if(input == 'b' || input == 'c' || input == 'p')
				break;
			else
				System.out.println("The only valid selections are 'b', 'c', or 'p'");
		}
		
		switch(input) {
		case 'b': _model = "Buick"; break;
		case 'c': _model = "Chevrolet"; break;
		case 'p': _model = "Pontiac"; break; 
		// default: _model = "";
		}
	}
	
	public void setColor() {
		/**/
	}
	
	public void printMake() {
		System.out.println(_model);
	}
	
	public void printColor() {
		System.out.println(_color);
	}
	
	
}
