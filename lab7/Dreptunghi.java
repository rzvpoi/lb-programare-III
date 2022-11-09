/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
 /* clasa Dreptunghi;
 * derivata din FormaGeo
 *
 * CONSTRUCTORI:  cu lungime si latime ptr. dreptunghi
 * ------------------- metode publice ---------------------
 * double arie()-->Implementeaza metoda abstracta din FormaGeo
*/
public class Dreptunghi extends FormaGeo
{
	 private double lungime;
	 private double latime;
	 
	 Dreptunghi(double lg, double lat)
	 {
		 this(lg, lat, "Dreptunghi");
	 }
	 
	 Dreptunghi(double lg, double lat, String nume)
	 {
		super(nume);
		lungime = lg;
		latime = lat;
	 }
	
	 public double arie()
	 {
		 return lungime * latime;
	 }
}
