import java.util.Scanner;

public class ValidadorDeIdade {

    public static void main(String[] args){
        var Scanner = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        var idade = Scanner.nextInt();

        if (idade < 13){
            System.out.println("Idade: " + idade + "\nCategoria: Criança");
        } else if (idade >= 13 && idade <= 18) {
            System.out.println("Idade: " + idade + "\nCategoria: Adolescente");
        } else if (idade >= 19 && idade <= 65){
            System.out.println("Idade: " + idade + "\nCategoria: Adulto");
        } else {
            System.out.println("Idade: " + idade + "\nCategoria: Idoso");
        }


    }
}
