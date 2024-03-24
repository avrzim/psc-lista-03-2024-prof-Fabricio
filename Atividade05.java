//Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida pela equação: IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo: 


import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, altura, IMC;

        System.out.println("Digite seu peso em quilograma: ");
        peso = input.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        altura = input.nextDouble();

        IMC = peso / (altura * altura);

        if (IMC < 20){
            System.out.println("Você está abaixo do peso!");
        }else if (IMC < 25){
            System.out.println("Você está no peso normal!");
        }else if(IMC < 30){
            System.out.println("Você está com sobrepeso!");
        }else if(IMC < 40){
            System.out.println("Você está obeso!");
        }else {
            System.out.println("Você está com obesidade mórbida!");
        }
        System.out.println("Seu IMC é: " + IMC);
        input.close();
    }
}
