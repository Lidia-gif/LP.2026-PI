package calculadoraNumeros;

import java.util.ArrayList;

public class Exercicio18 {
    
    public static void main(String[] args) {
        int sun = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
    
        //Faça um loop para encontrar os primeiros 5 números que podem ser divididos por 3 e por 5.
        for (int vari = 1; vari <= 1000; vari++) {
            if (vari % 3 == 0 && vari % 5 == 0) {
            // Adiciona o número à lista de números encontrados
            numeros.add(vari);
            sun += vari;

            System.out.println("Numero Guardado: " + vari);
            //Verifica o tamanho do ArrayList 
            if (numeros.size() == 5) {
                break;
            }
        }
        }
          System.out.println("Numeros encontrados: " + numeros);
          System.out.println("Soma dos números encontrados: " + sun);
    }
}
  