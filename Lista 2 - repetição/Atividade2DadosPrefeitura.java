
package atividade.pkg2.dados.prefeitura;
import java.util.Scanner;

public class Atividade2DadosPrefeitura {
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);
        
        int cont = 0, fil;
        float sal = 0;
        float salsoma = 0;
        int filsoma = 0;
        
        while (sal >= 0){
            
            System.out.println("Insira o salário: ");
            sal = teclado.nextInt();
            
            if (sal < 0){
                break;
            }
           
            salsoma = salsoma + sal;
            
            System.out.println("Insira o número de filhos: ");
            fil = teclado.nextInt();
            
            
            filsoma = filsoma + fil;
            
            cont++;
        }
        
        float medsal = 0;
        medsal = salsoma / cont;
        
        int medfil = 0;
        medfil = filsoma / cont;
        
        System.out.printf("\nA média dos salários é de: %.2f \n", medsal);
        System.out.printf("A média do número de filhos é de: %d \n", medfil);
    }
}