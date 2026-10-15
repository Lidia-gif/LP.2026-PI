package teste1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor entre 0 e 10:");
        
        int i = 0;
        do {
            System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
            // Atribui o valor inserido pelo user numa variável
            int nota = input.nextInt();

            // Verifica se a nota introduzida está no intervalo correto (maior ou igual a 0 E menor ou igual a 10).
            if (nota >= 0 && nota <= 10) {
                System.out.println("Valor inválido!  Nota Inserida- " + nota);
            }
        }while (nota > 0 || nota < 10) {
            System.out.println("Valor válido!  Muito bem!");
        }


        input.close();

    }
}
