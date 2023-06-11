//Olá, essa foi a minha resolução refente ao desafio final com a temática bancaria.
//Autor: Kaique Lima.

import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        Scanner inputTeclado = new Scanner(System.in);

        String nome;
        double saldo = 1320.00;
        double valor = 0;
        int opcao = 0;

        System.out.printf("""
                Olá, seja bem-vindo ao Banco Desafio!
                Por favor, digite seus dados para ter acesso a sua conta bancaria.\n
                """);
        System.out.printf("Digite seu nome completo: ");
         nome = inputTeclado.nextLine();
        System.out.printf("""
                \n
                **************************************************
                    Seja Bem-vindo %s ao Banco Desafio!
                **************************************************
                
                Dados do cliente:
                
                Nome:           %s.
                Tipo de Conta:  Corrente.
                Saldo Inicial:  %.2f
                
                """, nome, nome, saldo);

        while (opcao != 4){
            System.out.printf("""
                   -------------------------------------------      
                    
                    Operações
                    
                    1- Consultar Saldo
                    2- Receber Valor
                    3- Transferir Valor
                    4- Sair
                    
                    """);
            System.out.printf("Digite a opção desejada: ");
            opcao = inputTeclado.nextInt();
            System.out.println("");

            switch (opcao){

                default:
                    System.out.println("\n Opção inválida, Digite Novamente!");
                    break;

                case 1 :
                    System.out.printf("Olá %s, atualmente seu saldo é de R$ %.2f. \n", nome, saldo);
                    break;

                case 2:
                    System.out.printf("""
                            **** Menu - Receber Valor ****
                            
                            Digite o valor a ser recebido: R$   """);
                    valor = inputTeclado.nextDouble();

                    if(valor <= 0){
                        System.out.println("Entrada Inválida!");
                    }else{
                        saldo += valor;
                        System.out.println("Valor recebido com sucesso!");
                    }
                    break;

                case 3:
                    System.out.printf("""
                            **** Menu - Transferir Valor ****
                            
                            Digite o valor a ser Transferido: R$    """);
                    valor = inputTeclado.nextDouble();

                    if(valor > saldo){
                        System.out.println("Saldo insuficiente!");
                    }else{
                        saldo -= valor;
                        System.out.println("Valor transferido com sucesso!");
                        System.out.println("***************************** \n");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o Banco Desafio, até a próxima!");
                    opcao = 4;

                    break;
            }
        }
    }
}
