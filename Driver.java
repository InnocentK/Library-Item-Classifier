
// Class used to test the other classes
public class Driver
{
    public static void main(String[] args)
    {
	System.out.println("Testing Cone Class");
	Cone c = new Cone(2.0, 3.0);
	System.out.print("Cone Volume: ");
	System.out.println(c.getVolume());
	System.out.print("Cone Surface Area: ");
	System.out.println(c.getSurfaceArea());

	// Tests from the Homework page
	System.out.println("\n\n Now Testing Library Class and sub-classes \n");
	Library mineL = new Library("Personal");

	Book hpss =  new Book("Harry Potter and the Sorcerer's Stone", "JK Rowling", "PZ7.R79835 Har 1998", 1998, 309);
	Book hpcs =  new Book("Harry Potter and the Chamber of Secrets", "JK Rowling", "PZ7.R79835 Haj 1999", 1999, 500);
	DVD hp_dvd = new DVD("Harry Potter and the the Sorcerer's Stone", "Christopher Columbus", "Steve Kloves", "CGD 2281-2289" , 2001, 152);

	mineL.addItem(hpss);
	mineL.addItem(hpcs);
	mineL.printCollection();

	mineL.addItem(hp_dvd);
	mineL.printCollection();

	Book book1 = (Book)mineL.getItem("PZ7.R79835 Har 1998");
	book1.readPages(12);
	mineL.printCollection();

	// Testing Reading more than book amount
	book1.readPages(412);
	mineL.printCollection();

	// Testing Reading the book fully
	book1.readPages(296);
	mineL.printCollection();

	// Testing Watching the movie
	DVD dvd1 = (DVD)mineL.getItem("CGD 2281-2289");
	dvd1.watch(26.5);
	mineL.printCollection();
	dvd1.watch(125.5);
	mineL.printCollection();
	dvd1.watch(0.5);
	mineL.printCollection();
    }
}