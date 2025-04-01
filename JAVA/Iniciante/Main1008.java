import java.io.IOException;
import java.util.Scanner;

public class Main1008 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int horasTrab = sc.nextInt();
        double valorHora = sc.nextDouble();
        sc.close();

        double salario = horasTrab * valorHora;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",numero,salario);
    }
}