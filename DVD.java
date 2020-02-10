public class DVD extends LibraryItem
{
    // Class Members
    private String director;
    private String screenwriter;
    private double run_time;
    private double watched;

    // Constructor
    public DVD(String title, String director, String writer, String call, int year, double length)
    {
	super(title, call, year);
        this.director = director;
	this.screenwriter = writer;
	this.run_time = length;
    }

    // Method to watch the dvd
    public boolean watch(double min2watch){

        // The DVD is only watched if request does not exceed remaining
        //  dvd running time
        if( (run_time - watched) >= min2watch){
            watched = watched + min2watch;
            return true;
        }
        return false;
    }

    // Method to format information on the book
    public String toCollectionString(){
        String formatted = super.toCollectionString() + " directed by " + this.director + " and written by " + this.screenwriter + ". Currently seen " + Double.toString(watched) + " of " + Double.toString(run_time) + " minutes.";
        return formatted;
    }

}
