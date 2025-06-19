import java.io.IOException;
import java.util.Scanner;

public class Main1094  {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); int n = Integer.parseInt(x);
        int totalCobaias = 0, totalCoelho = 0, totalRatos = 0, totalSapos = 0;
        
        for(int i = 1; i <= n; i++){ 
            String cobaia = sc.nextLine();
            String[] separadorCobaia = cobaia.split(" ");
            int quantiaCobaia = Integer.parseInt(separadorCobaia[0]);
            totalCobaias += quantiaCobaia;
            if(separadorCobaia[1].equals("C")){ totalCoelho += quantiaCobaia;}
            if(separadorCobaia[1].equals("R")){ totalRatos += quantiaCobaia;}
            if(separadorCobaia[1].equals("S")){ totalSapos += quantiaCobaia;}
        }
        sc.close();
        System.out.printf("Total: %d cobaias\n",totalCobaias);
        System.out.printf("Total de coelhos: %d\nTotal de ratos: %d\nTotal de sapos: %d\n",totalCoelho,totalRatos,totalSapos);
        double percentualCoelho = (totalCoelho * 100.0) / totalCobaias; 
        double percentualRatos = (totalRatos * 100.0) / totalCobaias;
        double percentualSapos = (totalSapos * 100.0) / totalCobaias;
        System.out.printf("Percentual de coelhos: %.2f %%\nPercentual de ratos: %.2f %%\nPercentual de sapos: %.2f %%\n",percentualCoelho,percentualRatos,percentualSapos);
    }
}