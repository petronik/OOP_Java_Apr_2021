package Module_2;

public class PersonDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println(Person.getNumOfPeople());
		
		
		Person person1 = new Person();
		System.out.println(Person.getNumOfPeople());
		Person person2 = new Person("Matt", "Thebo");
		System.out.println(Person.getNumOfPeople());
		
		Person person3 = new Person();
		
		System.out.println(Person.getNumOfPeople());
		
		Person person4 = new Person();
		Person person5 = new Person();
		Person person6 = new Person();
		Person person7 = new Person();
		System.out.println(Person.getNumOfPeople());
		
		// person7.finalize();
		person7 = null;
		System.gc();
		
		
		//Person person8 = new Person();
		
		Thread.sleep(5000);
		
		System.out.println("count = " + Person.getNumOfPeople());
	}

}
