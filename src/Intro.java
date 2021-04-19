
class Rectangle {
	
	private int _height;
	private int _width;
	private boolean _filled;
	private double _area;
	private String _color = "white";
	
	public void setWidth(int value) {
		
		if(value < 0) {
			System.err.println("Incorrect value for Height");
		}
		else {
			_width = value;
		}
	}
	
	public int getWidth() {
		return _width;
	}
	
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
	
	public void setIsFilled(boolean value) {
		_filled = value;
	}
	
	
	public String getColor() {
		return _color;
	}
	
	public double getArea() {
		return _area;
	}
	
	public void draw() {
		
		for (int y = 0; y < _height; y++) {
			for (int x = 0; x < _width; x++) {

				boolean b = 
						!(y == 0 || y == _height - 1 || x == 0 || x == _width - 1) 
						&& !_filled;
				System.out.print( b ? ' ' : '*' );
			}
			System.out.println();
		}
	}
}

public class Intro {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setHeight(5);
		r1.setWidth(15);
		r1.setIsFilled(true);
		
		r1.draw();
		
		// Rectangle(r1.getHeight(), r1.getWidth(), r1.getIsFilled());
		// Rectangle(r1);
	
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
	
	public static void Rectangle(Rectangle r) {
		
		int h = r.getHeight();
		int w = r.getWidth();
		boolean isFilled = r.getIsFilled();
		
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {

				boolean b = !(y == 0 || y == h - 1 || x == 0 || x == w - 1) && !isFilled;
				System.out.print( b ? ' ' : '*' );
			}
			System.out.println();
		}
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
