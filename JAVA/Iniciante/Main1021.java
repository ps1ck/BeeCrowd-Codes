import java.io.IOException;
import java.util.Scanner;

public class Main1021 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        System.out.println("NOTAS:");
        double nota100 = (x - x%100)/100;
        System.out.printf("%.0f nota(s) de R$ 100.00\n",nota100);
        double nota50 = (x%100 - x%50)/50;
        System.out.printf("%.0f nota(s) de R$ 50.00\n",nota50);
        double nota20 = ( (x%100 - nota50*50) - ((x%100 - nota50*50)%20) )/20;
        System.out.printf("%.0f nota(s) de R$ 20.00\n",nota20);
        double nota10 = ( (x%100-(nota50*50 + nota20*20)) - ((x%100-(nota50*50 + nota20*20))%10) )/10;
        System.out.printf("%.0f nota(s) de R$ 10.00\n",nota10);
        double nota5 = ( (x%100-(nota50*50 + nota20*20 + nota10*10)) - ((x%100-(nota50*50 + nota20*20 + nota10*10))%5) )/5;
        System.out.printf("%.0f nota(s) de R$ 5.00\n",nota5);
        double nota2 = ( (x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5)) - ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5))%2)) /2;
        System.out.printf("%.0f nota(s) de R$ 2.00\n",nota2);

        System.out.println("MOEDAS:");
        double moeda1  = ( (x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2)) - ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2))%1)) /1;
        System.out.printf("%.0f moeda(s) de R$ 1.00\n",moeda1);
        double moeda050 = ( (x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1)) - ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1))%0.50)) /0.50;
        System.out.printf("%.0f moeda(s) de R$ 0.50\n",moeda050);
        double moeda025 = ( (x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1 + moeda050*0.50)) - ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1 + moeda050*0.50))%0.25)) /0.25;
        System.out.printf("%.0f moeda(s) de R$ 0.25\n",moeda025);
        double moeda010 = ( (x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1 + moeda050*0.50 + moeda025*0.25)) - ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1 + moeda050*0.50 + moeda025*0.25))%0.10)) /0.10;
        System.out.printf("%.0f moeda(s) de R$ 0.10\n",moeda010);
        double moeda005 = ( (x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1 + moeda050*0.50 + moeda025*0.25 + moeda010*0.10)) - ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1 + moeda050*0.50 + moeda025*0.25 + moeda010*0.10))%0.05)) /0.05;
        System.out.printf("%.0f moeda(s) de R$ 0.05\n",moeda005);
        double moeda001 = ((x%100-(nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1*1 + moeda050*0.50 + moeda025*0.25 + moeda010*0.10))%0.05)/0.01;
        System.out.printf("%.0f moeda(s) de R$ 0.01\n",moeda001);

    }
}