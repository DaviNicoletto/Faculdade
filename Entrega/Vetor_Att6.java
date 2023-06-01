//Faça um Programa que peça as quatro notas de 10 alunos, calcule e 
//armazene num vetor a média de cada aluno, imprima o número de alunos com 
//média maior ou igual a 7.0.
package vetor_att6;
import java.util.Scanner;
public class Vetor_Att6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int n = 10, cont = 0;
        double media [] = new double [n];
        
        
        for (int i = 0; i < media.length; i++){
            float nota = 0, soma = 0;
            System.out.printf("Digite as 4 notas do %d° aluno: \n", i + 1);
            for (int x = 0; x < 4; x++){
                nota = teclado.nextFloat();
                soma = soma + nota;
            }
            media [i] = soma/4;
            if (media[i] >= 7){
                cont++;
            }
        }
        
        System.out.println("O número de alunos com média maior ou igual a 7 é " + cont +".");
        
    }
    
}
