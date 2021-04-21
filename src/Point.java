
public class Point {
	
	private double _x = 0;
	private double _y = 0;

	public Point(double x, double y) {
		_x = x;
		_y = y;
	}
	
	public boolean equals(Point obj) {
		return _x == obj._x && _y == obj._y;
	}
}