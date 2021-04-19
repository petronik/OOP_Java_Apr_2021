
class Rectangle {
	
	private int _height;
	private int _width;
	private boolean _filled;
	private double _area;
	private String _color = "red";
	
	public void setHeight(int value) {
		
		if(value < 0) {
			System.err.println("Incorrect value for Height");
		}
		else {
			_height = value;
		}
	}
	
	public int getHeight() {
		return _height;
	}
	
	public boolean getIsFilled() {
		return _filled;
	}
	
	public String getColor() {
		return _color;
	}
	
	public double getArea() {
		return _area;
	}
}

public class Intro {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		// r1.height = -77;
		r1.setHeight(-77);
		System.out.println( "Height = " + r1.getHeight() );
		System.out.println( "Filled = " + r1.getIsFilled() );
		System.out.println( "Color = " + r1.getColor() );
		System.out.println( "Area = " + r1.getArea() );
		// r1.width = -22;
		
		// Rectangle #1
		int height1 = 5;
		int width1 = 15;
		boolean filled1 = true;
		//Rectangle(height1, width1, filled1);
	
		// Rectangle #2
		int height2 = 7;
		int width2 = 21;
		boolean filled2 = false;
		//Rectangle(height2, width2, filled2);
		
		// Rectangle #3
		int height3 = 9;
		int width3 = 32;
		boolean filled3 = true;
		//Rectangle(9, 32, true);
	}
	
	public static void Rectangle(int h, int w, boolean isFilled) {
		
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {

				boolean b = !(y == 0 || y == h - 1 || x == 0 || x == w - 1) && !isFilled;
				System.out.print( b ? ' ' : '*' );
			}
			System.out.println();
		}
	}

}
