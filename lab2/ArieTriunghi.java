/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
/** Utilizarea instructiunii if pentru determinarea ariei triunghiului**/

import java.io.*;
public class ArieTriunghi
{
    public static void main(String[] args) throws IOException
	{
	double x, y, z, p, aria;
	//String s;
	
     
        x = inputLatura();
        y = inputLatura();
        z = inputLatura();
        
        
        
/**        
        System.out.print ("Introduceti x=  ");
        InputStreamReader isrx = new InputStreamReader(System.in);
        BufferedReader brx = new BufferedReader(isrx);
        	s = brx.readLine();
        	x = Double.parseDouble(s);
      	System.out.print ("Introduceti y=  ");
        	InputStreamReader isry = new InputStreamReader(System.in);
        	BufferedReader bry = new BufferedReader(isry);
        	s = bry.readLine();
        	y = Double.parseDouble(s);
	System.out.print ("Introduceti z=  ");
        	InputStreamReader isrz = new InputStreamReader(System.in);
        	BufferedReader brz = new BufferedReader(isrz);
        	s = brz.readLine();
        	z = Double.parseDouble(s);
            
 **/               
	if (x<=0 || y<=0 || z<=0) 
System.out.println("Numerele introduse nu constituie laturile "
        + "unui triunghi");
	else
	 	if (x+y<=z || x+z<=y || y+z<=x) 
System.out.println("Numerele introduse nu constituie laturile "
        + "unui triunghi");
		else
			{
                    
			p = (x+y+z)/2;
			aria = Math.sqrt(p*(p-x)*(p-y)*(p-z));
			System.out.println("Aria triunghiului = " + aria);}
	//System.out.println("aria este= " + Triunghi(x,y,z));
                    }
    
    public static double inputLatura() throws IOException {
        System.out.print("Introduceti latura: ");
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return Double.parseDouble(s);
    }
    
    /*public static double Triunghi(double a, double b,double c){
        double p;
                p = (a+b+c)/2;
                double aria;
			aria = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                        return aria;*/
    }

