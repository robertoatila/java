package Banco;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/banco";
        String usuario = "root";
        String senha = "";
        try {
            Connection conexao = DriverManager.getConnection(
                url,
                usuario,
                senha
            );
            System.out.println("Banco de dados conectado com sucesso!");
            conexao.close();
        } catch (Exception e) {
            System.out.println("Não foi possível conectar ao banco de dados.");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
