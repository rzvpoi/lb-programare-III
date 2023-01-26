package test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int X,Y, raza;
        Punct lat1,lat2,lat3;
        System.out.println("Creare Triunghi-----------");
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Latura 1: ");
        X = sc.nextInt();
        Y = sc.nextInt();

        lat1 = new Punct(X, Y);

        System.out.println("Latura 2: ");
        X = sc.nextInt();
        Y = sc.nextInt();

        lat2 = new Punct(X, Y);

        System.out.println("Latura 3: ");
        X = sc.nextInt();
        Y = sc.nextInt();

        lat3 = new Punct(X, Y);


        Triunghi tr = new Triunghi(X, Y, lat1, lat2, lat3);


        System.out.println("Arie triunghi: "+ tr.arie(lat1,lat2,lat3));
        }catch(Exception e){
            System.out.println("ERROR: " + e);
        }


        System.out.println("Creare Cerc----------");
        System.out.println("Coordonata X: ");
        try {
        X = sc.nextInt();

        System.out.println("Coordonata Y: ");
        Y = sc.nextInt();

        System.out.println("Raza: ");
        raza = sc.nextInt();

        Cerc cr = new Cerc(X, Y, raza);

        System.out.println("Arie triunghi: "+ cr.arie(raza));
        } catch(Exception e){
            System.out.println("ERROR: " + e);
        }
       sc.close();
    }

}
