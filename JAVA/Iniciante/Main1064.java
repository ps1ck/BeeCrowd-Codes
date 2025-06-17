import java.io.IOException;
import java.util.Scanner;

public class Main1064 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int contador = 0; 
        double media, soma = 0;

        for(int i = 0; i < 6; i++){
            double n = sc.nextDouble();
            if(n >= 0){
                contador += 1; soma += n;
            }
        }
        sc.close();

        media = soma / contador;
        System.out.printf("%d valores positivos\n",contador);
        System.out.printf("%.1f\n",media);

    }
}