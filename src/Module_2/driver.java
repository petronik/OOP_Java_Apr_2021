package Module_2;

public class driver {

	public static void main(String[] args) {
		
		
		IP_demo ip = new IP_demo("216.27.6.136");
		
		System.out.println(ip.getOctet(1));
		System.out.println(ip.getOctet(2));
		System.out.println(ip.getOctet(3));
		System.out.println(ip.getOctet(4));
		
		
		
		System.out.println("=============================================================");
		
		Laptop laptop1 = new Laptop(2000, "MacBook MegaPro 2021");
		Laptop laptop2 = new Laptop(150, "Noname - 123");
		
		System.out.println(laptop1);
		System.out.println(laptop2);
		
		// laptop1.swap(laptop2);
		
		System.out.println(laptop1);
		System.out.println(laptop2);
		
		laptop1 = null;
		laptop2 = null;
		
		System.gc();
		
		// ===========================================================================
		
		
		
		
		
		
		
		/*
		
		
		Laptop lt1 = new Laptop(800.55, "HP-1234");
		
		
		
		
		//Laptop lt2 = lt1; !!!!!!!
		
		
		
		
		// lt2 => lt2.equals(lt1)
		Laptop lt2 = lt1.makeCopy();
		
		// System.err.println( lt2.equals(lt1) );
		
		lt2.setBrand("Lenovo-78911");
		// lt2 = new Laptop(500, "Lenovo-78911");
		
		
		System.out.println(lt1);
		System.out.println(lt2);
		
		String str1 = new String("Hello Java");
		String str2 = str1;
		
		str2 = "Hello World";
		
		System.out.println(str1);
		System.out.println(str2);
		*/
	}

}
