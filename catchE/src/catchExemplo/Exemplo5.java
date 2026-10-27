package catchExemplo;

public class Exemplo5 {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30};

        try {
            System.out.println(numeros[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida do vetor.");
        }
    }
}