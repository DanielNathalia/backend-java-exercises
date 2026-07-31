public class ConversaoDeTipos {
    public static void main(String[] args){
        //Realize conversão implícita (widening):
        //int → long
        //float → double

        int tipoInt = 2;
        float tipoFloat = 3.70f;

        //Conversão Widening (int -> long | float -> double)
        long numLong = tipoInt;
        double numDouble = tipoFloat;
        System.out.println("--- CONVERSÃO WIDENING ---");
        System.out.println("Antes: int x =  " + tipoInt + "\nDepois de converter para long: " + numLong + "L");
        System.out.println("\nAntes float x = : " + tipoFloat + "f \nDepois de converter para double: " + numDouble);

        //Conversão Narrowing (long -> int | double -> float)
        int valorInt = (int) numLong;
        float valorFloat = (float) numDouble;

        System.out.println("\n--- CONVERSÃO NARROWING ---");
        System.out.println("Antes: long x =  " + numLong + "L \nDepois de converter para int: " + valorInt);
        System.out.println("\nAntes: double x =  " + numDouble + "\nDepois de converter para float: " + valorFloat + "f");
    }
}
