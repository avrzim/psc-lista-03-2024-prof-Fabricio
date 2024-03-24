//Escreva um programa em Java para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.


import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total, brancos, nulos, validos, porcBrancos, porcNulos, porcValidos;

        System.out.println("Digite o número de votos totais: ");
        total = input.nextDouble();

        System.out.println("Digite o número de votos brancos: ");
        brancos = input.nextDouble();

        System.out.println("Digite o número de votos nulos: ");
        nulos = input.nextDouble();

        System.out.println("Digite o número de votos válidos: ");
        validos = input.nextDouble();

        porcBrancos = (brancos / total) * 100;

        porcNulos = (nulos / total) * 100;

        porcValidos = (validos / total) * 100;

        System.out.println("O Valor percentual de cada código é: " + "\n" + "O percentual de votos brancos é: " + porcBrancos + "%" + "\n" + "O percentual de votos nulos é: " + porcNulos + "%" + "\n" + "O percentual de votos válidos é: " + porcValidos + "%");
        input.close();
    }
}
