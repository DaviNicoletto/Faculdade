package atividade.pkg4;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        
        int n = 0, cont = 1;
        
        System.out.println("Insira um número: ");
         n = teclado.nextInt();
        
         
        while ( n > 1 && cont <= n){
            
            System.out.print(cont +", ");
            cont = cont + 2;
            
        }
    
    }
    
}
/*Faça um programa que leia um número e que imprima
os números ímpares de 1 até o número informado. */