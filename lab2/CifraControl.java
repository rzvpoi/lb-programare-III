/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
/* Utilizarea instructiunii while pentru calculul cifrei de control
	a unui numar natural x */
import java.io.*;
public class CifraControl
{
    public static void main(String[] args) throws IOException
	{
	int x, suma=0;
	
               
        String s;
	System.out.print ("Introduceti numarul natural=  ");
        	InputStreamReader isrx = new InputStreamReader(System.in);
        	BufferedReader brx = new BufferedReader(isrx);
        	s = brx.readLine();
        	x = Integer.parseInt(s);
	do
	   {
	    while (x !=0)
		{
                System.out.print("x = " + x);
		suma+=x%10;	// adun la s ultima cifra a lui x
		x/=10;	//elimin ultima cifra a lui x
                System.out.println("; suma = " + suma + "; x = " + x);
		}
	   System.out.println("Suma cifrelor numarului: " + suma);
	   x = suma; //actualizez numarul cu suma cifrelor sumei
	   suma = 0;
	   } while (x >9); // suma cifrelor sumei trebuie sa aiba o singura cifra
	System.out.println("Cifra de control a numarului este: " + x);
	}
}
