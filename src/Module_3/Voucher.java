package Module_3;

public class Voucher {
    private static int nextVoucherNumber;
    private static int nextCheckNumber;
    private static Voucher[] vouchers;
    
    private int _voucherNumber;
    private String _purchaseDate;
    private double _amount;
    private String _debitAccount;
    private String _vendor;
    private int _checkNumber;
    private String _paymentDate;

    public static void initialize(int firstVoucher, int firstCheck, int maxNumberOfVouchers) {
    	nextVoucherNumber = firstVoucher;
    	nextCheckNumber = firstCheck;
    	vouchers = new Voucher[maxNumberOfVouchers];
    }
    
    public Voucher(String purchaseDate, double amount, String debitAccount, String vendor) {
    	_purchaseDate = purchaseDate;
    	_amount = amount;
    	_debitAccount = debitAccount;
    	_vendor = vendor;
    	_voucherNumber = nextVoucherNumber;
    	nextVoucherNumber++;
    }
    
    public static void add(String purchaseDate, double amount, String debitAccount, String vendor) {
    	// 1. new Voucher
    	// 2. add new Voucher to vouchers
    	// 3. nextVoucherNumber
    }
    
    public void issueCheck() {};
    
    public static void printData() {
    	
    	for(var v : vouchers) 
    		System.out.println(v);
    };
    
    public static Voucher find(int voucherNumber) {

        return  null;
    }

}
