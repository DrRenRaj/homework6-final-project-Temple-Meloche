package hw6;
import java.util.*;

//Add other classes here or separate java files in same package
class book {
	// book variables //
	String tital;
	String author;
	String isbn;
	boolean isAvailable;

	// book constructor //
	book(String tital, String author, String isbn, boolean isAvalable)
	{
		this.tital = tital;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = isAvalable;
	}

	// book print output //
	public String toString()
	{
		if(this.isAvailable == true)
		{
			return this.isbn + ", " + this.tital + " by " + this.author + " is available.";
		} else {
			return this.isbn + ", " + this.tital + " by " + this.author + " is not available.";
		}
	}
	
	// tital getter and setter //
	public String getTital()
	{
		return this.tital;
	}

	public void setTital(String newTital)
	{
		this.tital = newTital;
	}
	
	// author getter and setter //
	public String getAuthor()
	{
		return this.author;
	}

	public void setAuthor(String newAuthor)
	{
		this.author = newAuthor;
	}
	
	// isbn getter and setter //
	public String getIsbn()
	{
		return this.isbn;
	}

	public void setIsbn(String newIsbn)
	{
		this.isbn = newIsbn;
	}
	
	// isAvailable getter and setter //
	public boolean getIsAvailable()
	{
		return this.isAvailable;
	}

	public void setIsAvailable(boolean newIsAvailable)
	{
		this.isAvailable = newIsAvailable;
	}
}

class library {
	// library varables //
	ArrayList<book> books;

	// library constructor //
	library()
	{
		this.books = new ArrayList<book>();
	}

	public void addBook(String tital, String author, String isbn)
	{
		book item = new book(tital, author, isbn, true);
		this.books.add(item);
	}
	
	public void addBook(book item)
	{
		this.books.add(item);
	}

	public void removeBook(String isbn)
	{
		for(int i = 0; i < this.books.size(); i++)
		{
			if(this.books.get(i).getIsbn().equals(isbn) == true)
			{
				this.books.remove(i);
			}
		}
	}
	
	public void displayAllBooks()
	{
		for(int i = 0; i < this.books.size(); i++)
		{
			System.out.println(this.books.get(i));
		}
	}
	
	public void searchByTital(String tital)
	{
		for(int i = 0; i < this.books.size(); i++)
		{
			if(this.books.get(i).getTital().equals(tital) == true)
			{
				System.out.println("this is your Book " + this.books.get(i));
			}
		}
	}
	
	public void searchByAuthor(String author)
	{
		for(int i = 0; i < this.books.size(); i++)
		{
			if(this.books.get(i).getTital().equals(author) == true)
			{
				System.out.println("this is your Book " + this.books.get(i));
			}
		}
	}
	
	public void checkOutBook(String isbn)
	{
		for(int i = 0; i < this.books.size(); i++)
		{
			if(this.books.get(i).getIsbn().equals(isbn) == true)
			{
				System.out.println("Book has been checked out");
				this.books.get(i).setIsAvailable(false);
			} else if (this.books.get(i).getIsbn().equals(isbn) == false) {
				System.out.println("This book has is not available");
			}
		}
	}
	
	public void returnBook(String isbn)
	{
		for(int i = 0; i < this.books.size(); i++)
		{
			if(this.books.get(i).getIsbn().equals(isbn) == false)
			{
				System.out.println("Book has been returned");
				this.books.get(i).setIsAvailable(true);
			} else if (this.books.get(i).getIsbn().equals(isbn) == false) {
				System.out.println("This book has not been Checked out");
			}
		}
	}
	
	
}

public class Main {

	public static void main(String[] args) {
				
		/* Add your Menu Here
		 * 1. Add Book
		   2. Remove Book
		   3. Display All Books
		   4. Search by Title
		   5. Search by Author
		   6. Check Out Book
		   7. Return Book
		   8. Exit

		 */
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Please choose a mode for the librariy");
		
		library DenverPublic = new library();
		book x = new book("x", "Temple", "1111", true);
		book y = new book("y", "Temple", "2222", true);
		book z = new book("z", "Temple", "3333", true);
		
		DenverPublic.addBook(x);
		DenverPublic.addBook(y);
		DenverPublic.addBook(z);
		
		int run = 0;
		
		while(run == 0)
		{
		
		System.out.println("1. Add Book");
		System.out.println("2. Remove Book");
		System.out.println("3. Display All Books");
		System.out.println("4. Search by Tital");
		System.out.println("5. Search by Author");
		System.out.println("6. Check Out Book");
		System.out.println("7. Return Book");
		System.out.println("8. Exit");
		int mode = sca.nextInt();
		
			switch(mode)
			{
				case 1:
						System.out.println("What is the books tital");
						String tital = sca.next();
						System.out.println("who is the books author");
						String author = sca.next();
						System.out.println("What is the books isbn number");
						String isbn = sca.next();
						DenverPublic.addBook(tital, author, isbn);
						System.out.println();
					break;
				case 2:
						System.out.println("What is the isbn number of the book would you like to remove");
						String removeIsbn = sca.next();
						DenverPublic.removeBook(removeIsbn);
						System.out.println();
					break;
				case 3:
						DenverPublic.displayAllBooks();
						System.out.println();
					break;
				case 4:
						System.out.println("What is the books tital");
						String lookTital = sca.next();
						DenverPublic.searchByTital(lookTital);
						System.out.println();
					break;
				case 5:
						System.out.println("Who is the books author");
						String lookAuthor = sca.next();
						DenverPublic.searchByAuthor(lookAuthor);
						System.out.println();
					break;
				case 6:
						System.out.println("What is the isbn number of the book you are checking out");
						String checkOutIsbn = sca.next();
						DenverPublic.checkOutBook(checkOutIsbn);
						System.out.println();
					break;
				case 7:
						System.out.println("What is the isbn number of the book you are returning");
						String returnIsbn = sca.next();
						DenverPublic.returnBook(returnIsbn);
						System.out.println();
					break;
				case 8:
						System.out.println("Ending program");
						run = 1;
						System.out.println();
					break;
				default:
					System.out.println("That is not a mode");
					System.out.println();
					break;
			}
		}
	}

}
