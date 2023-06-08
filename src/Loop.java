import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeAva = 0;

        while (nota != -1){
            System.out.println("Diga a sua avaliação para o filme");
            nota = leitura.nextDouble();

            if(nota != -1){
            mediaAvaliacao += nota;
            totalDeAva++;
            }

        }

        System.out.println("A Média de avaliações: " + mediaAvaliacao/totalDeAva);
    }
}
