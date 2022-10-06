package lab1;
import java.util.*;
public class SumaNrNaturale {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i=0; i<=n; i++)
            sum += i;

        System.out.println("Suma este " + sum);
        sc.close();
    }
    
}
