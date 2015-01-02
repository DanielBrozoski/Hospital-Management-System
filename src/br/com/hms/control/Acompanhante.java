
package br.com.hms.control;

public class Acompanhante extends Pessoa{
    private String acom_nome, acom_desc;
    private Pessoa pessoa;

    public String getAcom_nome() {
        return acom_nome;
    }

    public void setAcom_nome(String acom_nome) {
        this.acom_nome = acom_nome;
    }

    public String getAcom_desc() {
        return acom_desc;
    }

    public void setAcom_desc(String acom_desc) {
        this.acom_desc = acom_desc;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
