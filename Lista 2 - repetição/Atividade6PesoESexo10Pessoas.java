package atividade.pkg6.peso.e.sexo.pkg10.pessoas;
import java.util.Scanner;

public class Atividade6PesoESexo10Pessoas {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        
        int contloop = 1, conth = 0, contm = 0;
       
        while (contloop<11){
            
            float peso = 0, sexo = 0;
            
            System.out.printf("\n%d° pessoa: \n", contloop);
            
            System.out.println("insira o sexo ('1' para homem e '2' para mulher): ");
            sexo = teclado.nextFloat();
            
            System.out.println("Peso (Em Kg):");
            peso = teclado.nextFloat();
            
            if (sexo == 1 && peso >= 60 && peso <= 80){
                conth++;
            } else if (sexo == 2 && peso >= 50 && peso <= 70){
                contm++;
            }
            
            contloop++;
        }
        
        System.out.printf("\nO número de mulheres que pesam entre 50Kg e 70 Kg é de %d \nO número de homens que pesam entre 60Kg e 80Kg é de %d.", contm, conth);
       
    }
    
}
