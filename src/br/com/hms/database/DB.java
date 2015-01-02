/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class DB {
    
    private static final String url = "jdbc:mysql://localhost:3306/hms";
    private static final String login = "root";
    private static final String senha = "xzvptkfx";
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public DB() {
        try {
            this.connection = DriverManager.getConnection(url, login, senha);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public int bdAtualizar(String sql) {
        int id = 0;
        try {  
            this.preparedStatement = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            this.preparedStatement.executeUpdate();
            ResultSet rs = this.preparedStatement.getGeneratedKeys();
            if (rs.first()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public ResultSet bdConsultar(String sql) {
        try {
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.resultSet = this.preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.resultSet;
    }

    public void fecharConexao() {
        try {
            this.preparedStatement.close();
            this.connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean validaSenha(String user, String pass){
        try {
            String sql = "select usua_user, usua_pass from usuario where usua_user = ? and usua_pass = ?";
            boolean autenticado = false; 
            
            this.preparedStatement = this.connection.prepareStatement(sql);
            
            this.preparedStatement.setString(1, user);
            this.preparedStatement.setString(2, pass);
            
            this.resultSet = this.preparedStatement.executeQuery();

            if(this.resultSet.next()){
                String loginBanco = this.resultSet.getString("usua_user");  
                String senhaBanco = this.resultSet.getString("usua_pass");  
                autenticado = true;  
                
                
            } 
            this.preparedStatement.close();
            
            return autenticado;
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}

}  
  

