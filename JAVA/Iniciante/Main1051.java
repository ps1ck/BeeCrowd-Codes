import java.io.IOException;
import java.util.Scanner;

public class Main1051 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        sc.close();
        double imposto = 0.0;

        if(salario >= 0.00 && salario <= 2000.00){
            System.out.println("Isento");
        }
        else{

            if(salario >= 2000.01 && salario <= 3000.00){
                imposto += ((salario-2000.00)*0.08);
            }
            
            if(salario >= 3000.01 && salario <= 4500.00){
                imposto += ((salario-3000.00)*0.18) + 80.00;
            }
    
            if(salario > 4500.00){
                imposto += ((salario-4500.00)*0.28) + 80.00 + 270.00;
            }

            System.out.printf("R$ %.2f\n",imposto);

        }
    }
}