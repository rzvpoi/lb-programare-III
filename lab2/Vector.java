
import java.io.*;

public class Vector {
    public static void main(String [] args) throws IOException {
        int a =citesteNr();
        //int b =citesteNr();
        System.out.println("Dimensiunea vectorului este:"+a);
        
         int v[] = new int[a];
         //int A[][]=new int [a][a];
         
         for (int i=0;i<v.length;i++)
         {
             v[i]=citesteNr();
         }
         
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
