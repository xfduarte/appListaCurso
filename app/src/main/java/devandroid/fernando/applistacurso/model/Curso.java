package devandroid.fernando.applistacurso.model;

public class Curso {

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    private String nomeCurso;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
