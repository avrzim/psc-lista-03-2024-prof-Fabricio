import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco, porcentagem, total;

        System.out.println("Digite o preço do produto: ");
        preco = input.nextDouble();

        porcentagem = preco / 100;

        if (preco < 10){
            total = preco + (porcentagem * 70);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        } else if (preco >= 10 && preco < 30) {
            total = preco + (porcentagem * 50);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        } else if (preco >= 30 && preco < 50) {
            total = preco + (porcentagem * 40);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        } else {
            total = preco + (porcentagem * 30);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        }
        input.close();
    }
}
