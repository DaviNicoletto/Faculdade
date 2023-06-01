//Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que
//determine quantos alunos com mais de 13 anos possuem altura inferior à média 
//de altura desses alunos.
package vetor_att12;
import java.util.Scanner;
public class Vetor_att12 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        int n = 30;
        int [] idade = new int [n];
        float [] altura = new float [n];
        float soma = 0, med = 0;
        int contAluno = 0;
        
        for (int i = 0; i < n; i++){
            System.out.printf("Insira a altura do %d° aluno: \n", i + 1);
            altura [i]= teclado.nextFloat();
            System.out.printf("Insira a idade do %d° aluno: \n", i + 1);
            idade [i] = teclado.nextInt();
            soma = soma + altura [i];
        }
        
        med = soma / altura.length;
        
        for (int i = 0; i < n; i++){
           if (altura[i] < med && idade [i]> 13){
               contAluno++;
           } 
        }
        
        System.out.printf("Exitem %d alunos com mais de 13 anos e altura abaixo da média.", contAluno);
        
    }
    
}
