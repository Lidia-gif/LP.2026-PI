package calculadoraNumeros;

import java.util.ArrayList;

public class CalculadoraNumeros {
    ArrayList<Integer> numeros = new ArrayList<>();
    int sun = 0;


        //Metodo1
        public void procurarNumeros(){
            for (int vari = 1; vari <= 1000; vari++) {
                if (vari % 3 == 0 && vari % 5 == 0) {
                    numeros.add(vari);
                    // sun += vari;

                    if (numeros.size() == 5) {
                    break;

                    }
        }    }
        }
        //Metodo2
        public void mostrarNumeros(){
            for (int numero : numeros) 
                System.out.println("Numero : " + numero);

            
        }
        //Metodo3
        public int calcularSoma() {
            for (int numero : numeros) 
                sun += numero;
            
            return sun;
        }
    
}
