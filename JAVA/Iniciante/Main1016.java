import java.io.IOException;
import java.util.Scanner;

public class Main1016 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        sc.close();

        int tempo = distancia * 2;

        System.out.printf("%d minutos\n",tempo);
    }
}