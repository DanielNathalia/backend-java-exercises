public class ProcuraDePalavra {
    public static void main(String[] args){

    String[] nomes = {"Ana", "Pedro", "João", "Maria", "Lucas"};

    String alvo = "João";
    System.out.println("Procurando por: \"" + alvo + "\"");

    boolean encontrado = false;

    for (int i = 0; i < nomes.length; i++){

        if (nomes[i].equals(alvo)){
            System.out.println("Encontrado na posição: " + i);
            encontrado = true;
            break;
        }
    }
    if (!encontrado){
        System.out.println("Nome não encontrado na lista." );
    }
    }
}
