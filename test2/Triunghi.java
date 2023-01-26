package test2;

public class Triunghi extends Punct {

    Punct lat1;
    Punct lat2;
    Punct lat3;


    public Triunghi(int X,int Y, Punct lat1, Punct lat2, Punct lat3) {
        super(X, Y);
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
    }
    

    public int arie(Punct lat1, Punct lat2, Punct lat3){
        int arie = 0;

        arie = ((lat1.X*lat3.Y - lat1.X*lat2.Y + lat2.X*lat1.Y - lat3.X*lat1.Y + lat3.X*lat2.Y - lat2.X*lat3.Y)/2);

        afisare(arie);
        return arie;
    }

    public void afisare(int arie){
        System.out.println(arie);
    }
    


}
