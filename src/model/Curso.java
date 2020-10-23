package model;

import java.util.ArrayList;

public class Curso {
    protected int CodCurso;
    protected String NomeCurso;
    protected String TipoCurso;
    protected float CargaHoraria;
    protected int CodInstituto;
    ArrayList<Curso> ListaCursos;


    public Curso (int CodCurso, String NomeCurso, String TipoCurso, float CargaHoraria, int CodInstituto){
        this.CodCurso = CodCurso;
        this.NomeCurso = NomeCurso;
        this.TipoCurso = TipoCurso;
        this.CargaHoraria = CargaHoraria;
        this.CodInstituto = CodInstituto;
        ArrayList ListaCursos = new ArrayList();

    }

    public int getCodCurso(){
        return CodCurso;
    }
    public void CodCurso (int CodCurso){
        CodCurso = CodCurso;
    }

    public String getNomeCurso(){
        return NomeCurso;
    }
    public void NomeCurso (String NomeCurso){
        NomeCurso = NomeCurso;
    }

    public String getTipoCurso(){
        return TipoCurso;
    }
    public void TipoCurso (String TipoCurso){
        TipoCurso = TipoCurso;
    }

    public float getCargaHoraria(){
        return CargaHoraria;
    }
    public void CargaHoraria (float CargaHoraria){
        CargaHoraria = CargaHoraria;
    }

    public int getCodInstituto(){
        return CodInstituto;
    }
    public void CodInstituto (int CodInstituto){
        CodInstituto = CodInstituto;
    }

    List ListaCursos = new ArrayList();
        ListaCursos.add ("Administração de Empresas");
        ListaCursos.add ("BioMedicina");
        ListaCursos.add ("Ciências Biológicas");
        ListaCursos.add ("Ciências da Computação");
        ListaCursos.add ("Direito");
        ListaCursos.add ("Educação Física");
        ListaCursos.add ("Farmacologia");
        ListaCursos.add ("Rede de Computadores");
        ListaCursos.add ("Sistemas de Informações");
    


}
