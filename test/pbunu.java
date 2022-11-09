package test;
import java.io.*;
import java.util.*;

public class pbunu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert matrix lines: ");
        int lines = sc.nextInt();
        System.out.print("Insert matrix cols: ");
        int cols = sc.nextInt();
        Matrice mat = new Matrice(lines, cols);

        System.out.println("Punctul a -------------------");
        try {
            mat.completeazaMatrice();
        } catch (IOException e) {
            System.out.println((e));
        }

        System.out.println("Punctul b -------------------\n");
        System.out.println("Produsul elementelor de pe coloanele pare este: "+mat.prodColPar(lines, cols));


        System.out.println("Punctul c -------------------\n");
        System.out.println("Numarul elementelor pozitive de pe diag sec este: "+mat.nrElemPoz(lines, cols));

        System.out.println("Punctul d -------------------\n");
        mat.valMinCol(lines, cols);


        System.out.println("Punctul e -------------------\n");
        mat.interschimbare(cols);

        

        sc.close();
    }
     
}
