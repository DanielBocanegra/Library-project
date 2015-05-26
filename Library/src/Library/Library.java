package Library;

import java.util.Scanner;


public class Library {
	static int minCustomers = 10;
	static int lastCustomer = 0;
	
	static int maxBooks = 10;
	static int lastBook = 0;
	
	static Customer[] customer = new Customer[1];
    static Book[] books = new Book[maxBooks];
	static int answer = 0;
    
	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//Initialize the books
		
		for (int i = 0; i < books.length; i++)
			books[i] = new Book();
	
		//Add the Books
		addBooks();	

		for (int i = 0; i < books.length; i++ )
		{
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
			System.out.println("1 display books");
			System.out.println("2 checkout a book");
			System.out.println("3 checkin a book");
			System.out.println("4 add a customer");
			System.out.println("5 add books");
			answer = nInput.nextInt();
			
			if (answer == 1)
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
		System.out.println("Which book");
		String t = tInput.nextLine();
		System.out.println(lastBook);
		for (i = 0; i < lastBook; i++)
		{
			if (books[i].getTitle().toLowerCase().equals(t.toLowerCase()))
				return i;
			System.out.println(i);
		}
		return 0;
		
	}
	private static int addCustomer()
	{
		for (int c = 0;c < customer.length; c++)
		{
			customer[c] = new Customer();
			System.out.println("Enter your first name");
			customer[c].setFName(tInput.nextLine());
			System.out.println("Enter your last name");
			customer[c].setLName(tInput.nextLine());
			System.out.println("Enter your ID name");
			customer[c].setID(tInput.nextLine());
		 

		}
		return 0;	
	} 
	
	private static void checkout()
	{
		int bookI = findBook();
		if (bookI!=-1)
		{
			books[bookI].checkOut(1);
			System.out.println(books[bookI].getTitle() + " is now checked out");
		}
		else
			System.out.println("The book wasn't found.");
			
		
	}
	
	private static void checkin()
	{
		int bookI = findBook();
		if (bookI != lastBook)
		{
			books[bookI].CheckIn(1);
			System.out.println();
		}
		
		
	}
	
	private static void addBooks()
	{
		System.out.println("How many books do you want to enter?");
		int numBooks = nInput.nextInt();
		
		int b = 0;
		
		for (b = 0; b < books.length && !books[b].getTitle().equals(""); b++)
		{
			
		}
		lastBook = b;
		System.out.println(lastBook);
		
		for (int i = lastBook; i < numBooks+lastBook && i < maxBooks; i++ )
		{
			System.out.println("Enter a book name");
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
			System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor() + " " + books[i].getCheckedOut());
		}
		

	}
}

