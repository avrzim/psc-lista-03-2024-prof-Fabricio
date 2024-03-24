//Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno.Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado(considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.


import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite a nota do primeira semestre: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a nota do segundo semestre: ");
        nota2 = input.nextDouble();

        System.out.println("Digite a nota do terceiro semestre: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media < 7) {
            System.out.println("O aluno foi reprovado!");
        } else {
            System.out.println("O aluno foi aprovado!");
        }
        System.out.println("A média foi: " + media);
        input.close();
    }
}
