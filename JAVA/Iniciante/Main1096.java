import java.io.IOException;

public class Main1096 {
    public static void main(String[] args) throws IOException {
        int i = 1;
        System.out.printf("I=%d J=7\n",i);
        System.out.printf("I=%d J=6\n",i);
        System.out.printf("I=%d J=5\n",i);
        
        for(i = 3;i <= 9; i += 2){ 
            System.out.printf("I=%d J=7\n",i);
            System.out.printf("I=%d J=6\n",i);
            System.out.printf("I=%d J=5\n",i);
        }
    }
}