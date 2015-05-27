package Library;

import java.util.Scanner;

public class Customer implements Person {

	private long iD;
	private String fName;
	private String lName;
	private static Scanner yInput = new Scanner(System.in);
	private static Scanner wInput = new Scanner(System.in);
	private static Scanner cInput = new Scanner(System.in);
	
	@Override
	public long getID() {
		// Will return the ID
		long iD = yInput.nextLong();
		return iD;
		 
	}
	
	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		iD = id;
	}
	
	@Override
	public void setFName(String fname) {
		// TODO Auto-generated method stub
		fName = fname;
		
	}
	
	@Override
	public String getFName() {
		// TODO Auto-generated method stub
		String fName = wInput.nextLine();
		return fName;
	}
	
	@Override
	public void setLName(String lname) {
		// TODO Auto-generated method stub
		lName = lname;

	}
	
	@Override
	public String getLName() {
		// TODO Auto-generated method stub
		String lName = cInput.nextLine();
		return lName;
	}

	public void setID(String nextLine) {
		// TODO Auto-generated method stub
		
	}

	
	


}
