import java.io.IOException;
import java.util.Scanner;

public class Main1070  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();

        if((numero%2) == 0.0){ numero += 1; }

        for(int i = 0; i < 6;i++){
            System.out.println(numero);
            numero += 2;
        }
    }
}