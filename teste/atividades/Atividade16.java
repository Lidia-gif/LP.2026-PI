import java.util.Scanner; 

public class Atividade16 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] convidados1 = {"Ana", "Olívia", "Óscar", "Maria", "Francisco", "Pedro", "Miguel"};
        
        System.out.println("Os convidados da festa são: ");

        for (String convidado : convidados1){
            System.out.println(convidado);
        }
        
        scanner.close();
     }
}
