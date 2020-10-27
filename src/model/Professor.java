package model;

import java.util.Date;;

public class Professor {
    protected int IdentProf;
    protected double EndProf;
    protected String NomeProf;
    protected Date DataNasc;
    protected String EspecProf;


    public Professor (int IdentProf, double EndProf, String NomeProf, Date DataNasc, String EspecProf){
        this.IdentProf = IdentProf;
        this.EndProf = EndProf;
        this.NomeProf = NomeProf;
        this.DataNasc = DataNasc;
        this.EspecProf = EspecProf;
    }

    public int getIdentProf(){
        return IdentProf;
    }
    public void setIdentProf(String IdentProf){
        IdentProf = IdentProf;
    }
    public double getEndProf(){
        return EndProf;
    }
    public void setEndProf (double EndProf){
        EndProf = EndProf;
    }
    public String getNomeProf(){
        return NomeProf;
    }
    public void setNomeProf(String NomeProf){
        NomeProf = NomeProf;
    } 
    public Date getDataNasc(){
        return DataNasc;
    }
    public void setDataNasc(Date DataNasc){
        DataNasc = DataNasc;
    }
    public String getEspecProf(){
        return EspecProf;
    }
    public void setEspecProf(String EspecProf){
        EspecProf = EspecProf;
    }



}


