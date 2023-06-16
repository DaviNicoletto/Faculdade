
package atividade.pkg1.matrícula.e.notas;
import java.util.Scanner;

public class Atividade1Matr�culaENotas {
    public static void main(String[] args) {
    
        int mat = 0;
        float n1, n2, n3, med;
        
        Scanner teclado = new Scanner (System.in);
        
        
        while (mat >=0){
            
            System.out.print("Insira a matrícula do aluno: \n");
            mat = teclado.nextInt();
          
            if (mat<0){
                System.out.print("Programa encerrado. \n");
                System.exit(0);
            }
            
            System.out.println("Insira a primeira nota: ");
            n1 = teclado.nextFloat();
            
            System.out.println("Insira a segunda nota: ");
            n2 = teclado.nextFloat();
            
            System.out.println("Insira a terceira nota: ");
            n3 = teclado.nextFloat();
            
            med = (n1 + n2 + n3)/3;
            System.out.printf("A média das notas é %.2f, ", med);
            
            if (med<60){
                System.out.println("aluno reprovado. \n --------------");
            }else if (med>=60 && med<70){
                System.out.println("aluno em exame. \n --------------");
            }else if (med>=70){
                System.out.println("aluno aprovado. \n --------------");
            }
        }   
    }
}
