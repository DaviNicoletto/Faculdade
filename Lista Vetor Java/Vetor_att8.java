//Faça um Programa que peça a idade e a altura de 5 pessoas, armazene
//cada informação no seu respectivo vetor. 
//Imprima a idade e a altura na ordem inversa a ordem lida.

package vetor_att8;
import java.util.Scanner;
public class Vetor_att8 {
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner (System.in);
        
        int vIdade [] = new int [5];
        float vAlt [] = new float [5];
        
        for (int  i = 0; i < vIdade.length; i++){
            System.out.printf("Digite a idade da %d° pessoa:\n", i +1);
            vIdade[i] = teclado.nextInt();
            System.out.printf("Digite a Altura da %d° pessoa:\n", i +1);
            vAlt[i] = teclado.nextInt();
        }
        System.out.println("------------------------------");
        for (int i = vIdade.length - 1; i >= 0; i--){
            System.out.printf("Idade da %d° pessoa:\n%d\n", i + 1, vIdade[i]);
            System.out.printf("Altura da %d° pessoa:\n%.2f\n", i +1 , vAlt[i]);
        }
        
    }
    
}
