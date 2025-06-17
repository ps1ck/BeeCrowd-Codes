import java.io.IOException;
import java.util.Scanner;

public class Main1061 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String diaInicio = sc.nextLine(); String horaInicio = sc.nextLine(); String diaFinal = sc.nextLine(); String horaFinal = sc.nextLine();
        sc.close();

        String[] separadorDiaInicio = diaInicio.split(" ");  // Criei uma array separando o Dia do número com .split pra poder "filtrar" o código.
        int diaStart = Integer.parseInt(separadorDiaInicio[1]);      // Coloquei o n° em uma nova variável int.

        String[] separadorHoraIn = horaInicio.split(" : ");
        int horaStart = Integer.parseInt(separadorHoraIn[0]); int minStart = Integer.parseInt(separadorHoraIn[1]); int secStart = Integer.parseInt(separadorHoraIn[2]); 

        String[] separadorDiaFinal = diaFinal.split(" "); 
        int diaEnd = Integer.parseInt(separadorDiaFinal[1]);      

        String[] separadorHoraF = horaFinal.split(" : ");
        int horaEnd = Integer.parseInt(separadorHoraF[0]); int minEnd = Integer.parseInt(separadorHoraF[1]); int secEnd = Integer.parseInt(separadorHoraF[2]); 
        
        int diasR = ((diaEnd * 24 + horaEnd) - (diaStart * 24 + horaStart))/24;     // dias
        int horaR = ((diaEnd * 24 + horaEnd) - (diaStart * 24 + horaStart))%24;     // horas
        int minR = 0; int secR = 0;

        if (minStart < minEnd){                 // minutos
            minR = minEnd - minStart;
        }
        else if(minStart > minEnd){
            horaR -= 1;
            minR = (minEnd+60) - minStart;
        }
        else{ minR = 0; }

        if (secStart < secEnd){                 // segundos
            secR = secEnd - secStart;
        }
        else if(secStart > secEnd){
            minR -= 1;
            secR = (secEnd+60) - secStart;
        }
        else{ secR = 0; }

        if(horaR == -1){ horaR = 23; diasR -= 1; } // Corrigindo os "erros", pros resultados não darem -1...

        if(minR == -1){ minR = 0;}

        System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", diasR, horaR, minR, secR);
    }
}