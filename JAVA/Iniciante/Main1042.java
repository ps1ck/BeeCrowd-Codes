import java.io.IOException;
import java.util.Scanner;

public class Main1042 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); int n2 = sc.nextInt(); int n3 = sc.nextInt();
        sc.close();

        int maior = Math.max(Math.max(n1,n2),n3);
        int menor = Math.min(Math.min(n1,n2),n3);
        System.out.println(menor);

        if(n1 != maior && n1 != menor){
            System.out.println(n1);
        }
        else if(n2 != maior && n2 != menor){
            System.out.println(n2);
        }
        else if(n3 != maior && n3 != menor){
            System.out.println(n3);
        }

        System.out.println(maior);
        System.out.println("");
        System.out.printf("%d\n%d\n%d\n",n1,n2,n3);

    }
}