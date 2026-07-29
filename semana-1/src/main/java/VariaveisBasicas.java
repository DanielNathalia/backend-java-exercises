public class VariaveisBasicas {
    public static void main(String[] args) {
        String nome = "Nathalia Alves";
        int idade = 22;
        float altura = 1.70f;
        boolean ativo = true;
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e " + String.format("%.2f", altura)  + " de altura. Atualmente " + (ativo ? "estou" : "não estou") + " ativa como programadora Java.");
    }
}