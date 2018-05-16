//CO24557 Assignment 2 - problem 3 
//Book class used to display book information

class Book
{
	private String bookName,ISBN,authorName,publisher;

	public Book(String bookName, String authorName, String publisher, String ISBN)
	{
		this.bookName = bookName;
		this.ISBN = ISBN;
		this.authorName = authorName;
		this.publisher = publisher;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}

	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}

	
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}

	public String getBookName() { return bookName; }
	public String getAuthorName() { return authorName; }
	public String getISBN() { return ISBN; }
	public String getPublisher() { return publisher; }

	public String getBookInfo()
	{
		String bookInfo = "\n Book Information: "+bookName+" by "+authorName+", "+publisher+"\n\t\t  (ISBN: "+ISBN+")";
		return bookInfo;	
	}
}

public class BookTester
{
	public static void main(String[] args)
	{
		Book b1 = new Book("Software Enginnering","Roger S. Pressman","McGraw Hill publications","12-345-678-9");
		Book b2 = new Book("Core Java: Volume 1, Fundamentals","Timothy Budd","Wesley publications","11-222-333-4"); 
		Book b3 = new Book("Analog and Digital Communication Systems","Singh and Sapre","Oxford Press","98-765-432-1");
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());

		System.out.println("\n Updating ISBN for book-2 and author name for book-3....\n");
		b2.setISBN("12-765-678-1");
		b3.setAuthorName("Singh R.P. and Sapre S.D.");
		System.out.println("\n Updated! \n"+b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
	}
}
