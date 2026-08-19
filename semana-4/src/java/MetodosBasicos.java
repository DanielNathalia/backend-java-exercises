/**
 Crie método saudacao() que imprime "Olá!"
 Crie método dobro(int x) que retorna o dobro
 Crie método ehPar(int x) que retorna true se par
 Chame todos os métodos no main
 */

public class MetodosBasicos {

    public static void saudacao(){
        System.out.println("Olá");
    }

    public static int dobro (int x){
        return x * 2;
    }

    public static  boolean ehPar(int x){
        return x % 2 == 0;
    }
    
    public static void main(String[] args) {
        saudacao();

        int numeroParaDobrar = 5;
        int resultadoDobro = dobro(numeroParaDobrar);
        System.out.println("Dobro de " + numeroParaDobrar + ": " + resultadoDobro);

        int numeroParaVerificar = 10;
        System.out.println(numeroParaVerificar + " é par? " + ehPar(numeroParaVerificar));
    }
}
