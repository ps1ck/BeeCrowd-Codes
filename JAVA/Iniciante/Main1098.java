    import java.io.IOException;

    public class Main1098 {
        public static void main(String[] args) throws IOException {

            for (int i = 0; i <= 10; i++){
                double valorI = i * 0.2; // 0.0 0.2 0.4 ....

                for (int j = 1; j <= 3; j++){
                    double valorJ = valorI + j; // 1.0 + 0.2 = 1.2, 2.2, 3.2 ....

                    if (valorI % 1 == 0){
                        System.out.printf("I=%.0f J=%.0f\n",valorI,valorJ);
                    } else { System.out.printf("I=%.1f J=%.1f\n",valorI,valorJ); }
                }
            }

        }
    }