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

public class Circle {
    public static void main(String[] args){

        MyCircle d1 = new MyCircle();
        d1.setRadius(44);
        d1.setIsFilled(true);

        d1.draw();
    }
}
