
package ex06;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner (System.in);
        float peso, altura, imc;
        
        System.out.println("Insira o seu peso: ");
        peso = teclado.nextFloat();
        System.out.println("Insira a sua altura: ");
        altura = teclado.nextFloat();
        
        imc = (peso/(altura * altura));
        
        if(imc < 20){
            
            System.out.printf("O seu IMC eh de " + (imc)) ;
            System.out.printf(" e voce esta abaixo do peso." );
        }
        if(imc >= 20 && imc < 25){
            
            System.out.printf("O seu IMC eh de " + imc );
            System.out.printf(" e voce esta dentro da normalidade." );
        }
        if(imc >= 25 && imc < 30){
            
            System.out.printf("O seu IMC eh de " + imc );
            System.out.printf(" e voce esta acima do peso." );
        }
        if(imc >= 30 && imc < 40){
            
            System.out.printf("O seu IMC eh de " + imc );
            System.out.printf(" e voce esta obeso." );
        }
        if(imc >= 40){
            
            System.out.println("O seu IMC eh de " +imc );
            System.out.println(" e voce esta com obesidade morbida." +imc );
        }
    }
    
}
