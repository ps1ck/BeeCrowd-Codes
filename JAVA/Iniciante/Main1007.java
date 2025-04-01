import java.io.IOException;
import java.util.Scanner;

public class Main1007 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int diferenca = (A * B) - (C * D);

        System.out.printf("DIFERENCA = %d\n",diferenca);
    }
}