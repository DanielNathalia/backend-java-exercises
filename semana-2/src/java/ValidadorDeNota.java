import java.util.Scanner;

public class ValidadorDeNota {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Por favor informe a sua nota: ");
        var nota = scanner.next().toUpperCase();

        var message = switch (nota){
            case "A" -> "Descrição: Excelente (90 - 100)";
            case "B" -> "Descrição: Muito bom (80 - 89)";
            case "C" -> "Descrição: Bom (70 - 79)";
            case "D" -> "Descrição: Passável (60 - 69)";
            case "F" -> "Descrição: Reprovado (<60)";
            default -> "Opção inválida";
        };
    System.out.println("Nota: " + nota);
    System.out.println(message);
    }
}
