import java.io.IOException;
import java.util.Scanner;

public class Main1080  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int maior = 0; int posicao = 0;
        
        for(int i = 1; i <= 100; i++){ 
            int x = sc.nextInt();
            if (x > maior) {
                maior = x;
                posicao = i;
            }
        }
        sc.close();
        System.out.printf("%d\n%d\n",maior,posicao);
    }
}