
package lab8.modificatoriAcces.src.main.java.package_01;

/**
 *
 * @author Daniel
 */


public class ClasaI {
    //Clasa I - aflata in package_01 - cu modificator public
    public int x;       //modificator public - accesibil oriunde
    private int y;      //modificator private - accesibil numai in aceasta clasa
    protected int z;    //modificator protected - accesibil numai din acelasi package
    int t;              //fara modificator - default - accesibil numai din acelasi package
    
    //protected si default difera cand vine vorba de relatii de mostenire interclase
    
    void f(){
        x = 1;
        y = 1;
        z = 1;
        t = 1;
    }
}
        
class ClasaIa{
    //Clasa Ia - aflata in package_01 - fara modificator de acces
    public int xA;       //modificator public - accesibil oriunde
    private int yA;      //modificator private - accesibil numai in aceasta clasa
    protected int zA;    //modificator protected - accesibil numai din acelasi package
    int tA;              //fara modificator - default - accesibil numai din acelasi package
    
    void f(){
        xA = 1;
        yA = 1;
        zA = 1;
        tA = 1;
    }
    
}


