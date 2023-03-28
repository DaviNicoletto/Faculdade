
package ex05;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        double n1, n2, n3, med;
        
        System.out.println("Insira as notas do aluno:");
        
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();
        
        med = ((n1 + n2 + n3)/3);
        
        if( med >= 0 && med < 3){
            
            System.out.println("Reprovado, com media = "+med);
            
        } if (med >= 3 && med < 7){
            
            System.out.println("Em exame, com media = "+med);
            
        }if (med >= 7 && med <= 10){
            
            System.out.println("Aprovado com media = "+med);
            
        }
        
    }
    }
    

