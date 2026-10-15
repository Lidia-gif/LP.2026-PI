package calculadoraNumeros;

public class Main {
    public static void main(String[] args) {
        // Cria uma variável da classe CalculadoraNumeros
        CalculadoraNumeros calculadoraAlunos = new CalculadoraNumeros();
        String nome = "Lidia Maria";

        // Chama os método 1 -  classe 'CalculadoraNumeros'
        calculadoraAlunos.procurarNumeros();
        // Chama os método 2 -  classe 'CalculadoraNumeros'
        calculadoraAlunos.mostrarNumeros();
        // Chama os método 3 -  classe 'CalculadoraNumeros'
        System.out.println("Soma Total: " + calculadoraAlunos.calcularSoma());

       
    }
}
