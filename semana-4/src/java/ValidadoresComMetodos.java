import java.util.Scanner;

public class ValidadoresComMetodos {

    public static boolean ehMaiorDeIdade(int idade){
        return idade >= 18;
    }

    public static boolean ehEmail(String texto){
        return texto != null && texto.contains("@");
    }

    public static boolean ehSenhaForte(String senha){
        return senha != null && senha.length() >= 8;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Entrada e validação da idade
        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        //Entrada e validação do E-mail
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        //Entrada e validação da senha
        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();


        System.out.println("\n---RESULTADO DA VALIDAÇÃO---");
        System.out.println("Idade: " + idade + " é maior de idade? " + ehMaiorDeIdade(idade));
        System.out.println(email + " é email válido? " + ehEmail(email));
        System.out.println(senha + " é senha forte? " + ehSenhaForte(senha));

        scanner.close();
    }
}
