public class SerieDeSequencias {
    public static void main(String[] args){

        //------------- FIBONACCI --------------
        System.out.println("Fibonacci: ");
        int a = 0;
        int b = 1;

        for (int i = 0; i < 10; i++){
            System.out.println(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();

        //-------------- QUADRADO ---------------
        System.out.println("Quadrados: ");

        for (int i = 1; i <= 10; i++){
            System.out.println((i * i) + " ");
        }
        System.out.println();

        //---------------- PIRÂMIDE ------------
        System.out.println("Pirâmide: ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
