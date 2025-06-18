import java.io.IOException;
import java.util.Scanner;

public class Main1072  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0; int out = 0;

        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){ in += 1; }
            else{ out += 1; }
        }
        sc.close();
        System.out.printf("%d in\n%d out\n",in,out);
    }
}