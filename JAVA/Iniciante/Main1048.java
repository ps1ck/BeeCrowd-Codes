import java.io.IOException;
import java.util.Scanner;

public class Main1048 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        sc.close();
        double reajuste = 0; int porcentagem = 0;

        if(s >= 0.0 && s <= 400.00){
            reajuste = (s*0.15);   porcentagem = 15;
        }
        else if(s >= 400.01 && s <= 800.00){
            reajuste = (s*0.12);   porcentagem = 12;
        }
        else if(s >= 800.01 && s <= 1200.00){
            reajuste = (s*0.10);    porcentagem = 10;
        }
        else if(s >= 1200.01 && s <= 2000.00){
            reajuste = (s*0.07); ;   porcentagem = 7;
        }
        else if(s > 2000.00){
            reajuste = (s*0.04);    porcentagem = 4;
        }

        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n",(s + reajuste),reajuste,porcentagem);

    }
}