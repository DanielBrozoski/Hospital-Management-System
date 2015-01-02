package br.com.hms.control;

import java.util.Date;
//substituir Date;
public class Horario {
    private int hora_hora, medi_codi, pess_codi, inte_codi;
    private String hora_desc;
    private Date hora_data;

    public int getHora_hora() {
        return hora_hora;
    }

    public void setHora_hora(int hora_hora) {
        this.hora_hora = hora_hora;
    }

    public int getMedi_codi() {
        return medi_codi;
    }

    public void setMedi_codi(int medi_codi) {
        this.medi_codi = medi_codi;
    }

    public int getPess_codi() {
        return pess_codi;
    }

    public void setPess_codi(int pess_codi) {
        this.pess_codi = pess_codi;
    }

    public int getInte_codi() {
        return inte_codi;
    }

    public void setInte_codi(int inte_codi) {
        this.inte_codi = inte_codi;
    }

    public String getHora_desc() {
        return hora_desc;
    }

    public void setHora_desc(String hora_desc) {
        this.hora_desc = hora_desc;
    }

    public Date getHora_data() {
        return hora_data;
    }

    public void setHora_data(Date hora_data) {
        this.hora_data = hora_data;
    }
    
    
    
    
}
