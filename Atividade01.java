//Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.
import java.util.Scanner;

public class Atividade01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = input.nextDouble();

        if (n2 == 0) {
            System.out.println("Não é possível dividir um número por 0!");
        } else {
            double calculo;
            calculo = n1 / n2;  
            System.out.println("O resultado do cálculo é: " + calculo);      
        }
        input.close();
    }
}
