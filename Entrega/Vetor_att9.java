//Faça um Programa que leia um vetor A com 10 números inteiros,
//calcule e mostre a soma dos quadrados dos elementos do vetor.
package vetor_att9;
import java.util.Scanner;
public class Vetor_att9 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        
        int A [] = new int [10], pow [] = new int [10];
        int soma = 0;
        
        System.out.println("Digite 10 números:");
        
        for(int i = 0; i < A.length; i++){
         
            A[i]=teclado.nextInt();
            pow[i]=A[i]*A[i];
            soma = soma + pow[i];
        }
        System.out.printf("A soma dos quadrados dos 10 números inseridos é: %d\n", soma);
        
    }
    
}
