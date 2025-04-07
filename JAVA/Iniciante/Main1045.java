import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main1045 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();double b = sc.nextDouble();double c = sc.nextDouble();
        sc.close();

        double[] lados = {a, b, c};     // usando array pela 1° vez em java
        Arrays.sort(lados);             // separa eles em ordem decrescente

        double A = lados[2]; // maior
        double B = lados[1];
        double C = lados[0];
        
        if(A >= B+C ){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{

            if((Math.pow(A,2)) == (Math.pow(B,2) + Math.pow(C,2))){
                System.out.println("TRIANGULO RETANGULO");
            }
            else if((Math.pow(A,2)) > (Math.pow(B,2) + Math.pow(C,2))){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if((Math.pow(A,2)) < (Math.pow(B,2) + Math.pow(C,2))){
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if(A == B && A == C){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if(A == B || B == C || C == A){    
                System.out.println("TRIANGULO ISOSCELES");
            }

        }
    }
}