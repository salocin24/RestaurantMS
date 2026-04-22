
public class Restaurant {
	int storeID;
	String address;
	String phoneNum;
	String areaCode;
	
	public Restaurant(int storeID, String address, String phoneNum, String areaCode) {
		this.storeID = storeID;
		this.address = address;
		this.phoneNum = phoneNum;
		this.areaCode = areaCode;
	}
	
	public int getStoreID() {return storeID;}
	public String getAddress() {return address;}
	public String getPhoneNum() {return phoneNum;}
	public String getAreaCode() {return areaCode;}
	
}
