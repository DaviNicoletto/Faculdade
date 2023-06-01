//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os

package vetor_att.pkg1;
import java.util.Scanner;
public class Vetor_Att1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
    
    int n = 5;
    int v[] = new int [n];
 
    System.out.printf("O vetor tem %d posições.\n", v.length);
    for (int i = 0; i < v.length; i ++){
        
        System.out.printf("\nDigite um valor para a posição [%d] : ", i + 1);
        v[i] = teclado.nextInt();
       
    }
    System.out.println("\nOs valores armazenados nos vetores foram:");
    for (int i = 0; i < v.length; i ++){
        
        System.out.printf(" %d,",v[i]);
        
    }
    System.out.println("");
        
    }
    
}
