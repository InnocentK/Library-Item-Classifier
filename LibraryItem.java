
public class LibraryItem
{
    // Class Members
    private String call_No;
    private String title;
    private int pub_year;

    // Constructor
    public LibraryItem(String title, String call, int year)
    {
        this.title = title;
	this.pub_year = year;
	this.call_No = call;
    }

    // Method to return a formatted string with info on the item 
    // Incomplete
    public String toCollectionString(){
	String formatted = this.title + "(Call Number: " + call_No + "), first published in " + Integer.toString(pub_year);
	return formatted;
    }

    // Method to get an item's call number
    public String getCallNo(){
	return this.call_No;
    }
}