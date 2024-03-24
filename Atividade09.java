import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double idade;

        System.out.println("Digite sua idade: ");
        idade = input.nextDouble();

        if (idade < 16){
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade < 18 ){
            System.out.println("Eleitor facultativo");
        } else if(idade >= 18 && idade <= 65){
            System.out.println("Eleitor obrigatório");
        } else {
            System.out.println("Eleitor facultativo");
        }
        input.close();
    }
}
