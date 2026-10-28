package escola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ConsultarAlunos {
    public static void main(String[] args) {
        try {
            // Estabelece a conexão com o banco
            Connection conexao = Conexao.conectar();
            // Comando SQL para consultar os alunos
            String sql = "SELECT id, nome, idade FROM aluno";
            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                int idade = resultado.getInt("idade");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("-------------------");
            }
            // Fecha os recursos
            resultado.close();
            comando.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ao consultar os alunos!");
            e.printStackTrace();
        }
    }
}
