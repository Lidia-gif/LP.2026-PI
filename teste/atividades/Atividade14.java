package teste.atividades;

public class Atividade14 {
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}; 
        int[] numdias = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        int i = 0;
        for(String mes: meses){
            System.out.println(" O Mês de " + mes + " tem " + numdias[i] + " dias");
            i++;
        }    

        
    }
}
