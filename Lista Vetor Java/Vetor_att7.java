
package vetor_att7;
import java.util.Scanner;

public class Vetor_att7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int n = 5, soma = 0, mult = 1;
        int num [] = new int [n];
        
        System.out.println("Digite 5 números:");
        
        for (int i = 0; i < num.length; i++){
            
            num [i] = teclado.nextInt();
            soma = soma + num [i];
            mult = mult * num[i];
        }
        
        System.out.printf("A soma e a multiplicação dos números digitados é %d e %d, respectivamente.", soma, mult);
        
    }
    
}
