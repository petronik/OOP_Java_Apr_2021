package Module_2;
/*
 Write function alternateCase which switch every letter in string from upper to lower
 and from lower to upper.

 E.g: Hello World -> hELLO wORLD
*/

public class _exercise_06 {
	static String alternateCase(final String str) {
		String _arr = str.trim();
		String res = "";
		for (int i = 0; i < _arr.length(); i++) {
			char ch = _arr.charAt(i);
			if(Character.isUpperCase(ch)){
				res += Character.toLowerCase(ch);
			}else{
				res += Character.toUpperCase(ch);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.err.println(
				alternateCase("Hello World!") // "hELLO wORLD!"
				);
	}
}
