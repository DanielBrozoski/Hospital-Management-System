/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hms.model;

import br.com.hms.control.Pessoa;
import br.com.hms.database.DB;
import br.com.hms.view.GuiCadastroFuncionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class mPessoa {
    
    private DB db;
    private ArrayList<Pessoa> listaPessoa;
    
    
    public mPessoa(DB db) {
        this.db = db;
        this.listaPessoa = new ArrayList<Pessoa>();
        this.consultar();
    }

    public mPessoa() {
        
    }
    
    public void inserir(Pessoa pessoa) {
        String sql;
        sql = "insert into pessoa (pess_nome, pess_rg, pess_cpf, pess_sexo, pess_logr, pess_nume, pess_comp, pess_bairr, pess_cida, pess_cep, pess_esta, pess_fone, pess_celu, pess_dnas) values " + 
              "('"+pessoa.getPess_nome()+"', '"+pessoa.getPess_rg()+"', '"+pessoa.getPess_cpf()+"', '"+ pessoa.getPess_sexo()+"'," + "'"+ pessoa.getPess_logr() + "', '" + pessoa.getPess_nume() + "', '" + pessoa.getPess_comp() + 
              "', '" + pessoa.getPess_bair() + "', '" + pessoa.getPess_cida() + "', '" + pessoa.getPess_cep() + "', '" + pessoa.getPess_esta() + "', '" + pessoa.getPess_fone() + "', '" + pessoa.getPess_celu() + "', '2012/12/12');";
//        System.out.print(sql);
        this.db.bdAtualizar(sql);
    }
    
    public void atualizar(Pessoa pessoa) {
        String sql;
      /*  sql = "update pessoa set "
            + "nome = '" +pessoa.getNome()+"', "
            + "apelido = '"+pessoa.getApelido()+"', "
            + "cidade = '"+pessoa.getCidade()+"', "
            + "idade = " + pessoa.getIdade()
            + " where idPessoa = " + pessoa.getIdPessoa();
        this.db.bdAtualizar(sql);*/
    }
    
    public void excluir(Pessoa pessoa) {
        String sql;
       /* sql = "delete from pessoa "
                + "where idPessoa = " + pessoa.getIdPessoa();
        this.db.bdAtualizar(sql);*/
    }
    
    public void consultar() {
        String sql;
        sql = "select * from pessoa";
        this.populaControle(this.db.bdConsultar(sql));
    }
    
    private void populaControle(ResultSet resultSet) {
        /*try {
            this.listaPessoa.clear();
            resultSet.first();
            if (resultSet.isFirst()){
                while(true) {
                    Pessoa pessoa = new Pessoa();
                    pessoa.setIdPessoa(resultSet.getInt("idPessoa"));
                    pessoa.setNome(resultSet.getString("nome"));
                    pessoa.setApelido(resultSet.getString("apelido"));
                    pessoa.setCidade(resultSet.getString("cidade"));
                    pessoa.setIdade(resultSet.getInt("idade"));
                    this.listaPessoa.add(pessoa);
                    resultSet.next();
                    if (resultSet.isAfterLast()) {
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }*/
    }
    
    public ArrayList<Pessoa> listaPessoa() {
        return this.listaPessoa;
    }
       
}
