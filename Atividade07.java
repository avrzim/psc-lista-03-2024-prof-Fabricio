//Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. 
//Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
//- Se quantidade <= 5, o desconto será de 2%- Se quantidade > 5 e quantidade <=10, o desconto será de 3%- Se quantidade > 10 e quantidade <30, o desconto será de 5% -Se quantidade >= 30 o desconto será de 10%

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        double quantidade, precoUni, precoTotal, desconto,precoDesc;

        System.out.println("Digite o nome do produto: ");
        nome = input.nextLine();

        System.out.println("Digite o preço unitário do produto: ");
        precoUni= input.nextDouble();

        System.out.println("Digite a quantidade do produto que você comprou: ");
        quantidade= input.nextDouble();

        precoTotal = quantidade * precoUni;

        desconto = precoTotal / 100;

        System.out.println("O preço total é: " + precoTotal);

        if (quantidade <= 5){
            precoDesc = precoTotal - (desconto * 2);
            System.out.println("O preço total com desconto é: " + precoDesc);
        }else if (quantidade > 5){
            precoDesc = precoTotal - (desconto * 3);
            System.out.println("O preço total com desconto é: " + precoDesc);
        }else if (quantidade > 10){
            precoDesc = precoTotal - (desconto * 5);
            System.out.println("O preço total com desconto é: " + precoDesc);
        }else{
            precoDesc = precoTotal - (desconto * 10);
            System.out.println("O preço total com desconto é: " + precoDesc);
        }
        input.close();
    }
}
