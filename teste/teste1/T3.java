package teste1;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       String nome;
       int idade;
       double salario;
       char sexo;
       char estadoCivil;

       // 1 Nome
        do {
            System.out.print("Nome (Deve ter obrigatoriamente mais de 3 caracteres): ");
            nome = input.nextLine();

            if (nome.length() <= 3) {
                System.out.println("Nome deve ter mais de 3 caracteres! Tente novamente.");
            } 
        } while (nome.length() <= 3);
        System.out.println("Olá, " + nome + "\n");

        // 2 Idade
        do {
            System.out.print("Escreva a idade entre 0 e 150: ");
            idade = input.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida. Tente novamente.");
            }
        } while (idade < 0 || idade > 150);
        System.out.println("Idade válida.");

        // 3 Salário
        do {
            System.out.print("Escreva o salário maior que 0: ");
            salario = input.nextDouble();

            if (salario <= 0) {
                System.out.println("Salário inválido. Tente novamente.");
            }
        } while (salario <= 0);
        System.out.println("Salário válido.");

        // 4  Sexo
        do {
            System.out.print("Escreva o sexo (M/F): ");  
            sexo = input.next().toUpperCase().charAt(0);   
            
            if (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo inválido. Tente novamente.");
            }
        } while (sexo != 'M' && sexo != 'F');
        System.out.println("Sexo válido.");

        // 5 Estado Civil
        do {
            System.out.print("Escreva o estado civil (S/C/V/D): ");
            estadoCivil = input.next().toUpperCase().charAt(0);

            if (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
                System.out.println("Estado civil inválido. Tente novamente.");
            }
        } while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D');
        System.out.println("Estado civil válido.\n");

        // Fim do programa
        System.out.println("--- Todos os dados foram inseridos com sucesso! ---");
        input.close();
}  }