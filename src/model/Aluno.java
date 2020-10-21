package model;

import java.util.Date;

abstract public class Aluno {

    protected String Nome;
    protected Float Matricula;
    protected Date DataNasc;
    protected double Np1;
    protected double Np2;

    public Aluno(String nome, Float matricula) {
        Nome = nome;
        Matricula = matricula;
    }

    public Aluno(String nome, Float matricula, Date dataNasc, double np1, double np2) {
        Nome = nome;
        Matricula = matricula;
        DataNasc = dataNasc;
        Np1 = np1;
        Np2 = np2;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Float getMatricula() {
        return Matricula;
    }

    public void setMatricula(Float matricula) {
        Matricula = matricula;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        DataNasc = dataNasc;
    }

    public double getNp1() {
        return Np1;
    }

    public void setNp1(double np1) {
        Np1 = np1;
    }

    public double getNp2() {
        return Np2;
    }

    public void setNp2(double np2) {
        Np2 = np2;
    }
}
