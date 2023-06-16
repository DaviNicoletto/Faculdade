package atividade.pkg3;
import java.util.Scanner;

public class Atividade3 {
    
    public static void main(String[] args) {
    
        int cont;
        float n = 0;
        
        Scanner teclado = new Scanner (System.in);
        
        for (cont = 1 ; cont<=5 ; cont++){
            
            System.out.println("Insira o número: ");
            n = teclado.nextFloat();
            n = n * 2;
            
            System.out.printf("O dobro do número inserido é %.2f. \n -------------- \n", n);
          
            n = 0;
            
        }
        
    
    }
    
}
