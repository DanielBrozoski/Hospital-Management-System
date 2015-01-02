package br.com.hms.control;

import java.util.Date;

public abstract class Pessoa {
    private int pess_codi, pess_nume, pess_fone, pess_celu, pess_cep;

    public int getPess_cep() {
        return pess_cep;
    }

    public void setPess_cep(int pess_cep) {
        this.pess_cep = pess_cep;
    }
    private String pess_nome, pess_sexo, pess_logr, pess_comp, pess_bair, pess_cida, pess_esta, pess_rg, pess_cpf;
    private Date pess_dnas;

    public String getPess_rg() {
        return pess_rg;
    }

    public void setPess_rg(String pess_rg) {
        this.pess_rg = pess_rg;
    }

    public String getPess_cpf() {
        return pess_cpf;
    }

    public void setPess_cpf(String pess_cpf) {
        this.pess_cpf = pess_cpf;
    }
    
    public int getPess_codi() {
        return pess_codi;
    }

    public void setPess_codi(int pess_codi) {
        this.pess_codi = pess_codi;
    }

    public int getPess_nume() {
        return pess_nume;
    }

    public void setPess_nume(int pess_nume) {
        this.pess_nume = pess_nume;
    }

    public int getPess_fone() {
        return pess_fone;
    }

    public void setPess_fone(int pess_fone) {
        this.pess_fone = pess_fone;
    }

    public int getPess_celu() {
        return pess_celu;
    }

    public void setPess_celu(int pess_celu) {
        this.pess_celu = pess_celu;
    }

    public String getPess_nome() {
        return pess_nome;
    }

    public void setPess_nome(String pess_nome) {
        this.pess_nome = pess_nome;
    }

    public String getPess_sexo() {
        return pess_sexo;
    }

    public void setPess_sexo(String pess_sexo) {
        this.pess_sexo = pess_sexo;
    }

    public String getPess_logr() {
        return pess_logr;
    }

    public void setPess_logr(String pess_logr) {
        this.pess_logr = pess_logr;
    }

    public String getPess_comp() {
        return pess_comp;
    }

    public void setPess_comp(String pess_comp) {
        this.pess_comp = pess_comp;
    }

    public String getPess_bair() {
        return pess_bair;
    }

    public void setPess_bair(String pess_bair) {
        this.pess_bair = pess_bair;
    }

    public String getPess_cida() {
        return pess_cida;
    }

    public void setPess_cida(String pess_cida) {
        this.pess_cida = pess_cida;
    }

    public String getPess_esta() {
        return pess_esta;
    }

    public void setPess_esta(String pess_esta) {
        this.pess_esta = pess_esta;
    }

    public Date getPess_dnas() {
        return pess_dnas;
    }

    public void setPess_dnas(Date pess_dnas) {
        this.pess_dnas = pess_dnas;
    }
    
    
}