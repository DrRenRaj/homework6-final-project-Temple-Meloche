package hw6;

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
	book toString()
	{
		if(this.isAvailable == true)
		{
			System.out.println(this.isbn + ", " + this.tital + " by " + this.author + " is available.");
		} else {
			System.out.println(this.isbn + ", " + this.tital + " by " + this.author + " is not available.");
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

	public void setAuthor(String newAuthor()
	{
		this.author = newAuthor;
	}
	
	// isbn getter and setter //
	public Strint getIsbn()
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
		this.books = new ArrayList<book>;
	}

	public void addBook(book item)
	{
		this.books.add(item);
	}

	public void removeBook(String isbn)
	{
		this.books.remove(
	
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
	}

}
