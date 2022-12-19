package test;

import java.io.*;
import java.util.*;

public class Matrice {
 
    double [][] matrice;
 
//Constructorul
    public Matrice (int linii, int coloane){
        matrice = new double [linii][coloane];
        System.out.println("A fost creata matricea de dimensiunea: " + linii + " x " + coloane);
    }
  
    
    // public Matrice (int linii, int coloane, boolean completat) throws IOException{
    //     this (linii, coloane);
    //     if (completat == true) completeazaMatrice();
    // }
    
    public void afisare(){
        for (int i=0; i<matrice.length; i++){
            for (int j=0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
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
        return matrice;
    }

    public double prodColPar(int lin, int col) {
        double prod=1;
        for(int i=0; i<lin; i++){
            for(int j=0; j<col; j+=2){
                prod *= matrice[i][j];
            }
        }

        return prod;
    }

    public int nrElemPoz(int lin, int col){
        int nr=0;

        if(lin!=col)
        {
            System.out.println("ERROR: Matricea nu este patratica.");
            return -1;
        }

        for(int i=0; i<lin; i++){
            for(int j=0; j<col; j++){
                if((j+i == lin-1) && matrice[i][j] > 0){
                    nr++;
                    
                }
            
                
            }
        }

        return nr;
        
    }

    public void valMinCol(int lin, int col){
        double min;
        for(int i=0; i<col; i++){
            min=matrice[0][i];
            for(int j=0; j<lin; j++){
                if(matrice[j][i] < min)
                    min = matrice[j][i];
            }
            System.out.println("Smallest num from col "+ i + " is " + min);
        }
    }

    public void interschimbare(int col){
        double aux;
        for(int j=0; j<col; j++)
        {
            aux = matrice[0][j];
            matrice[0][j] = matrice[1][j];
            matrice[1][j]= aux;
        }

        afisare();

    }

}

