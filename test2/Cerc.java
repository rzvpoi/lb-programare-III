package test2;

public class Cerc extends Punct {

    public int raza;

    public Cerc(int X, int Y, int raza) {
        super(X, Y);
        this.raza = raza;
    }

    public int arie(int raza){
        int arie=0;
        double a = 2*Math.PI*raza;
        arie = (int)a;
        afisare(arie);
        return arie;
    }

    public void afisare(int arie){
        System.out.println(arie);
    }
    
}
