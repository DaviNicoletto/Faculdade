package ex04;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int a;
        
        System.out.println("Insira um numero:");
        a = teclado.nextInt();
        
        if (a >= 0){
            
            a = a * 2;
            System.out.println("O numero inserido eh positivo, e seu dobro eh: "+a);
            
        } else {
            
            a = a * 3;
            System.out.println("O numero inserido eh negativo, e seu triplo eh: "+a);
            
        }
        
        
    }
    
}
