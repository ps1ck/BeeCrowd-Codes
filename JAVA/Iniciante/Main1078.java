import java.io.IOException;
import java.util.Scanner;

public class Main1078  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 10; i++){ 
            int tabuada = i * n;
            System.out.printf("%d x %d = %d\n",i,n,tabuada);
        }
    }
}