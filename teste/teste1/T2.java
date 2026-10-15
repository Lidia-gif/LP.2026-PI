package teste1;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String usuario;
        String senha;

        do {
            System.out.print("Escreva o nome do usuário: ");
            usuario = input.nextLine();

            System.out.print("Escreva a senha: ");
            senha = input.nextLine();
             
            if (senha.equals(usuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");

            }
        } while(senha.equals(usuario));
        
        System.out.println(" Login realizado com sucesso!");

        input.close();

    }
}
 

       

         