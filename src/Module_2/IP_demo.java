package Module_2;

public class IP_demo {
	
	private String _dottedDecimal;
	private int _firstOctet, _secondOctet, _thirdOctet, _fourthOctet;
	
	public IP_demo(String ip) {
		_dottedDecimal = ip;
		
		char div = '.';
		String temp = ip + div;
		String octet = "";
		int i = 1;

		while (temp.indexOf(div) != -1) {
			
			octet = temp.substring(0, temp.indexOf(".") );
			temp = temp.substring(temp.indexOf(".") + 1);
			
			switch (i) {
			case 1: _firstOctet = Integer.parseInt(octet); break;
			case 2: _secondOctet = Integer.parseInt(octet); break;
			case 3: _thirdOctet = Integer.parseInt(octet); break;
			case 4: _fourthOctet = Integer.parseInt(octet); break;
			}
			
			i++;
		}
		
	}
	
	public String getDottedDecimal() {
		return _dottedDecimal;
	}
	
	public int getOctet(int index) { // 1, 2, 3, or 4 ||| 777
		
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
