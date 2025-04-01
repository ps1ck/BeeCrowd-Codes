import java.io.IOException;
import java.util.Scanner;

public class Main1001 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int A,B,x;
        
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();
        
        x = A + B;

        System.out.printf("X = %d\n",x);
    }
}