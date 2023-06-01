//Faça um Programa que leia 20 números inteiros e armazene-os num vetor. 
//Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. 
//Imprima os três vetores.
package vetor_att5;
import java.util.Scanner;
public class Vetor_Att5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int n = 20;
       
        int num [] = new int [n];
        int par [] = new int [n];
        int impar[] = new int [n];
        
        System.out.println("Digite 20 números:");
        
        for(int i = 0; i < num.length; i++){
            
            System.out.printf("%d: ", i + 1);
            num[i] = teclado.nextInt();
            
            if(num[i]%2 == 0){
                par[i] = num[i];
            } else {
                impar[i] = num[i];
            }
        }
        
        System.out.println("Os números digitados foram:");
        
        for (int i = 0; i < num.length; i++){
            
            System.out.printf("%d, ", num[i]);
            
    }
        System.out.println("\nOs números PARES digitados foram:");
        
        for (int i = 0; i < num.length; i++){
            if(par[i]!=0){
            System.out.printf("%d, ", par[i]);
            }
    }
        System.out.println("\nOs números IMPARES digitados foram:");
        
        for (int i = 0; i < num.length; i++){
            if(impar[i]!=0){
            System.out.printf("%d, ", impar[i]);
            }
         
    }
    }
    
}
