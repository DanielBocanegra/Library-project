package Library;

import java.util.Scanner;


public class Library {
	static int minCustomers = 10;
    static Book[] books = new Book[10];
	
	//Create a scanner object each for text and numbers
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//Add the books
		addBooks();
		
		for (int i = 0; i < books.length; i++ )
		{
			System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor());
		}
		
		/*do 
		{
		System.out.println("What is the maximum amount of customers you expect?");
		} while (!(Integer.parseInt(tInput.nextLine())>=minCustomers));
		*/

		
		
	}
	
	private static int addCustomer()
	{
		
		
		
		return 0;
	} 
	
	private static void addBooks()
	{
		for (int i = 0; i < books.length; i++ )
		{
			books[i] = new Book();
			System.out.println("Enter a book name");
			books[i].setTitle(tInput.nextLine());
			System.out.println("the Author?");
			books[i].setAuthor(tInput.nextLine());
			
		}
		

	}

}
