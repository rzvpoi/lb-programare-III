/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package lab8.ClasePredefiniteUtile.src.main.java.ro.utcb.package1;

import java.util.Scanner;


/**
 *
 * @author Daniel
 */
public class ClasePredefiniteUtile {

    public static void main(String[] args) {
        
        //Clasa Math - colectie de metode statice pt operatii matematice uzuale
        
        System.out.println ("Valoarea lui pi: " + Math.PI);
        System.out.println ("Valoarea lui e: " + Math.E);
        
        //Math.abs (valoare) - modul
        System.out.println(Math.abs(14.3));
       
        //Math.pow (double baza, double exponent) - ridicarea la putere
        System.out.println(Math.pow(2,3));
         
        //Math.max (nr1,nr2) & Math.min(nr1,nr2) - min si max dintre 2 numere
        System.out.println(Math.max(2,7));
        
        //Math.random () - produce double [0,1)
        System.out.println(Math.random());

        //Math.signum (numar) - determinare semn numar (-1.0 / 0.0 / 1.0)
        System.out.println(Math.signum(-1));

        //Math.sqrt (double numar) - radical
        System.out.println(Math.sqrt(256));

        //Math.floor (double numar) - produce intregul inferior numarului
        System.out.println(Math.floor(2.56));

        //Math.ceil (double numar) - produce intregul superior numarului
        System.out.println(Math.ceil(4.53));

        //Math.round (numar) - produce cel mai apropriat intreg
        System.out.println(Math.round(2.74));

        //Math.sin(double unghi) & Math.cos(double unghi)
        System.out.println(Math.sin(2.32));
        System.out.println(Math.cos(5.19));
        
        //https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
        
        
        //Clasa Scanner 
        //un obiect Scanner citeste info dintr-o sursa si o imparte in campuri pe baza unui delimitator
        //surse: stringuri, fisiere, conexiuni la retea, etc
        //la instantierea obiectului de tip Scanner trebuie specificata ca parametru in constructor sursa de informatie
        
        String text = "Acesta este un string pentru Scanner";
        Scanner sc = new Scanner(text);
       
        
        boolean flag = true;
        
        while (flag){
            if (sc.hasNext()) System.out.println("Campul curent: " + sc.next());
            else flag = false;
            //System.out.println("Campul curent: " + sc.next()); - eroare
            //pentru sursele limitate - dupa epuizarea informatiei, orice next() creaza o eroare
        }
        
        //hasNext() / hasNextInt() / hasNextDouble() ...
        //nextInt() / nextDouble() / nextFloat() ...
        
        //Scanner sc2 = new Scanner(System.in);
        //System.out.println("Introduceti un text de la tastatura:");
        //flag = true;
        //while (flag){
        //    if (sc2.hasNext()) System.out.println("Campul curent: " + sc2.next());
        //    else flag = false;
        //    //pentru surse ce transmit info in etape - next() blocheaza programul pana sursa ofera iar input        
        // }

    
    
        //https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        
        
        //Clasa String
        //obiectele de tip string sunt immutable
        
        String s = "1234";
        s = "Acesta e un text";
        System.out.println(s);

        //String trim()
        String myStr = "       Hello World!        ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    
 
        
    }
}
