package atividade.pkg7.maior.e.menor.nota;
import java.util.Scanner;

public class Atividade7MaiorEMenorNota {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        
        int contloop = 1;
        float nota = 0, maiornota = 0, notaant = 0;
        
        while (contloop < 6){
            
            notaant = nota;
            
            System.out.printf("\nInsira a nota do %d° aluno:\n", contloop);
            nota = teclado.nextFloat();
            
            if (nota > notaant){
                maiornota = nota;
            }
            
            contloop++;
        }
    
        System.out.printf("\nA maior nota é %.2f.", maiornota);
    }
    
}
