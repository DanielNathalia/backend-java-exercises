import java.util.Scanner;

public class CalculadoraComMetodos {
    public static double adicionar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        if (b == 0){
        System.out.println("Erro: Não é possível dividir por zero.");
        return 0;
        }
        return a / b;
    }
    public static void main(String[] args){
        var scanner = new Scanner(System.in);


        System.out.println("Por favor, informe o 1° número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Por favor, informe o 2° número: ");
        double num2 = scanner.nextDouble();

        System.out.println(" \n------ Resultados ----- ");

        System.out.println(num1 + " + " + num2 + " = " + adicionar(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtrair(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));

        scanner.close();
    }
}
