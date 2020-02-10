import java.util.ArrayList;
public class Library
{
    // Class Members
    private String name;
    private ArrayList<LibraryItem> collection; 
    private int collection_size;

    // Constructor
    public Library(String name)
    {
        this.name = name;
	this.collection = new ArrayList<LibraryItem>();
	this.collection.add(new LibraryItem("Junk", "N/A", 0));
    }

    // Method to add items to the library
    public void addItem(LibraryItem item){
	this.collection.add(item);
	this.collection_size++;
    }

    // Method to find items in the library
    public LibraryItem getItem(String call){

	// Loops through the entire collection
	for (LibraryItem item: this.collection){

	    // Found the Library Item
	    if( call.equals(item.getCallNo()) ){
		return item;
	    }
	}
	// If failed return 0th item which is junk
	return this.collection.get(0);
    }

    // Method to print out entire contents of the library
    public void printCollection(){
	System.out.println("The " + this.name + " Library Catalog");

	// Loops through the entire collection
	for (LibraryItem item: this.collection){

	    // First Entry is a dummy item used to check when incorrect call number
	    //  is searched for
	    if (item.getCallNo() == this.collection.get(0).getCallNo() ){}

	    else{
		// Calls toCollectionString() of LibraryItem
		System.out.println(item.toCollectionString());
	    }
	}
	System.out.println("\n");
    }
}