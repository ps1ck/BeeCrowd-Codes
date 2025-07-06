import java.io.IOException;

public class Main1097 {
    public static void main(String[] args) throws IOException {

        int i, jInit = 7, j;

        for(i = 1; i <= 9; i +=2){
            System.out.printf("I=%d J=%d\n",i,jInit);
            j = jInit - 1;
            System.out.printf("I=%d J=%d\n",i,j);
            j -= 1;
            System.out.printf("I=%d J=%d\n",i,j);
            jInit += 2;
        }
        
    }
}