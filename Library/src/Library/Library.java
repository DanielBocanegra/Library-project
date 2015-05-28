package Library;

import java.util.Scanner;


public class Library {
	static int minCustomers = 1;	//Minimum number of customers that can be added
	static int lastCustomer = 0; 
	
	static int maxBooks = 10;		//The maximum number of books that can be entered into the library
	static int lastBook = 0;
	
	static Customer[] customer = new Customer[1];		//The array of customers that includes all their info
    static Book[] books = new Book[maxBooks];			//The array of books that includes all their info
	static int answer = 0;
    
	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//Initializes the books
		
		for (int i = 0; i < books.length; i++)
			books[i] = new Book();
	
		//Adds the Books
		addBooks();	

		for (int i = 0; i < books.length; i++ )
		{
			//Prints out the books title and author
			System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor());
		}
		
		//Add the Customers
		addCustomer();	
		for (int c =0; c < customer.length; c++ )
		{
			System.out.println();
			
		}
		
		
		//Menu
		menu();
		
	}
	
	private static void menu()
	{
		//The Main Menu
		do
		{
			System.out.println("What would you like to do?");
			System.out.println("1. display books");				//Displays all added books
			System.out.println("2. checkout a book");			//Allows the user to check out a book
			System.out.println("3. checkin a book");			//Allows the user to check in a book
			System.out.println("4. add a customer");			//Allows the user to add a customer if there is room
			System.out.println("5. add books");					//Allows the user to add a book if there is room
			answer = nInput.nextInt();
			
			if (answer == 1)						//This generates responses for the answer the user gives
			{
			System.out.println(lastBook);
			displayBooks();
			}
		else if (answer == 2)
			checkout();
		else if (answer == 3)
			checkin();
		else if (answer == 4)
			addCustomer();
		else if (answer == 5)
			addBooks();
		}while (answer != 0);
	}
	
	private static int findBook()
	{
		int i;
		System.out.println("Which book");		//asks for the title of the book
		String t = tInput.nextLine();
		System.out.println(lastBook);			//The system then searches for the title that matches it
		for (i = 0; i < lastBook; i++)
		{
			if (books[i].getTitle().toLowerCase().equals(t.toLowerCase()))
				return i;
			
		}
		return -1;
		
	}
	private static int addCustomer()
	{
		for (int c = 0;c < customer.length; c++) 
		{
			customer[c] = new Customer();
			System.out.println("Enter your first name");		//This gets the customers name and ID
			customer[c].setFName(tInput.nextLine());
			
			System.out.println("Enter your last name");
			customer[c].setLName(tInput.nextLine());
			
			System.out.println("Enter your ID number");
			customer[c].setID(tInput.nextLine());
			
		}
		return 0;	
	} 
	
	private static void checkout()
	{
		int bookI = findBook();
		if (bookI!=-1)
		{
			//This finds the book and checks to see if it is in the library
			
			books[bookI].checkOut(1);// books[bookI].checkOut(getCust());
			System.out.println(books[bookI].getTitle() + " is now checked out");
			
			//If the book is in the library and hasn't been checked out it will now show it being checked out
		}
		else
			System.out.println("The book wasn't found.");
					
	}
	
	private static void checkin()
	{
		int bookI = findBook();
		if (bookI != lastBook)
		{
			//This finds the book and checks to see if it is in the library
			
			books[bookI].CheckIn(1);
			System.out.println(books[bookI].getTitle() + " is now checked in");
			System.out.println("");
			
			//If the book is in the library it will be returned to the library
		}
		else
			System.out.println("The book wasn't found.");
		
	}
	//the method for adding books
	private static void addBooks()
	{
		
		System.out.println("How many books do you want to enter?");
		int numBooks = nInput.nextInt();
		//This gets the number of books that are being added
		int b = 0;
		
		for (b = 0; b < books.length && !books[b].getTitle().equals(""); b++)
		{
			
		}
		lastBook = b;
		System.out.println(lastBook); //Displays book info
		
		
		for (int i = lastBook; i < numBooks+lastBook && i < maxBooks; i++ )
		{
			System.out.println("Enter a book name");		//Enters and stores the books name and author
			books[i].setTitle(tInput.nextLine());
			System.out.println("the Author?");
			books[i].setAuthor(tInput.nextLine());
			
		}
		lastBook = b+numBooks;

	}
	
	private static void displayBooks()
	{
		for (int i = 0; i < lastBook; i++ )
		{
			//Displays the list of book and displays true if they are checked out and false if they are not
			
			System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor() + " " + books[i].getCheckedOut());
			System.out.println(" ");
		}
		

	}
}

