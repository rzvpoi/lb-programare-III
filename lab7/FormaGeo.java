/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
 /* Superclasa abstracta pentru forme
 *
 * CONSTRUIREA: nu este permisa, FormaGeo fiind abstracta.
 * Constructorul cu un parametru este necesar ptr. clasele
 * derivate.
 * ------------------- metode publice ---------------------
 * double arie()       --> Intoarce aria (abstracta)
 * boolean maiMic    --> Compara doua forme dupa arie
 * String toString     --> Metoda uzuala pentru scriere
 */
 abstract class FormaGeo
 {
	 private String nume;
	 
	 abstract public double arie();
	 
	 FormaGeo(String numeForma)
	 {
		 nume = numeForma;
	 }
	 
	 final public boolean maiMic(FormaGeo fgeo)
	 {
		 return arie() < fgeo.arie();
	 }
	 
	 final public String toString()
	 {
		 return nume + ", avand aria " + arie();
	 }
 }
