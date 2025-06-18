import java.io.IOException;
import java.util.Scanner;

public class Main1079  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ 
            double n1 = sc.nextDouble(); double n2 = sc.nextDouble(); double n3 = sc.nextDouble();
            double media = (n1*2 + n2*3 + n3*5) / 10;
            System.out.printf("%.1f\n",media);
        }
        sc.close();
    }
}