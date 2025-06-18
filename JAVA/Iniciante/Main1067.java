import java.io.IOException;
import java.util.Scanner;

public class Main1067 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();

        for(int i = 1; i <= numero; i++){
            if((i%2) != 0.0){ System.out.println(i); }
        }
    }
}