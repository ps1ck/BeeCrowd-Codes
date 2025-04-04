import java.io.IOException;
import java.util.Scanner;

public class Main1041 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();double y = sc.nextDouble();
        sc.close();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        else if(x != 0 && y == 0){
            System.out.println("Eixo X");
        }
        else{
            if(x > 0 && y > 0){
                System.out.println("Q1");
            }
            else if(x < 0 && y > 0){
                System.out.println("Q2");
            }
            else if(x < 0 && y < 0){
                System.out.println("Q3");
            }
            else {
                System.out.println("Q4");
            }
        }

    }
}