
package ex01.lista;
import java.util.Scanner;

public class Ex01Lista {
    public static void main(String[] args) {
        
      Scanner leitor = new Scanner (System.in);
      int a, b, c, soma;
      
      System.out.println("Insira o valor de A: ");
      a = leitor.nextInt();
      System.out.println("Insira o valor de B: ");
      b = leitor.nextInt();
      System.out.println("Insira o valor de C: ");
      c = leitor.nextInt();
      
      soma = a + b;
      
      if (soma < c){
          System.out.println("A soma de A e B é menor do que C.");
      } else {
          System.out.println("A soma de A e B é maior do que C.");
      }
      
    }
    
}
