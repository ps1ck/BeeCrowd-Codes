import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main1028 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for(int xi = 0; xi < i; xi++){
            int x = sc.nextInt();int y = sc.nextInt();
            int pilha = BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
            System.out.println(pilha);
    }
        sc.close();
    }
}