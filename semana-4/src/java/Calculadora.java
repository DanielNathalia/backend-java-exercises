import java.util.Scanner;

public class Calculadora {

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b){
        if (b == 0){
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN; //Not a Number
        }
        return a / b;
    }
    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    public static double raizQuadrada(double numero) {
        if (numero < 0){
            System.out.println("Erro: Não é possível raiz de número negativo! ");
            return Double.NaN;
        }
        return Math.sqrt(numero);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===CALCULADORA===");
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - POTÊNCIA");
        System.out.println("6 - RAIZ QUADRADA");
        System.out.println("Escolha uma opção (1-6): ");
        int opcao = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (opcao){
            case 1:
                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                resultado = somar(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                resultado = subtrair(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;

            case 3:
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                resultado = multiplicar(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;

            case 4:
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                resultado = dividir(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;

            case 5:
                System.out.println("Digite a base: ");
                double base = scanner.nextDouble();
                System.out.println("Digite o expoente: ");
                double expoente = scanner.nextDouble();
                resultado = potencia(base, expoente);
                System.out.println(base + " ^ " + expoente + " = " + resultado);
                break;

            case 6:
                System.out.println("Digite o número: ");
                double numero = scanner.nextDouble();
                resultado = raizQuadrada(numero);
                if (!Double.isNaN(resultado)) {
                    System.out.println("Raiz de " + numero + " = " + resultado);
                }
                break;

            default:
                System.out.println("Opção inválida!");
                operacaoValida = false;
                break;
        }
        scanner.close();
    }
}
