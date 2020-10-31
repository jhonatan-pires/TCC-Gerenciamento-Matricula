package model;

public class Disciplina {
    public int CodDisc;
    public String NomeDisc;
    public float CargaHoraria;
    public String AulasSemana;


    public Disciplina (int codDisc, String nomeDisc, float cargaHoraria, String aulasSemana){
        this.CodDisc = codDisc;
        this.NomeDisc = nomeDisc;
        this.CargaHoraria = cargaHoraria;
        this.AulasSemana = aulasSemana;
    }

    public int getCodDisc(){
        return CodDisc;
    }
    public void setCodDisc(int codDisc){
        CodDisc = codDisc;
    }
    public String getNomeDisc(){
        return NomeDisc;
    }
    public void setNomeDisc(String nomeDisc){
        NomeDisc = nomeDisc;
    }
    public float getCargHoraria(){
        return CargaHoraria;
    }
    public void setCargaHoraria(float cargaHoraria){
        CargaHoraria = cargaHoraria;
    }
    public String getAulasSemana(){
        return AulasSemana;
    }
    public void setAulasSemana(String aulasSemana){
        AulasSemana = aulasSemana;
    }

}



