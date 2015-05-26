package Library;

public interface Item {

	// String callNumber
	
	public void setCallNumber(String callNum);
	public String getCallNumber();
	
	// boolean checkedOut
	
	public void setCheckedOut(boolean checked);
	public boolean getCheckedOut();
	public boolean checkOut(long custID);
	
	// boolean checkedIn
	
	public void setCheckedIn(boolean checked);
	public boolean getCheckedIn();
	public boolean CheckIn(long custID);
	
	// long customerID
	
	public void setCustomerID(long customerID);
	public long getCustomerID();

	
	
	
}

