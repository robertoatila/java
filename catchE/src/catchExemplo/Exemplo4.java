package catchExemplo;

public class Exemplo4 {
    public static void main(String[] args) {

        try {
            String nome = null;
            System.out.println(nome.length());

        } catch (NullPointerException e) {
            System.out.println("Erro: a variável não referencia um objeto.");
        }
    }
}