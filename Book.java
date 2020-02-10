public class Book extends LibraryItem
{
    // Class Members
    private String author;
    private int length;
    private int read;

    // Constructor
    public Book(String title, String author, String call, int year, int num_pages)
    {
	super(title, call, year);
        this.author = author;
	this.length = num_pages;
	this.read = 1;
    }

    // Method to read pages in the book
    public boolean readPages(int pages2read){

	// Pages are only read if request does not exceed remaining
	//  book length
	if( (length - read) >= pages2read){
	    read = read + pages2read;
	    return true;
	}
	return false;
    }

    // Method to format information on the book
    public String toCollectionString(){
	String formatted = super.toCollectionString() + " written by " + this.author + ". Currently on page " + Integer.toString(read) + " of " + Integer.toString(length);
	return formatted;
    }
}
