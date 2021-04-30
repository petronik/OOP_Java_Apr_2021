package Module_2;

/*
See the pattern below:

initials('star wars') => returns S.Wars 
initials('Barack Hussain obama') => returns B.H.Obama 


More tests:

David alice isabella pedro lucas diaz -> D.A.I.P.L.Diaz

Matheus baker -> M.Baker

James daniel Gonzalez -> J.D.Gonzalez

bernardo wright -> B.Wright

luiza Ygritte gabriel Olivia zoe valentina Butler -> L.Y.G.O.Z.V.Butler

Charlotte Rafael Liam Emma cooper -> C.R.L.E.Cooper

michael Bernardo Jacob Alice Jacob laura eduarda bailey -> M.B.J.A.J.L.E.Bailey

miguel Alice Charlotte liam olivia Charlotte Valentina Lewis -> M.A.C.L.O.C.V.Lewis

eduarda Matheus emily Pedro Ava patterson -> E.M.E.P.A.Patterson

Zoe Jacob Matheus laura rivera -> Z.J.M.L.Rivera

arthur madison anderson -> A.M.Anderson

*/

public class _exercise_04 {
	public static String initials(String name) {
		
		String[] arr = name.split(" ");
		String res = "";
		
		for (int i = 0; i < arr.length; i++) {
			// System.out.print( arr[i] + "-" );
			char ch = arr[i].charAt(0);
			
			if( i !=  arr.length - 1) {
				res += Character.toUpperCase( ch ) + ".";
			}
			else {
				res += capitalize(arr[i]);
			}
		}
		
		return res;
	}

	public static String capitalize(String value) {
		return Character.toUpperCase(value.charAt(0)) + value.substring(1).toLowerCase();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println(
				initials("miguel Alice Charlotte liam olivia Charlotte Valentina Lewis")
				);
	}
}
