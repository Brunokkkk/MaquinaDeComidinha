/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadecomida.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import maquinadecomida.persistencia.UsuarioDTO;

/**
 *
 * @author informatica
 */
/*
 
    public UsuarioDTO autenticaUsuario(
            String nome,
            String senha) throws SQLException {
        // definição da String de conexão
        String str = "jdbc:mysql://localhost/turma302?" + "user=root&password=root";
        // estabelecer a conexão...mysql-connector-java-5.1.42-bin.jar
        Connection conn = DriverManager.getConnection(str);
        String sql = "select id, nome, senha from usuarios"+
                     " where nome = ? "+
                     "   and senha = ? ";
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
            usuarioDTO.setNome(rs.getString(2));
            usuarioDTO.setSenha(rs.getString(3));
        }
        return usuarioDTO;
    }
*/
public class UsuarioDAO {
    public UsuarioDTO validaAdm(String nome, String senha) throws SQLException{
        String str = "jdbc:mysql://localhost/maquinadecomida?" + "user=root&password=root";
        Connection c = DriverManager.getConnection(str);
        String sql = "select codAdm, nomeAdm, senhaAdm from Administrador"+
                " where nome = ? "+
                " and senha = ? ";
        PreparedStatement p = c.prepareStatement(sql);
        p.setString(1, nome);
        p.setString(2, senha);
        ResultSet rs = p.executeQuery();
        UsuarioDTO userDTO = null;
        if(rs.next()){
            
        }
        return userDTO;
    }
}