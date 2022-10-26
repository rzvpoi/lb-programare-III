package lab5;

import java.io.*;
import java.util.StringTokenizer;

public class Matrice {
 
    double [][] matrice;
    String nume;
 
//Constructorul
    public Matrice (String nume, int linii, int coloane){
        this.nume = nume;
        matrice = new double [linii][coloane];
        System.out.println("A fost creata matricea: " +
                this.nume + " de dimensiunea: " + linii + " x " + coloane);
    //are nume impus si posibila lista de argumente (nume = nume clasa)
    //nu are tip de date de intoarcere (nici macar void)
    //daca nu il punem - se creaza unul automat (cel default, corp vid + fara argumente)
    //daca l-am pus - cel default nu se mai creaza
    }
    
    public Matrice (String nume, int linii){
        // overloading (supraincarcarea) - constructor
        // apelare constructor din alt constructor - cu this 
        // prima instructiune din constructorul apelat
        this (nume, linii, linii);
        System.out.println("Matricea este patratica.");
    }
    
    public Matrice (String nume, int linii, int coloane, boolean completat) throws IOException{
        this (nume, linii, coloane);
        if (completat == true) completeazaMatrice();
    }

    
    //TO DO - adaugati un alt contructor pentru matrice patratica care sa permita completarea matricii la instantiere
    
    
    public void afisare(){
        //metoda prin care afisam matricea
        System.out.println("Matricea " + nume + ": ");
        for (int i=0; i<matrice.length; i++){
            for (int j=0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setNume (String nume){
        //setter-ul
        //nume format din setAtribut
        //nu are date de intoarcere
        //primeste ca argument noua valoare ce se doreste introdusa in obiect
        //metoda pentru schimbarea numelui matricii
        //cand avem variabile shadowing -> folosim this.numeAtribut
        this.nume = nume;
    }
    
    public void completeazaMatrice() throws IOException{
        
        int linii = matrice.length;
        int coloane = matrice[0].length;
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String s;
        
        for (int i=0; i<linii; i++){
            System.out.println("Introduceti elementele de pe linia "+i+":");
            s=br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            if (st.countTokens() == coloane){
                for(int j=0;j<matrice[i].length;j++){
                    matrice[i][j] = Double.parseDouble(st.nextToken());
                }
            } else {
                System.out.println("Ati introdus un nr de elemente mai mare sau" +
                        " mai mic pe linia curenta. Se umple cu <0.00>.");
                for(int j=0;j<matrice[i].length;j++){
                    matrice[i][j] = 0.0;
        }
            }
        }
    }
    
    public void schimbaValoare(int i, int j, double val){
        matrice[i][j] = val;
    }

    public double [][] getMatrice(){
        //numele difera functie de campul pentru care este scris
        //getAtribut / isAtribut(boolean)
        //nu are argumente
        //return de acelasi tip ca atributul
        return matrice;
    }
}
