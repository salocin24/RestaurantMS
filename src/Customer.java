
public class Customer {
	
	// the names for this stuff need to be updated
	
	private int ACCID;
	private String FNAME;
	private String LNAME;
	private String PHONENUM;
	private String PAYMENTINFO;
	private double LOYALTYDISCOUNT;
	
	public Customer(int ACCID, String FNAME, String LNAME, String PHONENUM, String PAYMENTINFO, double LOYALTYDISCOUNT) {
		this.ACCID = ACCID;
		this.FNAME = FNAME;
		this.LNAME = LNAME;
		this.PHONENUM = PHONENUM;
		this.PAYMENTINFO = PAYMENTINFO;
		this.LOYALTYDISCOUNT = LOYALTYDISCOUNT;
	}
}
