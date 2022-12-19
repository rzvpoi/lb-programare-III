package proiect;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String nume="", cnp, faculate, specializare;
        Integer anFacultate;
        String x ="";
        Scanner sc = new Scanner(System.in);
        String input="";
        while(x != "x") {
            input ="";
            System.out.println("!Numarul instantelor create: "+ Persoana.count);
            System.out.println("-> To exit the program press x");
            System.out.println("-> To create a person object press p");
            System.out.println("-> To create a student object press s");
            System.out.print("Insert option: ");
            input = sc.nextLine();
            switch(input) {
                case "x":
                    System.out.println("Exiting the program!");
                    return;
                case "p":
                    System.out.println("Creating a person object:");
                    System.out.print("Insert name: ");
                    nume += sc.nextLine();
                    System.out.print("Insert cnp:");
                    cnp = sc.nextLine();
            
                    System.out.println("\n---------------");
                    System.out.println(Persoana.getInstance(nume, cnp));
                    System.out.println("\n\n");
                    break;
                case "s":
                    System.out.println("Creating a student object:");
                    System.out.print("Insert name: ");
                    nume += sc.nextLine();
                    System.out.print("Insert cnp:");
                    cnp = sc.nextLine();
                    System.out.print("Insert facultate:");
                    faculate = sc.nextLine();
                    System.out.print("Insert specializare:");
                    specializare = sc.nextLine();
                    System.out.print("Insert an facultate:");
                    try {
                        anFacultate = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("\n<>!!!<>An facultate must be a number<>!!!<>\n");
                        break;
                    }
                    System.out.println("\n---------------");
                    System.out.println(Student.getInstance(nume, cnp, faculate, specializare, anFacultate));
                    System.out.println("\n\n");
                    break;
                default:
                    System.out.println("<>!!!<>Wrong option input<>!!!<>");
                    break;
            }
        }
        
        
        sc.close();
    }

}
