import java.util.Scanner;

public class MapleTreeDriver {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		String userInput = "";
		MapleTree mp = new MapleTree();
		
		System.out.print("Enter plant date (dd/mm/yyyy): ");
		userInput = sn.nextLine();
		mp.plant(userInput);
		
		System.out.print("Enter germination date (dd/mm/yyyy): ");
		userInput = sn.nextLine();
		mp.germinate(userInput);	
		
		System.out.print("Enter observed height in meters: ");
		userInput = sn.nextLine();
		mp.height( Double.parseDouble(userInput) );
		
		mp.dumpData();
		
	}

}
