package escola;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class Principal {
    public static void main(String[] args) {
        try {
            Connection conexao = Conexao.conectar();
            String sql =
                    "INSERT INTO aluno(nome, idade) VALUES (?, ?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, "Carlos");
            comando.setInt(2, 16);
            comando.execute();
            System.out.println("Aluno cadastrado!");
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
