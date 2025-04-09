import java.io.IOException;
import java.util.Scanner;

public class Main1049 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String etapa1 = sc.nextLine(); String etapa2 = sc.nextLine(); String etapa3 = sc.nextLine();
        sc.close();

        if(etapa1.equals("vertebrado")){            /* Método pra comparar string que funcionou nesse caso! */
            
            if(etapa2.equals("ave")){

                if(etapa3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else if(etapa3.equals("onivoro")){
                    System.out.println("pomba");
                }

            }
            else if(etapa2.equals("mamifero")){
                
                if(etapa3.equals("onivoro")){
                    System.out.println("homem");
                }
                else if(etapa3.equals("herbivoro")){
                    System.out.println("vaca");
                }

            }

        }
        else if(etapa1.equals("invertebrado")){

            if(etapa2.equals("inseto")){

                if(etapa3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else if(etapa3.equals("herbivoro")){
                    System.out.println("lagarta");
                }

            }
            else if(etapa2.equals("anelideo")){
                
                if(etapa3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else if(etapa3.equals("onivoro")){
                    System.out.println("minhoca");
                }

            }
           
        }

    }
}