//Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
package vetor_att2;
import java.util.Scanner;
public class Vetor_Att2 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
    
    int n = 10;
    int v[] = new int [n];
 
    System.out.printf("O vetor tem %d posições.\n", v.length);
    for (int i = 0; i < v.length; i ++){
        
        System.out.printf("\nDigite um valor para a posição [%d] : ", i + 1);
        v[i] = teclado.nextInt();
        
    }
    System.out.println("\nOs valores armazenados nos vetores foram:");
    for (int i = v.length - 1; i >= 0; i --){
        
        System.out.printf(" %d,",v[i]);
        
    }
    System.out.println("");
        
    }
    
}
