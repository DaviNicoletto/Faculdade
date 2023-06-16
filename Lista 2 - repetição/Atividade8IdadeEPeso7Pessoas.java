package atividade.pkg8.idade.e.peso.pkg7.pessoas;
import java.util.Scanner;

public class Atividade8IdadeEPeso7Pessoas {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        
        int contloop = 0, contp = 0, idade = 0, medidade = 0;
        float peso = 0;
        
        while (contloop <7){
            
            System.out.printf("\n%d° pessoa:\n", contloop + 1);
            
            System.out.println("Idade:");
            idade = teclado.nextInt();
            
            System.out.println("Peso:");
            peso = teclado.nextFloat();
            
            if(peso > 90){
                contp ++;
            }
            
            medidade = medidade + idade;
            contloop++;
        }
        
        medidade = medidade / contloop;
    
        System.out.printf("\nA média das idades é igual a %d.\nO número de pessoas com mais de 90Kg é igual a %d.", medidade, contp);
    }
    
}
