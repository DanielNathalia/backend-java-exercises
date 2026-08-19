public class OverloadingDeMetodos {
    public static int perimetro(int lado){
        return 4 * lado;
    }
    public static int perimetro(int largura, int altura){
        return 2 * (largura + altura);
    }
    public static double perimetro(double raio){
        return 2 * Math.PI * raio;
    }
    public static void main(String[] args){
        int ladoQuadrado = 5;
        System.out.println("Perimetro do quadrado (lado" + ladoQuadrado + "): " + perimetro(ladoQuadrado));

        double raioCirculo = 3.0;

        String resultadoFormatado = String.format("%.2f", perimetro(raioCirculo));

        System.out.println("Perímetro do círculo (raio " + (int)raioCirculo + "): " + resultadoFormatado);
    }
}
