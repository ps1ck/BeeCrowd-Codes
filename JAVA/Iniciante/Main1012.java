import java.io.IOException;
import java.util.Scanner;

public class Main1012 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();double B = sc.nextDouble();double C = sc.nextDouble();
        sc.close();

        double triangulo = (A*C) /2;
        double circulo = 3.14159 * Math.pow(C, 2);
        double trapezio = ((A+B) * C) / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",triangulo,circulo,trapezio,quadrado,retangulo);
    }
}