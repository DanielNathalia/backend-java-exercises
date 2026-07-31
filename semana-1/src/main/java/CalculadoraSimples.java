public class CalculadoraSimples {
    public static void main(String[] args){
        int n1 = 15;
        int n2 = 27;

        System.out.println("Número 1: " + n1);
        System.out.println("Número 2: " + n2);

        //calculo das variáveis
        int soma = n1 + n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
        float div = (float) n1 / n2;

        //Declarando resultados
        System.out.println("\n--- CALCULANDO ---");
        System.out.println("Soma " + n1 + " + " + n2 + " = " + soma);
        System.out.println("Subtração " + n1 + " - " + n2 + " = " + sub);
        System.out.println("Multiplicação " + n1 + " x " + n2 + " = " + mult);
        System.out.println("Divisão " + n1 + " / " + n2 + " = " + String.format("%.2f", div));



    }
}
