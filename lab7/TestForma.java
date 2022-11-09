/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oana
 */
import java.io.* ;

class TestForma
{
	private static BufferedReader in;
	public static void main(String[] args) throws IOException
	{
		//Citeste numarul de figuri
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Numarul de figuri: ");
		int numForme = Integer.parseInt(in.readLine());
		//citeste formele
		FormaGeo[] forme = new FormaGeo[numForme];
		for (int i = 0; i < numForme; ++i)
			{
			forme[i] = citesteForma();
			}
		//sortare si afisare
		sortare(forme);
		System.out.println("Sortarea dupa arie: ");
		for (int i = 0; i < numForme; ++i)
			{
			System.out.println(forme[i]);
			}
	}
	
 //creaza un obiect adecvat de tip FormaGeo functie de
 //datele de intrare.
 //utilizatorul introduce 'c', 'p' sau 'd' pentru a indica
 //forma, apoi introduce dimensiunile
 //in caz de eroare se intoarce un cerc de raza 0
 
 private static FormaGeo citesteForma() throws IOException
 {
	 double rad;
	 double lg;
	 double lat;
	 String s; 
	System.out.println("Introduceti tipul formei: ");
	do
		{
		  s = in.readLine();
		 }  while (s.length() == 0);
		 switch (s.charAt(0))
		 {
			 case 'c':
				 System.out.println("Raza cercului: ");
				 rad = Integer.parseInt(in.readLine());
				 return new Cerc(rad);
			 case 'p':
				 System.out.println("Latura patratului: ");
				 lg = Integer.parseInt(in.readLine());
				 return new Patrat(lg);
			 case 'd':
				 System.out.println("Lungimea si latimea "
				 + " dreptunghiului pe linii separate: ");
				 lg = Integer.parseInt(in.readLine());
				 lat= Integer.parseInt(in.readLine());
				 return new Dreptunghi(lg, lat);
			 default:
				 System.err.println("Tastati c, p sau d: ");
				 return new Cerc(0);
		 }

 }

	
	//sortare 
 private static void sortare(FormaGeo [] a)
 {
	FormaGeo temp;
	for (int i = 0; i <= a.length - 2; i++)
	      {
		for (int j = i+1; j <= a.length - 1; j++)
		      {
			if (a[j].maiMic(a[i]))
				{
				temp =  a[i];
				a[i] = a[j];
				a[j] = temp;
				}
		      }
	     }
}
}
