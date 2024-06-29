import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Desafio Contador OZZZZZZZZZ");      
        Scanner terminal = new Scanner(System.in);
        int [] numero = new int[2];
        
        for(int i = 0; i < Array.getLength(numero); i++){
            System.out.println("Você precisa digitar 2 números inteiros, agora digite o primeiro e pressiona ENTER: ");   
            numero[i] = terminal.nextInt();
            }
        try {
                if( numero[0]> numero[1]){
                    System.out.println( "digite o primeiro número menor que o segundo numero ");
                    for(int i = 0; i < Array.getLength(numero); i++){
                        System.out.println("Você precisa digitar 2 números inteiros, agora digite o primeiro e pressiona ENTER: ");   
                        numero[i] = terminal.nextInt();
                        }
                }
            } catch (Exception e) {
                System.out.println( "PArabens ");
            }

        terminal.close();
      
        for(int i=0; i<2 ; i++){
            System.out.println(" o numero digitado é " + numero[i] );

        }
    }

}
