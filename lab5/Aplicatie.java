package lab5;

import java.io.*;
import java.util.Arrays;

public class Aplicatie {
    public static void main(String args[]) throws IOException {
        
        Matrice E = new Matrice("Elasticitate",3,3,true);
        
        //E.completeazaMatrice();
        
        double [][] test = E.getMatrice();
        
        System.out.println(Arrays.deepToString(test));
        //System.out.println("Determinatul este: " + determinant(test));
        E.afisare();
        
        E.schimbaValoare(0,0,-5);
        
        E.afisare();
        
        
    }
    

    public static double determinant(double [][] mat){
        double det = 0;
        if (mat.length != mat[0].length){
            System.out.println("Matricea nu este patratica. \n" +
                    "Nu se poate calcula determinantul.");
            return 0.0;                
        }
        
        if (mat.length == 1){
                det = mat[0][0];
                return det;
        }
        
        if (mat.length == 2){
                det = mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
                return det;
        }

        if (mat.length == 3){
            det = mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
            return det;
    }
        
        for (int col = 0; col<mat[0].length; col++){
            double [][]temp = new double[mat.length-1][mat[0].length-1];
            for (int i=1; i<mat.length; i++)
                for(int j=0; j<mat[0].length;j++){
                    if (j<col)
                        temp[i-1][j]=mat[i][j];
                    else if(j>col)
                        temp[i-1][j-1]=mat[i][j];
                }
        det = det + Math.pow(-1,(double)col)*mat[0][col]*determinant(temp);
        }
        return det;
    }

}
