package devandroid.fernando.applistacurso.model;

import androidx.annotation.NonNull;

public class Pessoa {
    private String primeiroNome;
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa(String primeiroNome, String sobreNome, String cursoDesejado, String telefoneContato) {
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;
        this.cursoDesejado = cursoDesejado;
        this.telefoneContato = telefoneContato;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }


    @NonNull
    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + getPrimeiroNome() + '\'' +
                ", sobreNome='" + getSobreNome() + '\'' +
                ", cursoDesejado='" + getCursoDesejado() + '\'' +
                ", telefoneContato='" + getTelefoneContato() + '\'' +
                '}';
    }
}
