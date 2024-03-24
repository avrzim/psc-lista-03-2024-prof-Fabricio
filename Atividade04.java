//Avalie o código abaixo e determine se suas saídas estão corretas. Primeiro, tente identificar a falha sem executar o programa; Em seguida, implemente e veja se acertou. Se houver erros, aponte-os e proponha e implemente as correções.


import java.util.Scanner;

public class Atividade04 {
    //colocar a public static de maneira correta
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = input.nextDouble();
        //retirar o println e corrigir o sistema de condicional

        if(salario <= 1000) {
            salario *= taxaAumento3;
        }

        else if(salario <= 2000) {
            salario *= taxaAumento2;
        }

        else if(salario <= 3000) {
            salario *= taxaAumento1;
        }

        else {
            salario = (salario * taxaAumento1) + 200;
        }
        //retirar o println
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);
        //fechar o Scanner
        input.close();
    }
}
