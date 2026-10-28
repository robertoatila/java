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
            String sql = "SELECT nome, idade FROM aluno";
            PreparedStatement comando =
                    conexao.prepareStatement(sql);
            // Executa a consulta
            ResultSet resultado = comando.executeQuery();
            // Percorre os registros retornados
            while (resultado.next()) {
                String nome = resultado.getString("nome");
                int idade = resultado.getInt("idade");
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
