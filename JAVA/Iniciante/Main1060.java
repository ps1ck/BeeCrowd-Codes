import java.io.IOException;
import java.util.Scanner;

public class Main1060 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        for(int i = 1;i <= 6;i++){
            double numero = sc.nextDouble();
            if(numero > 0.0){
                contador += 1;
            }
        }
        sc.close();

        System.out.printf("%d valores positivos\n",contador);

    }
}