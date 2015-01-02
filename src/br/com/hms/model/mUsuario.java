package br.com.hms.model;

import br.com.hms.control.Usuario;
import br.com.hms.database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mUsuario {
    private DB db;
    private ArrayList<Usuario> listaUsuarios;
    
    
    public mUsuario(DB db){
        this.db = db;
        this.listaUsuarios = new ArrayList<Usuario>();
        this.consultar();
    }
    
     public void inserir(Usuario usuario) {
        String sql;
        sql = "insert into usuario(usua_user, usua_pass) values('" + usuario.getUsername() + "', " + usuario.getPassword() + "');";
         JOptionPane.showMessageDialog(null, sql);
        this.db.bdAtualizar(sql);
    }
    
    public void atualizar(Usuario usuario) {
        String sql;
        sql = "update usuario set "
            + "usua_user = '" + usuario.getUsername() + "', "
            + "usua_pass = '" + usuario.getPassword() + "', "
            + " where pess_codi = " + usuario.getCodigo();
        this.db.bdAtualizar(sql);
    }
    
    public void excluir(Usuario usuario) {
        String sql;
        sql = "delete from pessoa "
                + "where idPessoa = " + usuario.getCodigo();
        this.db.bdAtualizar(sql);
    }
    
    public void consultar() {
        String sql;
        sql = "select * from usuario";
        this.populaControle(this.db.bdConsultar(sql));
    }
    
    private void populaControle(ResultSet resultSet) {
        try {
            this.listaUsuarios.clear();
            resultSet.first();
            if (resultSet.isFirst()){
                while(true) {
                    Usuario usuario = new Usuario();
                    usuario.setCodigo(resultSet.getInt("Codigo"));
                    usuario.setUsername(resultSet.getString("username"));
                    usuario.setPassword(resultSet.getString("password"));
                    this.listaUsuarios.add(usuario);
                    resultSet.next();
                    if (resultSet.isAfterLast()) {
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void geraSenha(){
    
    
    }
   
    }

