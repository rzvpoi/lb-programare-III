/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author Oana
 */
import java.io.*;
class CitesteSiruri
{
	public static void main(String[] args) 
	{
	char[] caractere1 = new char[20];
	char[] caractere2 = new char[20];
	for (int i=0; i <=19; i++)
		caractere1[i] = ' ';
	for ( int i=0; i <=19; i++)
		caractere2[i] = ' ';
	try {	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println ("Introduceti primul sir");
	br.read(caractere1, 0, 20);
	String sir1 = new String(caractere1);
	System.out.println(sir1);
	while (br.ready() )
		br.skip (1);
	System.out.println ("Introduceti al doilea sir");
	br.read(caractere2, 0, 20);
	String sir2 = new String(caractere2);
	System.out.println(sir2);
	boolean rezultat = false;
	rezultat = sir1.equals(sir2);
	if (rezultat ==true)
		System.out.println ("siruri egale");
		else
	 	System.out.println ("siruri diferite");
	}
	catch(IOException e) {
		System.out.println ("Eroare la sirul citit" + e.getMessage());
	}
	}
}
