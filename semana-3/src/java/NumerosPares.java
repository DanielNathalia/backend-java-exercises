public class NumerosPares {
    public static void main(String[] args){
        System.out.println("Números pares: ");

        for(int i = 1; i <= 20; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
