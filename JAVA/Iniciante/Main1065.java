import java.io.IOException;
import java.util.Scanner;

public class Main1065 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int contador = 0; 

        for(int i = 0; i < 5; i++){
            double n = sc.nextDouble();
            if((n%2) == 0.0){ contador += 1; }
        }
        sc.close();

        System.out.printf("%d valores pares\n",contador);
    }
}