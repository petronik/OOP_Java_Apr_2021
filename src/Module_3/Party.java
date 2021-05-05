package Module_3;

public class Party {
	
	private String[] _guests;
	private String _host;
	private int _actualGuestsNumber = 0; 
	
	private int _maxGuestsNumber; 
	
	public Party(int number, String name) {
		_host = name;
		_maxGuestsNumber = number;
		_guests = new String[_maxGuestsNumber];
	}
	
	public void addGuest(String name) {
		
		if( _actualGuestsNumber == _maxGuestsNumber ) {
			System.out.println(name + " cannot come to the party. The guest list is full.");
			return;
		}
		_guests[_actualGuestsNumber] = name;
		_actualGuestsNumber++;
	}
	
	public boolean isOnList(String name) {
		
		return false;
	}
	
	public void printParty()  {
		
		for(String g : _guests) {
			if(g != null)
				System.out.println(g);
		}
	}
}
