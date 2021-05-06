package Module_3;

import java.util.Scanner;

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
    
    private static Scanner _sn = new Scanner(System.in);

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
    	Voucher newVoucher = new Voucher(purchaseDate, amount, debitAccount, vendor);
    	
    	// 2. add new Voucher to vouchers
    	int minIndex = -1;
    	
    	for (int i = 0; i < vouchers.length; i++) {
			if(vouchers[i] == null) {
				minIndex = i;
				break;
			}
		}
    	// 3. check for -1
    	vouchers[minIndex] = newVoucher;
    }
    
    public static void printData() {
    	
    	for(var v : vouchers)  {
    		if(v != null)
    			System.out.println("voucher #" + v._voucherNumber + " date: " + v._purchaseDate);
    		else
    			System.out.println("NULL");
    	}
    };
    
    public static void issueCheck() {
    	
    	int vn = 0;
    	System.out.print("Enter number of voucher to pay: ");
    	vn = _sn.nextInt();
    	
    	Voucher cv = find(vn);
    	
    	if(cv == null)
    		System.err.println("No vouchers have that number.");
    };
    
    public static Voucher find(int voucherNumber) {
    	
    	for( Voucher v : vouchers  ) {
    		if(v._voucherNumber == voucherNumber) {
    			return v;
    		}
    	}
    	
        return  null;
    }

}
