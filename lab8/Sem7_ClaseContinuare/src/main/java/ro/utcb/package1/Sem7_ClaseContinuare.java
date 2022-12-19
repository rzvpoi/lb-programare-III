/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//trebuie sa fie prima linie necomentata din fisier
package lab8.Sem7_ClaseContinuare.src.main.java.ro.utcb.package1;

/**
 *
 * @author Daniel
 */

class Statice{
/*  CAMPURI STATICE
    campul static poate fi apelat fara instantiere
    un camp static nu se mai multiplica - exista un singur exemplar in memorie
    campul static este vizibil tuturor instantelor clasei si poate fi modificat
        de oricare din ele 
    exemple folosire:   ca o variabila globala
                        ca o constanta (cu calificatorul final)
*/
    public static int x = 0;        //camp static
    public int y;                   //camp de instanta - nu poate fi apelata fara o instanta
    public final static int CT = 3; //constante
    

/*  METODE STATICE
    pot fi apelate fara instantiere
    NU pot accesa membri non statici (atribute/metode)
    NU pot prelua valoarea pentru this
*/
    public static void modificX (int val){
        x = val;
    }
    
    public static void resetareX (){
        modificX(0);
    }

/*  BLOCURI DE INITIALIZARE STATICE
    executa cod la incarcarea clasei 
    in cadrul blocurilor pot fi accesati membrii statici (nu si cei de instanta)
    campurile statice trebuie declarate inainte de a fi accesate in bloc
    blocurile se executa in ordinea in care apar
    
*/
    static{
        System.out.println("S-a incarcat clasa Statice -> x=25");
        x=25;
        modificX(25);
        //y = 25; - eroare
        z = 255; 
        //System.out.println("Valoarea lui z = " + z); - eroare
    }
    
    public static int z = -25;
    
    static {
        System.out.println("Valoarea lui z = " + z);
    }
    
}


enum Anotimp{PRIMAVARA, VARA, TOAMNA, IARNA};
/*  ENUM - Date enumerate
    set de date discret, finit, cunoscuta inca de la compilare
    poate fi declarat in afara sau in interiorului unei clase insa NU in metode
    un enum - o clasa care are doar instantele declarate in interiorul ei
*/







public class Sem7_ClaseContinuare {

    public static void main(String[] args) {
        System.out.println("\n=====================================\n");
        System.out.println("Campuri, blocuri si metode statice. \n");
        
        //apelare fara instantiere - NumeClasa.NumeCamp
        System.out.println("Campul static (x) al clasei Statice are valoarea: " 
                + Statice.x + "\n");
        System.out.println("Constanta clasei Statice are valoarea: " 
                + Statice.CT + "\n");
        
        Statice.x = 75;
        System.out.println("Campul static (x) al clasei Statice are valoarea: " 
                + Statice.x + "\n");
        
        Statice.modificX(15);
        System.out.println("Campul static (x) al clasei Statice are valoarea: " 
                + Statice.x + "\n");
        
        Statice.resetareX();
        System.out.println("Campul static (x) al clasei Statice are valoarea: " 
                + Statice.x + "\n");
        
        //apelare folosind instanta creata (referinta) - referinta.NumeCamp
        Statice st1 = new Statice();
        st1.x = 5;
        st1.y = 7;
        //st1.CT = 66;      - Eroare
        st1.modificX(15);
        
        System.out.println("Campul static (x) al clasei Statice are valoarea: " 
                + st1.x + " / " + Statice.x + "\n");
        System.out.println("Campul y al obiectului st1 are valoarea: " 
                + st1.y + "\n");
        
        Statice st2 = new Statice();
        st2.x = 35;
        st2.y = -55;
        System.out.println("Campul static (x) al clasei Statice are valoarea: " 
                + st2.x + " / " + Statice.x + " / " + st1.x + "\n");
        System.out.println("Campul y al obiectului st2 are valoarea: " 
                + st2.y + "\n");
        
        System.out.println("\n=====================================\n");
        System.out.println("Tipuri de date enumerate");
        
        Anotimp a = Anotimp.VARA;
        
        //referirea la constantele din enum se face in 2 moduri:
        //      numele scurt in case-urile unui switch
        //      numele lung in rest Anotimp.IARNA
        
        switch (a){
            case IARNA:
                System.out.println ("Este IARNA.");
                break;
            case VARA:
                System.out.println ("Este VARA.");
                break;
        }
    }
}
