import java.io.IOException;
import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        int vMedia = sc.nextInt();
        sc.close();

        double distanciaP = vMedia * horas;
        double gastoEmLitros = distanciaP / 12;

        System.out.printf("%.3f\n",gastoEmLitros);
    }
}