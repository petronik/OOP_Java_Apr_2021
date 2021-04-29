package Module_2;


/*
Nickname Generator

Write a function, nicknameGenerator that takes a string name as an argument 
and returns the first 3 or 4 letters as a nickname.

If the 3rd letter is a consonant, return the first 3 letters.

nickname("Robert") //=> "Rob"
nickname("Kimberly") //=> "Kim"
nickname("Samantha") //=> "Sam"

If the 3rd letter is a vowel, return the first 4 letters.

nickname("Jeannie") //=> "Jean"
nickname("Douglas") //=> "Doug"
nickname("Gregory") //=> "Greg"
If the string is less than 4 characters, return "Error: Name too short".

Notes:
Vowels are "aeiou", so discount the letter "y".
Input will always be a string.
Input will always have the first letter capitalised and the rest lowercase (e.g. Sam).
The input can be modified

*/

public class _exercise_03 {
	
	public static String nickname (String name) {
		if(name.length() < 4 ) return "Error: Name too short";
		String vowels = "aeiou";
		if(vowels.indexOf(name.charAt(2)) == -1) {
			return name.substring(0, 3);
		}
		return name.substring(0, 4);
	}
	
	public static void main(String[] args) {

		String[] names = { "Gregory", "Douglas", "Jeannie", "Robert", "Kimberly", "Samantha", "Sam"};
		for(int i = 0; i < names.length(); i++){
			System.out.println(nickname(names[i]));
		}
	}

}
