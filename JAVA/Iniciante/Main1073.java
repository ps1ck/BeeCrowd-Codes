import java.io.IOException;
import java.util.Scanner;

public class Main1073  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        for(int i = 1; i <= x; i++){
            if((i%2) == 0.0){ System.out.printf("%d^2 = %d\n",i,(i*i)); }
        }
    }
}