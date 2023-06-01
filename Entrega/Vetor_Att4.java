//Faça um Programa que leia um vetor de 10 caracteres,
//e diga quantas consoantes foram lidas. Imprima as consoantes.
package vetor_att4;
import java.util.Scanner;
public class Vetor_Att4 {
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
        
        int n = 10, cont = 0;
        char vetor [] = new char [n], con [] = new char [n];
        
        
        System.out.println("Digite 10 letras:");
        
        for (int i = 0; i < vetor.length; i++){
            vetor [i] = teclado.nextLine().charAt(0);
            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u'){
                
                con [i] = vetor [i];
                cont ++;
            }
           }
        System.out.println("As letras inseridas foram:");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%s, ", vetor[i]);
        }
        System.out.printf("\nDentre as quais, %d são consoantes.\n", cont);
        System.out.println("Consoantes inseridas:");
        for (int i = 0; i < vetor.length; i++){
            
            if (con [i] != 0){
            System.out.printf("%s, ", con[i]);
        }
        }
    }
}
    

