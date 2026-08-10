import java.util.Scanner;

public class VerificadorDePrimo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, informe um número: ");
        var num = scanner.nextInt();

        boolean resultado = verificarSeEhPrimo(num);

        System.out.println("Número: " + num);
        System.out.println(num + " é primo? " + resultado);
    }
    public static boolean verificarSeEhPrimo(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        }
    }