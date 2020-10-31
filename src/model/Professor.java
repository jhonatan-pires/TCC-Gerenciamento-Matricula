package model;

import java.util.Date;

public class Professor {
    protected int IdentProf;
    protected double EndProf;
    protected String NomeProf;
    protected Date DataNasc;
    protected String EspecProf;


    public Professor (int identProf, double endProf, String nomeProf, Date dataNasc, String especProf){
        this.IdentProf = identProf;
        this.EndProf = endProf;
        this.NomeProf = nomeProf;
        this.DataNasc = dataNasc;
        this.EspecProf = especProf;
    }

    public int getIdentProf(){
        return IdentProf;
    }
    public void setIdentProf(int identProf){
        IdentProf = identProf;
    }
    public double getEndProf(){
        return EndProf;
    }
    public void setEndProf (double endProf){
        EndProf = endProf;
    }
    public String getNomeProf(){
        return NomeProf;
    }
    public void setNomeProf(String nomeProf){
        NomeProf = nomeProf;
    } 
    public Date getDataNasc(){
        return DataNasc;
    }
    public void setDataNasc(Date dataNasc){
        DataNasc = dataNasc;
    }
    public String getEspecProf(){
        return EspecProf;
    }
    public void setEspecProf(String especProf){
        EspecProf = especProf;
    }



}


