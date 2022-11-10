public class Triunghi extends FormaGeo{
    double lat, intaltime;

    Triunghi(double lat, double intaltime, String nume)
    {
        super(nume);
        this.lat = lat;
        this.intaltime = intaltime;
    }

    public double arie()
	 {
		 return (lat*intaltime)/2;
	 }

    
}
