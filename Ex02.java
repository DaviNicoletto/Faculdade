
package ex02;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        int num;
        
        System.out.println("Insira um numero:");
        num = teclado.nextInt();
        
        if ((num % 2) == 0){
            System.out.println("O numero inserido eh par.");
        } else {
            System.out.println("O numero inserido eh impar.");
        }
        
    }
    
}
