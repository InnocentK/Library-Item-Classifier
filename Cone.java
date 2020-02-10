public class Cone
{
    // Class Members
    private double radius;
    private double height;

    // Constructor
    public Cone(double r, double h)
    {
	this.radius = r;
	this.height = h;
    }

    // Method to calculate volume
    public double getVolume(){
	double vol = (1.0/3.0) * Math.PI * Math.pow(this.radius, 2.0) * this.height;
	return vol;
    }

    // Method to calculate surface area
    public double getSurfaceArea(){
	double r2 = Math.pow(this.radius, 2.0); 
	double square_root = Math.sqrt(r2 + (this.height * this.height));
	double sa = (Math.PI * r2) + (Math.PI * this.radius * square_root);
	return sa;
    }
}