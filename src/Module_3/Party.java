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
		
		if(isOnList(name)) {
			System.out.println(name + "  is already on the guest list.");
			return;
		}
		
		_guests[_actualGuestsNumber] = name;
		_actualGuestsNumber++;
	}
	
	public boolean isOnList(String name) {
        
		for (int i = 0; i < _guests.length; i++){
			// if(name.equals(_guests[i])){
            if(_guests[i] != null && _guests[i].equals(name)){
                return true;
            }
        }
        
        return false;
	}
	
	public void printParty()  {
		System.out.println("\nGuest list for " + _host + "'s party:");
		for(String g : _guests) {
			if(g != null)
				System.out.println(g);
		}
	}
}
