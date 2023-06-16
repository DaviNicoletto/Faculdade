
package atividade.pkg5.média.de.temperatura;
import java.util.Scanner;

public class Atividade5MédiaDeTemperatura {
public static void main(String[] args) {


    Scanner teclado = new Scanner (System.in);
    int cont = 0;
    float temp = 0, medtemp = 0;
    
    System.out.println("Informe a temperatura dos 10 primeiros dias de janeiro de 2021: ");
    
    while (cont<10){
        
        temp = teclado.nextFloat();
        medtemp = medtemp + temp;
                
        cont ++;
    }
    
    medtemp = medtemp/cont;
    
    System.out.println("A média das temperaturas é de: "+medtemp);
    
}
    
}
