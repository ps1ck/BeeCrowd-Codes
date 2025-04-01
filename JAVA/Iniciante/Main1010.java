import java.io.IOException;
import java.util.Scanner;

public class Main1010 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int cdp = sc.nextInt();
        int q = sc.nextInt();
        double vu = sc.nextDouble();
        
        int cdp2 = sc.nextInt();
        int q2 = sc.nextInt();
        double vu2 = sc.nextDouble();
        sc.close();

        double total = (q * vu) + (q2 * vu2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}