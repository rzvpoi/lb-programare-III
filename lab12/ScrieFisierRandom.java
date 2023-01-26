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
public class ScrieFisierRandom {
	public static void main (String [] args) {
		String numeAutor;
		String titluCarte;
		int nrEx; 
		String linie;
		char [] caractere = new char[20];
		try {
		    RandomAccessFile fisier = new RandomAccessFile("carte.dat", "rw");
		    BufferedReader in =  new BufferedReader(
                            new InputStreamReader(System.in));
		    do {
                        System.out.println("Nume autor ");
                        linie = in.readLine();
                        if (linie.length() > 20)
                            numeAutor = linie.substring(0, 20);
                        else
                            numeAutor = linie;
                        System.out.println("Titlul cartii");
                        linie = in.readLine();
                        if (linie.length() > 20)
                            titluCarte = linie.substring(0, 20);
                        else
                            titluCarte = linie;
                        System.out.println("Numar de exemplare:");
                        linie = in.readLine();
                        for (int i = 0; i <= 19; i++)
                            caractere[i] = ' ' ;
                        if (linie.length() > 0){
                            nrEx = Integer.parseInt(linie);
                            char [] buffer = numeAutor.toCharArray();
                            for (int i = 0; i <= buffer.length-1; i++)
				caractere[i]=buffer[i];
                            for (int i = 0; i <= 19; i++)
				fisier.writeChar(caractere[i]);
                            for (int i = 0; i <= 19; i++)
				caractere[i] = ' ' ;
                            buffer = titluCarte.toCharArray();
                            for (int i = 0; i <= buffer.length-1; i++)
                                caractere[i]=buffer[i];
                            for (int i = 0; i <= 19; i++)
				fisier.writeChar(caractere[i]);
                            fisier.writeInt(nrEx);	}
                        } while (linie.length() != 0);
                        System.out.println(fisier.length());
                        System.out.println();
                        fisier.seek(0);
                        while(fisier.getFilePointer() <= fisier.length()-1){
                            System.out.print("Nume autor: ");
			for (int i = 0; i <= 19; i++)
                            System.out.print(fisier.readChar());
		      	System.out.println();
		       	System.out.print("Titlu carte: ");
		       	for (int i = 0; i <= 19; i++)
				System.out.print(fisier.readChar());
		       	System.out.println();
			System.out.print("Numar exemplare: ");
		       	System.out.println(fisier.readInt());
			System.out.println();
		       }
		       fisier.close();
		       }
		catch(IOException e) {
		        System.out.println("Eroare: " + e.getMessage());
		        }
		catch(NumberFormatException nfe) {
		       System.out.println("Nu ati introdus un numar intreg");
		       }
	}
}