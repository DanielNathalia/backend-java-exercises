import java.util.Scanner;

public class CalculadoraComCondicionais {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Número 1: ");
        double num1 = scanner.nextDouble();

        System.out.println("Número 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        switch (operacao){
            case '+' -> System.out.println("Resultado: " +(num1 + num2));
            case '-' -> System.out.println("Resultado: " +(num1 - num2));
            case '*' -> System.out.println("Resultado: " +(num1 * num2));
            case '/' -> {
                if (num2 == 0){
                System.out.println("Erro: Divisão por zero!");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
            }
            default -> System.out.println("Erro: Operação invpalida");
        }
    }
}
