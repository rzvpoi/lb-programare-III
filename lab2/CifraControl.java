import java.util.Scanner;

public class CifaControl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int nr = sc.nextInt();

        int cifra = 0;
        while( nr > 0)
        {
            cifra += nr%10;
            nr /= 10;
            if(cifra > 10) {
                nr = cifra;
                cifra = 0;
            }
        }
        System.out.println("Cifra este: "+cifra);
        sc.close();
    }
}