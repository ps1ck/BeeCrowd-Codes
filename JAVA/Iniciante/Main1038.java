import java.io.IOException;
import java.util.Scanner;

public class Main1038 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();int quantidade = sc.nextInt();
        sc.close();

        switch(codigo){
            case 1:
                double totalCachorroQuente = 4.00 * quantidade;
                System.out.printf("Total: R$ %.2f\n",totalCachorroQuente);
                break;
            case 2:
                double totalXSalada = 4.50 * quantidade;
                System.out.printf("Total: R$ %.2f\n",totalXSalada);
                break;
            case 3:
                double totalXBacon = 5.00 * quantidade;
                System.out.printf("Total: R$ %.2f\n",totalXBacon);
                break;
            case 4:
                double totalTorradaSimples = 2.00 * quantidade;
                System.out.printf("Total: R$ %.2f\n",totalTorradaSimples);
                break;
            case 5:
                double totalRefrigerante = 1.50 * quantidade;
                System.out.printf("Total: R$ %.2f\n",totalRefrigerante);
                break;
        }

    }
}