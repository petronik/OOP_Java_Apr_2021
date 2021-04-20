import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
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
        char[] arrChar = {'H', 'e', 'l', 'l', '0'};
        String str3 = new String(arrChar);
        
        
        System.out.println(str1);		
        System.out.println(str2);		
        System.out.println(str3);		
	}
}
