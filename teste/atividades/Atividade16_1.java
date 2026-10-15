import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade16_1 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>(); 
        
        System.out.println("Insira os nomes dos convidados da festa: ");
        System.out.println("(Escreva Sair para terminar o programa)");

        while(true) {
            // Solicitar ao utilizador os nomes para colocar na lista
            String nome = scanner.nextLine();


            if (nome.equalsIgnoreCase("Sair")){
                break;
            }

            convidados.add(nome);
        }
        //Percorre a lista
        System.out.println("....... Lista dos convidados ........ ");
        for (String convidado : convidados) {
            System.out.println(convidado);
        }
        // Fecha o scanner
        scanner.close();
     }
}
