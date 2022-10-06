/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
import java.io.*;
public class Tablou {
     public static void main(String [] args) throws IOException {
         System.out.println("Introduceti primul numar");
         int x=citesteNr();
         System.out.println("Numarul introdus este:"+x);
         System.out.println("Introduceti vectorul");
         
          int v[] = new int[x];
         for (int i=0;i<v.length;i++)
             v[i]=citesteNr();
         for (int i=0;i<v.length;i++)
          System.out.println("v("+i+")="+v[i]);
     }
     
       public static int citesteNr() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s= br.readLine(); 
        return Integer.parseInt(s);
    }
}
