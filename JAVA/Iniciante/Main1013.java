import java.io.IOException;
import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();int y = sc.nextInt();int z = sc.nextInt();
        sc.close();

        int aux = Math.max(x,y);
        int maior = Math.max(aux, z);

        System.out.printf("%d eh o maior\n",maior);
    }
}