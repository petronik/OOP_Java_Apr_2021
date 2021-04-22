import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		
		Point p1 = new Point(7, 9);
		Point p2 = new Point(7, 8);
		
		// System.out.println( p1 == p2  );
		System.out.println( p1.equals(p2) );
		
		System.out.println(Math.cos(Math.toRadians(30)));
		
		
		// Rectangle r = new Rectangle();
		
		Rectangle r1 = new Rectangle(5, 15, false, null);
		// r1.setHeight(5);
		// r1.setWidth(15);
		// r1.setIsFilled(true);
		
		r1.draw();
		
		// === Circle class testing ===
		
		Scanner stdIn = new Scanner(System.in);
    	int radius;
        System.out.print("What radius would you like for the circle? ");
        radius = stdIn.nextInt();

    	Circle circle = new Circle(radius); 
        circle.draw();
		
        String str1 = "Hello World!";
        String str2 = new String("Hello World!");
        char[] arrChar = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(arrChar);
        
        
        System.out.println(str1);		
        System.out.println(str2);		
        System.out.println(str3);	
		
		stdIn.close();
	}
}
