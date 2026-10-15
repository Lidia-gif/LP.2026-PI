package teste.atividades;

import java.util.Scanner;

public class Atividade5_1{

   public static void main(String[]args){
    Scanner Scanner = new Scanner(System.in);

    System.out.print("Introduza um número de 1 a 7: ");

    int numero = Scanner.nextInt();

    switch (numero) {
        case 1:System.out.println("Segunda feira");
            break;
        case 2:System.out.println("Terça feira");
            break;
        case 3:System.out.println("Quarta feira");
            break;
        case 4:System.out.println("Quinta feira");
            break;
        case 5:System.out.println("Sexta feira");
            break;
        case 6:System.out.println("Sábado");
            break;
        case 7:System.out.println("Domingo");
            break;
        default:System.out.println("Número inválido.Introduza um número de 1 a 7.");
    }

    Scanner.close();

   }
 }
