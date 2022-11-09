/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
 /* clasa Cerc
 * derivata din FormaGeo
 *
 * CONSTRUCTORI: (a) cu raza ptr. cerc
 * ------------------- metode publice ---------------------
 * double arie()-->Implementeaza metoda abstracta din FormaGeo
 *
 */
public class Cerc extends FormaGeo
{
	 private double raza;
	 
	 Cerc(double rad)
	 {
		 super("Cerc");
		 raza = rad;
	 }
	 
	 public double arie()
	 {
		 return Math.PI * raza * raza;
	 }
 }
