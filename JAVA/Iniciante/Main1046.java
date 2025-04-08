import java.io.IOException;
import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();int y = sc.nextInt();
        sc.close();

        if(x > y){
            y += 24;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",(y-x));
        }
        else if(x < y){
            System.out.printf("O JOGO DUROU %d HORA(S)\n",(y-x));
        }
        else{
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        }
    }
}