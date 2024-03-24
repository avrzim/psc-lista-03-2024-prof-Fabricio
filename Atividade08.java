//Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. Seu programa deve receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. Restrição: Em um triângulo, o comprimento de um lado é sempre menor do que a soma dos outros dois!

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("Informe o comprimento do primeiro lado do triângulo: ");
        lado1 = input.nextDouble();

        System.out.println("Informe o comprimento do segundo lado do triângulo: ");
        lado2 = input.nextDouble();

        System.out.println("Informe o comprimento do terceiro lado do triângulo: ");
        lado3 = input.nextDouble();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("O triângulo é equilátero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("O triângulo é escaleno");
        } else {
            System.out.println("O triângulo é isósceles");
        }
        input.close();
    }
}
