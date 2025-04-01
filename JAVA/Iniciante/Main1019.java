import java.io.IOException;
import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int horas = (n - n%3600) / 3600;
        int sec = ((n%3600)%60);
        int min = (n%3600 - sec) / 60;
        

        System.out.printf("%d:%d:%d\n",horas,min,sec);
    }
}