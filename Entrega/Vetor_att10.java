//Faça um Programa que leia dois vetores com 10 elementos cada.
//Gere um terceiro vetor de 20 elementos, cujos valores deverão ser 
//compostos pelos elementos intercalados dos dois outros vetores.

package vetor_att10;
import java.util.Scanner;

public class Vetor_att10 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        
        int a [] = new int[10];
        int b [] = new int[10];
        int c [] = new int[20];
        
       
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            a[i] = teclado.nextInt();
        }
        
        
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < a.length; i++) {
            b[i] = teclado.nextInt();
        }
        
       
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            c[j++] = a[i];
            c[j++] = b[i];
        }
        
       
        for (int i = 0; i<c.length; i++){
            System.out.printf("%d, ",c[i]);
        }
    }
    }
    

