import java.io.IOException;
import java.util.Scanner;

public class Main1020 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.close();

        int ano = (idade - idade%365)/365;
        int dias = (idade%365)%30;
        int meses = (idade%365 - dias)/30;

        System.out.printf("%d ano(s)\n",ano);
        System.out.printf("%d mes(es)\n",meses);
        System.out.printf("%d dia(s)\n",dias);
        
    }
}