package Module_2;

public class Person {
	
	private String _first;
	private String _last;
	
	private static int numOfPeople = 0;
	
	public Person() {
		_first = "John";
		_last = "Doe";
		numOfPeople++;
	};

	public Person(String first, String last) {
		_first = first;
		_last = last;
		numOfPeople++;
	}
	
	public void finalize() {
		numOfPeople--;
		System.err.println(" finalize() has been called: numOfPeople = " + numOfPeople);
	}
	
	
	public static void setNumOfPeople(int v) {
		numOfPeople = v;
	}
	
	
	public static int getNumOfPeople() {
		return numOfPeople;
	}
	
	public void setFirst(String newFirst) {
		_first = newFirst;
	}

	public void setLast(String newLast) {
		_last = newLast;
	}

	public Person printFullName() {
		
		System.out.println(_first + " " + _last);
		return this;
	}
}