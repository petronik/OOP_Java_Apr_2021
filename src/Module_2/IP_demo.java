package Module_2;

public class IP_demo {
	
	private String _dottedDecimal;
	private int _firstOctet = 1, _secondOctet = 2, _thirdOctet = 3, _fourthOctet = 4;
	
	public IP_demo(String ip) {
		_dottedDecimal = ip;
		
		// 
	}
	
	public String getDottedDecimal() {
		return _dottedDecimal;
	}
	
	public int getOctet(int index) { // 1, 2, 3, or 4 ||| 777
		
		// index => _?Octet
		// 1 => _firstOctet
		// 2 => _secondOctet
		// 3 => _thirdOctet 
		// 4 => _fourthOctet
		
		switch(index) {
		case 1: return _firstOctet;
		case 2: return _secondOctet;
		case 3: return _thirdOctet;
		case 4: return _fourthOctet;
		}
		System.err.println("Incorrect position of the octet: (1, 2, 3 or 4)");
		return -1;
	}
}
