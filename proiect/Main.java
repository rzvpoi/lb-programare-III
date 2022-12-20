package proiect;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String nume="", cnp, faculate, specializare;
        Integer anFacultate;
        Scanner sc = new Scanner(System.in);
        String input="";
        while(!input.equals("x")) {
            input ="";
            System.out.println("\n!Numarul instantelor create: "+ Persoana.count);
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
                    Persoana.getInstance(nume, cnp);
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
                    Student stud = Student.getInstance(nume, cnp, faculate, specializare, anFacultate);
                    System.out.println("\n\n");
                    String inputStud="";
                    if(stud == null){break;}
                    while(!inputStud.equals("x")) {
                        System.out.println("\nStudent energy level is "+ stud.energie );
                        System.out.println("-> To exit the student activity press x");
                        System.out.println("-> Invata -> i");
                        System.out.println("-> Recreere -> r");
                        System.out.println("-> Testare -> t");
                        System.out.println("-> Odihna -> o");
                        System.out.print("Insert option: ");
                        inputStud ="";
                        inputStud = sc.nextLine();
                        switch(inputStud){
                            case "x":
                                break;
                            case "i":
                                System.out.println(stud.invata(stud));
                                break;
                            case "r":
                                System.out.println(stud.recreere(stud));
                                break;
                            case "t":
                                System.out.println(stud.testare(stud));
                                break;
                            case "o":
                                System.out.println(stud.odihna(stud));
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("<>!!!<>Wrong option input<>!!!<>");
                    break;
            }
        }
        
        
        sc.close();
    }

}
