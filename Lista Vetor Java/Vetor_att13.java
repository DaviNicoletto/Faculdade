//Faça um programa que receba a temperatura média de cada mês
//do ano e armazene-as em uma lista. Após isto, calcule a média anual 
//das temperaturas e mostre todas as temperaturas acima da média anual, 
//e em que mês elas ocorreram 
//(mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
package vetor_att13;
import java.util.Scanner;
public class Vetor_att13 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        
        float soma = 0, med = 0;
        float [] temp = new float [12];
        String mes = null;
       
        
        for(int i = 0; i < temp.length; i++){
            
        if (i == 0){
            mes = "Janeiro";
        } else if (i == 1){
            mes = "Fevereiro";
        }else if (i == 2){
            mes = "Março";
        }else if (i == 3){
            mes = "Abril";
        }else if (i == 4){
            mes = "Maio";
        }else if (i == 5){
            mes = "Junho";
        }else if (i == 6){
            mes = "Julho";
        }else if (i == 7){
            mes = "Agosto";
        }else if (i == 8){
            mes = "Setembro";
        }else if (i == 9){
            mes = "Outubro";
        }else if (i == 10){
            mes = "Novembro";
        }else if (i == 11){
            mes = "Dezembro";
        }
        
        System.out.printf("Digite a temperatura média do mês de %s:\n", mes);
        temp[i] = teclado.nextFloat();
        soma = soma + temp [i];
        }
        med = soma / 12;
        
        System.out.println("Tempertaura acima da media nos meses:");
        for(int i = 0; i< temp.length ; i++){
            
            if (temp [i] > med){
                
               if (i == 0){
                   mes = "Janeiro";
               } else if (i == 1){
                   mes = "Fevereiro";
               }else if (i == 2){
                   mes = "Março";
               }else if (i == 3){
                   mes = "Abril";
               }else if (i == 4){
                   mes = "Maio";
               }else if (i == 5){
                   mes = "Junho";
               }else if (i == 6){
                   mes = "Julho";
               }else if (i == 7){
                   mes = "Agosto";
               }else if (i == 8){
                   mes = "Setembro";
               }else if (i == 9){
                   mes = "Outubro";
               }else if (i == 10){
                   mes = "Novembro";
               }else if (i == 11){
                   mes = "Dezembro";
               }
                System.out.printf("%s: %.2f.\n", mes, temp[i]);
                
            }
        }
    }
    
}
