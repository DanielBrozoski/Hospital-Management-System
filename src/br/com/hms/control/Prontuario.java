package br.com.hms.control;

import java.util.Date;
//s ubstituir date;

public class Prontuario {
    private int pron_codi, pess_codi, cid_codi;
    private String pron_loca, pron_desc;
    private Date data, hora;

    public int getPron_codi() {
        return pron_codi;
    }

    public void setPron_codi(int pron_codi) {
        this.pron_codi = pron_codi;
    }

    public int getPess_codi() {
        return pess_codi;
    }

    public void setPess_codi(int pess_codi) {
        this.pess_codi = pess_codi;
    }

    public int getCid_codi() {
        return cid_codi;
    }

    public void setCid_codi(int cid_codi) {
        this.cid_codi = cid_codi;
    }

    public String getPron_loca() {
        return pron_loca;
    }

    public void setPron_loca(String pron_loca) {
        this.pron_loca = pron_loca;
    }

    public String getPron_desc() {
        return pron_desc;
    }

    public void setPron_desc(String pron_desc) {
        this.pron_desc = pron_desc;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    
}
