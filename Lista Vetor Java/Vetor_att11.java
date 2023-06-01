//Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
package vetor_att11;
import java.util.Scanner;
public class Vetor_att11 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        
        int a [] = new int[10];
        int b [] = new int[10];
        int d [] = new int [10];
        int c [] = new int[30];
        
       
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            a[i] = teclado.nextInt();
        }
        
        
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < a.length; i++) {
            b[i] = teclado.nextInt();
        }
        
        
          System.out.println("Digite os elementos do terceiro vetor:");
        for (int i = 0; i < d.length; i++) {
            d[i] = teclado.nextInt();
        }
        
       
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            c[j++] = a[i];
            c[j++] = b[i];
            c[j++] = d[i];
        }
        
       
        for (int i = 0; i<c.length; i++){
            System.out.printf("%d, ",c[i]);
        }
        
    }
    
}
