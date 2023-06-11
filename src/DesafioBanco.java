import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner inputTeclado = new Scanner(System.in);

        String nome;

        System.out.printf("""
                Olá, seja bem-vindo ao Banco Desafio!
                Por favor, digite seus dados para ter acesso a sua conta bancaria.\n
                """);
        System.out.printf("Digite seu nome completo: ");
         nome = inputTeclado.nextLine();
        System.out.println();


    }
}
