import java.io.IOException;
import java.util.Scanner;

public class Main1044 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();int y = sc.nextInt();
        sc.close();

        int maior = Math.max(x,y);
        int menor = Math.min(x,y);

        if(maior%menor == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

    }
}