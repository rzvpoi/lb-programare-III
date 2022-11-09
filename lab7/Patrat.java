/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
 /* clasa Patrat
 * derivata din Dreptunghi
 *
 * CONSTRUCTORI: cu latura ptr. patrat
 * ------------------- metode publice ---------------------
 * double arie()-->Implementeaza metoda abstracta din FormaGeo
 *
 */

public class Patrat extends Dreptunghi
{
	 Patrat(double latura)
	 {
		 super(latura, latura, "Patrat");
	 }
}
