import java.io.IOException;
import java.util.Scanner;

public class Main1040 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();double n2 = sc.nextDouble();double n3 = sc.nextDouble();double n4 = sc.nextDouble();

        double media = (n1*2 + n2*3 + n3*4 + n4) / 10;
        System.out.printf("Media: %.1f\n",media-0.01); /* -0.01 pra ele não arredondar pra cima, tava dando erro com 4.85 por exemplo, ia pra 4.9. Corrigido. */

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        else if(media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
            double novaNota = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",novaNota);
            double novaMedia = (media + novaNota) / 2;
            if(novaMedia >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",novaMedia);
        }
        else{System.out.println("Aluno reprovado.");}
        sc.close();

    }
}