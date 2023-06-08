import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 4;
        int numero = 0;

        //System.out.println(numeroAleatorio); Mostra o numero aleátorio.

        while (numeroTentativas >= 0){
            System.out.println("Digite um número entre 0 e 100: ");
            numero = leitura.nextInt();

            if (numeroTentativas == 0){
                System.out.printf("""
                        Você perdeu!!!
                        O número sorteado era : %d
                        """,numeroAleatorio);
                break;
            }

            if (numero == numeroAleatorio){
                System.out.printf(""" 
                                      Parabéns!! Você o numero sorteado!
                                      O número sorteado é %d
                                      """, numeroAleatorio);
                break;
            }

            if (numero > numeroAleatorio){
                System.out.printf("""
                O número sorteado é menor que %d            
                Faltam %d tentativas! \n""", numero, numeroTentativas);
                numeroTentativas--;

            } else if (numero < numeroAleatorio) {
                System.out.printf("""
                O número sorteado é maior que %d              
                Faltam %d tentativas! \n""", numero, numeroTentativas);
                numeroTentativas--;

            }
        }


    }
}
