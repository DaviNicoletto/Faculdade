//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
package vetor_att3;
import java.util.Scanner;
public class Vetor_att3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
    
    int n = 4;
    int v[] = new int [n];
    float nota = 0, med = 0, soma = 0;
    
  
    for (int i = 0; i < v.length; i ++){
        
        System.out.printf("\nDigite a %d° nota: ", i + 1);
        v[i] = teclado.nextInt();
        soma = soma + v[i];
    }
    med = soma / v.length;
  
    System.out.printf("-------------------------\nA média das notas é: %.2f. \n", med);
        
    }
    
}
