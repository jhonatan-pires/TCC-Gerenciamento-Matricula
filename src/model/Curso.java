package model;

public class Curso {
    public int CodCurso;
    public String NomeCurso;
    public String TipoCurso;
    public float CargaHoraria;
    public int CodInstituto;
    


    public Curso (int codCurso, String nomeCurso, String tipoCurso, float cargaHoraria, int codInstituto){
        this.CodCurso = codCurso;
        this.NomeCurso = nomeCurso;
        this.TipoCurso = tipoCurso;
        this.CargaHoraria = cargaHoraria;
        this.CodInstituto = codInstituto;
        

    }

    public int getCodCurso(){
        return CodCurso;
    }
    public void CodCurso (int codCurso){
        CodCurso = codCurso;
    }

    public String getNomeCurso(){
        return NomeCurso;
    }
    public void NomeCurso (String nomeCurso){
        NomeCurso = nomeCurso;
    }

    public String getTipoCurso(){
        return TipoCurso;
    }
    public void TipoCurso (String tipoCurso){
        TipoCurso = tipoCurso;
    }

    public float getCargaHoraria(){
        return CargaHoraria;
    }
    public void CargaHoraria (float cargaHoraria){
        CargaHoraria = cargaHoraria;
    }

    public int getCodInstituto(){
        return CodInstituto;
    }
    public void CodInstituto (int codInstituto){
        CodInstituto = codInstituto;
    }



}