import java.io.IOException;
import java.util.Scanner;

public class Main1071  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); int y = sc.nextInt();
        sc.close();
        int maior = Math.max(x,y); int menor = Math.min(x,y); int soma = 0;

        for( int i = menor + 1; i < maior; i++){
            if((i%2) != 0.0){ soma += i; }
        }
        System.out.println(soma);
    }
}