//Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura de seleção Switch/Case para implementar seu produto. Utilize números inteiros para indicar cada opção.

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Digite 1 para exibir saldo, 2 para Exibir extrato, 3 para Realizar depósito, 4 para Realizar saque, 5 para Sair");
        numero = input.nextInt();

        switch(numero){
            case 1:
                System.out.println("Você escolheu exibir saldo!");
                break;
            case 2:
                System.out.println("Você escolheu exibir extrato!");
                break;
            case 3:
                System.out.println("Você escolheu realizar depósito!");
                break;
            case 4:
                System.out.println("Você escolheu realizar saque!");
                break;
            case 5:
                System.out.println("Você escolheu sair!");
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }
        input.close();
    }
}
