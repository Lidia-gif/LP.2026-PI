package teste.atividades;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}; 
        int[] numdias = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        System.out.print("Escreva o ano para verificar se é bissexto: ");
        int ano = scanner.nextInt();


        int contador = 0;
        for(String mes: meses){
             if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                 numdias[1] = 29;
                System.out.println("O Mês de " + mes + " tem " + numdias[contador] + " dias ");
                contador++;
            }else{
                System.out.println("O Mês de " + mes + " tem " + numdias[contador] +  " dias ");
                contador++;
        }   }

        scanner.close();

    }

}    

        
  



