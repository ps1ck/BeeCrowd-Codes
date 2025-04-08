import java.io.IOException;
import java.util.Scanner;

public class Main1047 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();int minutosd1 = sc.nextInt();int y = sc.nextInt();int minutosd2 = sc.nextInt();
        sc.close();
        int horas = 0;
        int minutos = 0;

        if(x > y){
            y += 24;
            horas = y-x;
        }
        else if(x < y){
            horas = y-x;
        }
        else{
            horas = 24;
        }

        if(minutosd1 > minutosd2){
            horas -= 1;
            minutosd2 += 60;
            minutos = minutosd2 - minutosd1;
        }
        else if(minutosd1 < minutosd2){
            minutos = minutosd2 - minutosd1;
        }
        else{
            minutos = 0;
        }

        if(horas == 24 && minutos > 0){     /* Corrigindo o erro que tava dando, não pode passar de 24h, tipo 24h e 10 min, tem que ser 0h e 10min. Se for 24h tem que ser  */
            horas = 0;                      /* 24h e 0 min se passar disso é 0h e o x min. */
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",horas,minutos);

    }
}