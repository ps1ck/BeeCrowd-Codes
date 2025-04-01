import java.io.IOException;
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        double sFixo = sc.nextDouble();
        double vendas = sc.nextDouble();
        sc.close();

        double total = sFixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n",total);
    }
}