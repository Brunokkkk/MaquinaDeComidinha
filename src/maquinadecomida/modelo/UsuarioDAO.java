/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomida.persistência;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author informatica
 */

public class UsuarioDAO {
    private static final String STRING_CONEXAO = "jdbc:mysql://localhost/MaquinaDeComida?"
            + "user=root&password=alunoifc";
    
    public UsuarioDTO autenticaUsuario(
            String nome,
            String senha) throws SQLException {
        // definição da String de conexão
        // estabelecer a conexão...mysql-connector-java-5.1.42-bin.jar
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "select codAdm from Adm"+
                     " where nomeAdm = ? "+
                     "   and senhaAdm = ? ";
        // enviar o select para ser analisado pelo banco
        // de dados...
        PreparedStatement p = conn.prepareStatement(sql);
        // definir o valor de cada um dos parâmetros...
        p.setString(1, nome);
        p.setString(2, senha);
        ResultSet rs = p.executeQuery();
        UsuarioDTO usuarioDTO = null;
        if (rs.next()) {
            usuarioDTO = new UsuarioDTO();
            usuarioDTO.setCodigo(rs.getInt(1));
            usuarioDTO.setNome(nome);
            usuarioDTO.setSenha(senha);
        }
        conn.close();
        return usuarioDTO;
    }
    //criar os objetos novoNome e novaSenha na classe da tela de cadastro adm e importalos aqui depois da validação feita para 
    //mandar para o bd. E terminar o restante do código do método.
    public void atualizaUsuario(String nome, String senha) throws SQLException{
        Connection conn = DriverManager.getConnection(STRING_CONEXAO);
        String sql = "update Adm set nomeAdm = ?, senhaAdm = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, senha);
        stmt.execute();
        conn.close();
    }
}
