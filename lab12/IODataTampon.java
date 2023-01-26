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
public class IODataTampon {
	public static void main (String [] args) {
	float limInf = 0;
	float limSup = 255;
	try {
	if (args.length > 1) 
		{
		limInf = Float.parseFloat(args[0]);
		limSup  = Float.parseFloat(args[1]);
		}
	else
		if(args.length > 0) 
		limInf = Float.parseFloat(args[0]);
	FluxDatePrimitive fd = new FluxDatePrimitive(limInf, limSup);
	boolean succesScrie = fd.scrieFlux();
	System.out.println("\nCiteste: ");
	boolean succesCiteste = fd.citesteFlux();
	}
	catch(NumberFormatException nfe) {
		System.out.println("Eroare: " + "Nu ati introdus un numar real");
	}
	}
}
class FluxDatePrimitive {
	private float inceput = 0;
	private float sfarsit = 255;
	public FluxDatePrimitive(float inceput, float sfarsit) {
		this.inceput = inceput;
		this.sfarsit = sfarsit;
	}
	boolean scrieFlux()  {
		try {
		DataOutputStream fluxDate = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("numere.dat")));
		for (float i = inceput; i <= sfarsit; i+=0.5)
			fluxDate.writeFloat(i);
		fluxDate.close();
		return true;
		}
		catch(IOException e) {
		System.out.print("Eroare: " + e.getMessage());
		return false;
		}
	}
	boolean citesteFlux() {
		try {
		DataInputStream fluxDate = new DataInputStream(new BufferedInputStream(
				new FileInputStream("numere.dat")));
		float i = 0;
			try {
			while (true)
				{
				i = fluxDate.readFloat();
				System.out.print(" " + i);
				}
			}
			catch(EOFException eof) {
			fluxDate.close();
			}
		return true;
		}
		catch(IOException e) {
		System.out.print("Eroare: " + e.getMessage());
		return false;
		}
	}
}	
	
