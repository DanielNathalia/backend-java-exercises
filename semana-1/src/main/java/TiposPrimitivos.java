public class TiposPrimitivos {
    public static void main(String[] args) {

        //Menor tipo inteiro
        byte tipoByte = 127;
        System.out.println("Tipo: Byte | Valor: " + tipoByte + " | Tamanho: " + Byte.BYTES + " byte");

        // Inteiro curto
        short tipoShort = 32767;
        System.out.println("Tipo: short | Valor: " + tipoShort + " | Tamanho: " + Short.BYTES + " byte");

        //Para números inteiros.
        int tipoInt = 2147483647;
        System.out.println("Tipo: int | Valor: " + tipoInt + " | Tamanho: " + Integer.BYTES + " byte");

        // para número inteiros muito grandes.
        long tipoLong = 9223372036854775807L;
        System.out.println("Tipo: long | Valor: " + tipoLong + " | Tamanho: " + Long.BYTES + " bytes");

        // Ponto flutuante para precisão simples
        float tipoFloat = 3.14f;
        System.out.println("Tipo: float | Valor: " + tipoFloat + " | Tamanho: " + Float.BYTES + " byte");

        //Ponto flutuante de precisão dulpa
        double tipoDouble =  3.1415926535;
        System.out.println("Tipo: double | Valor: " + tipoDouble + " | Tamanho: " + Double.BYTES + " byte");

        //Armazena um único caracter
        char tipoChar = 'A';
        System.out.println("Tipo: char | Valor: " + tipoChar + " | Tamanho: " + Character.BYTES + " byte");

        //Valores lógico: Verdadeiro ou Falso
        boolean tipoBoolean = true;
        System.out.println("Tipo: boolean | Valor: " + tipoBoolean + " | Tamanho: Depende da JVM");

    }
}