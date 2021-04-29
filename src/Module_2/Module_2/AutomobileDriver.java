package Module_2;

import java.util.Scanner;

public class AutomobileDriver {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int counter = 0;
        Automobile car;
        System.out.print("How many cars do you want to consider? ");
        counter = sn.nextInt();
        for (int i = 0; i < counter; i++) {
            car = new Automobile();
            car.setMake();
            car.setColor();
            car.printMake().printColor();
        }
        sn.close();
    }
}
