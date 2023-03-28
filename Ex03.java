package ex.pkg03;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int a, b, c;
        
        System.out.println("Insira o valor de A:");
        a = teclado.nextInt();
        System.out.println("Insira o valor de B:");
        b = teclado.nextInt();
     
        if (a == b){
            
            c = a + b;
            System.out.println("'A' eh igual a 'B', e sua soma eh: "+c);
            
        } else {
            
            c = a * b;
            System.out.println("'A' nao eh igual a 'B', e seu produto eh: "+c);
            
        }
        
    }
    
}
