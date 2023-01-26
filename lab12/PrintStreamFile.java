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
public class PrintStreamFile {
	public static void main(String [] args) {
		double nr1 = 234.5;
		int nr2 = 120;
		try {
		PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));
		ps.println ("Date pentru testarea fluxului PrintStream");
		ps.print(nr1);
		ps.print(' ');
		ps.print(nr2);
		ps.println();
		ps.println(Math.PI);
		ps.close();
		}
		catch(IOException e) {
		System.out.println("Eroare la scrierea fisierului: " + e.getMessage());
		}
	}
}