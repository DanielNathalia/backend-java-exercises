public class MaiorDeIguais {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 27;
        int num3 = 20;

        int maior;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3){
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("Número 1: " + num1 + "\n Número 2: " + num2 + "\n Número 3: " + num3);
        System.out.println("O maior número é: " + maior);
    }
}
