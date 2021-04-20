
/**
 * Ken DeWitt
 * 
 * my example of circle
 */

class Point {
   private double _x = 0;
   private double _y = 0;
   
   public Point(double x, double y) {
	   _x = x; _y = y;
   }
}

public class Circle {
	
   private int _radius;
   private Point _center;
   
   public Circle() {}
   
   public Circle(int raduis) {
	   _radius = raduis;
   }
   
   public Circle(int raduis, double x, double y) {
	   _radius = raduis;
	   _center = new Point(x, y);
   }
   public void setRadius(int value) {

        // if (value < 0 || value > 9) {
        // System.out.println();
        // } else {
        _radius = value;
        // }

    }

    public int getRadius() {
        return _radius;
    }

    public void draw() {
        for (int y = -_radius; y <= _radius; y += 2) {
            for (int x = -_radius; x <= _radius; ++x) {

                if (y * y + x * x <= _radius * _radius)
                    System.out.print("*");
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}

