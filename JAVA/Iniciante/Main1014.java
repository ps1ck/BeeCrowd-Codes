import java.io.IOException;
import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int dp = sc.nextInt();
        double cg = sc.nextDouble();
        sc.close();

        double consumo = dp / cg;

        System.out.printf("%.3f km/l\n",consumo);
    }
}