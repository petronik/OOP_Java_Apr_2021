package ClassMaker.OOP_Java_Apr_2021.src;


class MyCircle {
    private double _radius;
    private boolean _filled;

    public void setIsFilled(boolean value){_filled = value;}
    public void setRadius(double value) {
        if(value <= 0) {
            System.err.println("Incorrect value. Please enter value greater then 0.");
        }else{
            _radius = value;
        }
    }
    public boolean getIsFilled() {return _filled;}
    public double getArea(){return Math.PI * Math.pow(_radius, 2);}

    public void draw() {
        for (double y = -_radius; y <= _radius; y += 3) {
			for (double x = -_radius; x <= _radius; ++x) {
				
				if(y * y + x * x <= _radius * _radius)
					System.out.print("*");
				else
					System.out.print(' ');
			}
			System.out.println();
		}
        System.out.println(" Circle area = " + getArea());
    }
}

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

