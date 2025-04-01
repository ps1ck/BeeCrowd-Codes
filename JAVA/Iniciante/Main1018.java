import java.io.IOException;
import java.util.Scanner;

public class Main1018 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        System.out.println(x);
        int nota100 = (x - x%100)/100;
        System.out.printf("%d nota(s) de R$ 100,00\n",nota100);
        int nota50 = (x%100 - x%50)/50;
        System.out.printf("%d nota(s) de R$ 50,00\n",nota50);
        int nota20 = ( (x%100 - nota50*50) - ((x%100 - nota50*50)%20) )/20;
        System.out.printf("%d nota(s) de R$ 20,00\n",nota20);
        int nota10 = ( (x%100-(nota50*50 + nota20*20)) - ((x%100-(nota50*50 + nota20*20))%10) )/10;
        System.out.printf("%d nota(s) de R$ 10,00\n",nota10);
        int nota5 = ( (x%100-(nota50*50 + nota20*20 + nota10*10)) - ((x%100-(nota50*50 + nota20*20 + nota10*10))%5) )/5;
        System.out.printf("%d nota(s) de R$ 5,00\n",nota5);
        int nota2 = ( (x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5)) - ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5))%2)) /2;
        System.out.printf("%d nota(s) de R$ 2,00\n",nota2);
        int nota1  = x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2);
        System.out.printf("%d nota(s) de R$ 1,00\n",nota1);

    }
}