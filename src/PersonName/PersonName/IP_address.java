package PersonName;

public class IP_address {
    private String _dottedDecimal;
    private int _firstOctet, _secondOctet, _thirdOctet, _fourthOctet;

    public IP_address(String ip) {
        _dottedDecimal = ip;
        char divider = '.';
        String temp = ip + divider;
        String octet = "";
        int i = 1;
        while (temp.indexOf(divider) != -1){
            octet = temp.substring(0, temp.indexOf("."));
            temp = temp.substring(temp.indexOf(".") + 1);
            switch(i) {
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
    public int getOctet(int index) {
        switch(index) {
            case 1: return _firstOctet;
            case 2: return _secondOctet;
            case 3: return _thirdOctet;
            case 4: return _fourthOctet;
            }
        return -1;
    }
}
