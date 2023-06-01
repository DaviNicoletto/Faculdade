
//Utilizando listas faça um programa que faça 5 perguntas para uma pessoa 
//sobre um crime. As perguntas são:
//a.	"Telefonou para a vítima?"
//b.	"Esteve no local do crime?"
//c.	"Mora perto da vítima?"
//d.	"Devia para a vítima?"
//e.	"Já trabalhou com a vítima?" O programa deve no final 
//emitir uma classificação sobre a participação da pessoa no crime.
//Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
//entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, 
//ele será classificado como "Inocente".

package vetor_att14;
import java.util.Scanner;
public class Vetor_att14 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        String reu, vitima, juiz;
        String resposta [] = new String [5];
        int cont = 0;
        
        System.out.println("Nome do réu:");
        reu = teclado.nextLine();
        System.out.println("Nome do morto:");
        vitima = teclado.nextLine();
        System.out.println("Nome do juiz:");
        juiz = teclado.nextLine();
        
        System.out.printf("\n- Dando início ao interregatório referente à participação do cidadão %s\nno homicídio da vítima %s, seguem as perguntas:\n\n", reu, vitima);
        
        for (int i = 0; i < 5; i++){
            
            if (i==0){
                System.out.println("O réu telefonou para a vítima no dia do crime?");
            } else if (i==1){
                System.out.println("O réu esteve no local do crime na data em questão?");
            } else if (i==2){
                System.out.printf("O reú mora perto da vítima %s?\n",vitima);
            } else if (i==3){
                System.out.printf("Sr. %s, havia alguma dívida pendente com a vítima?\n", reu);
            } else if (i==4){
                System.out.println("A vítima e o réu trabalhavam juntos?");
            }
            
            resposta [i] = teclado.nextLine();
            
            if (resposta[i].equals("sim") || resposta[i].equals("Sim") || resposta[i].equals("s")){
                cont++;
            }
        }
            if(cont==2){
                System.out.printf("- %s ainda é um suspeito.\n", reu);
            }else if (cont==3 || cont ==4){
                System.out.printf("- %s é cúmplice deste crime!\n", reu);
            }else if (cont==5){
                System.out.printf("- Pelos poderes conferidos a mim, %s por este tribunal, declado culpado o réu %s pelo homcídio da vítima, %s!!\n", juiz, reu, vitima);
            } else {
                System.out.println("- Declaro, para fins de blablabla, que o réu é inocente!");
            }
        }
        
    }
    

