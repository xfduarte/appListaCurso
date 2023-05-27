package devandroid.fernando.applistacurso.model;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private int telefone;

    public Pessoa(String nome, String sobreNome, int telefone) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
