public class Nikname {
    public static String nickname (String name) {
        
		String nickname1 = name.substring(0, 3);
         char ch = nickname1.charAt(0);

		return Character.toUpperCase(ch) + nickname1.substring(1);
	}
	
	public static void main(String[] args) {

	System.out.println(nickname("samantha"));
	}
}
