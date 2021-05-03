package Module_2;

/*
Simple string reversal

We are going to reverse a string while maintaining the spaces (if any) in their original place.

For example:

solve("our code") = "edo cruo"

edoc ruo
edo cruo


-- Normal reversal without spaces is "edocruo". 
-- However, there is a space at index 3, so the string becomes "edo cruo"

solve("your code rocks") = "skco redo cruoy". 
solve("your code") = "edoc ruoy"

More examples:

"rx hslqizkd mberwbhu haokwsig gb gomxexzeaumtci rwunccbadm ndcvix quyr pyiu vj vm mpkauqclpa sixztujr" => 
"rj utzxisap lcquakpm mvjvuiyp ry uqxivcdnmdabcc nuwrictmua ezxexm ogbg gisw ko ah uhbwrebmdk ziqlshxr"

"iqjp gymxpbcl orzwfvqw ij ewmvzavhhv pdnsoikwtcimubenfr tavg rw evej yr frngyl mbrvulcn nc momtozbqhz chysdm oitsev sfxbjc mi yo bc gqqvvvmjsm ldts" => 
"stdl msjmvvvq qgcboyim cj bxfsvestio mdsyhczhqbzotmomcn nclu vr bmly gn rfryje vewrgvat rf nebumictwk iosndp vhhvaz vmweji wq vf wz rolcbpxmyg pjqi"


"sfukrt fmagstypqt jpdf ju ih vv hafcao mr zc ce" => 
"ecczrm oacfahvvhi ujfd pj tq py tsgamf tr ku fs"


Good luck!

*/


public class _exercise_05 {
	
	public static String solve(String str) {
		String _myString = str;
		String res = _myString.reverse();

		return res;
	}

	public static void main(String[] args) {
		System.out.println("Hello my World");
	}
}
