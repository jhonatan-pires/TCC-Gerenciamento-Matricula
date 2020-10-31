package model;

public class Disciplina {

    public String CodDisc;
    public String NomeDisc;
    public Float CargaHoraria;
    public double AulasSemana;

    public Disciplina (String codDisc, String nomeDisc, Float cargaHoraria, double aulasSemana) {
        CodDisc = codDisc;
        NomeDisc = nomeDisc;
        CargaHoraria = cargaHoraria;
        AulasSemana = aulasSemana;
    }

    public String getCodDisc () {
        return CodDisc;
    }

    public void setCodDisc (String codDisc) {
        CodDisc = codDisc;
    }

    public String getNomeDisc () {
        return NomeDisc;
    }

    public void setNomeDisc (String nomeDisc) {
        NomeDisc = nomeDisc;
    }

    public Float getCargaHoraria () {
        return CargaHoraria;
    }

    public void setCargaHoraria (Float cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public double getAulasSemana () {
        return AulasSemana;
    }

    public void setAulasSemana (double aulasSemana) {
        AulasSemana = aulasSemana;
    }
}
