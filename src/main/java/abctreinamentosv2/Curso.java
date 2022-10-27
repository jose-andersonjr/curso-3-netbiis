package abctreinamentosv2;

import java.nio.file.Path;

public class Curso {

    private int cdcurso;

    private Float valor;

    private Path url;
    private String nome;

    @Override
    public String toString() {
        return "Curso{" +
                "cdcurso=" + cdcurso +
                ", valor=" + valor +
                ", url=" + url +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Curso curso = (Curso) o;

        return cdcurso == curso.cdcurso;
    }

    @Override
    public int hashCode() {
        return cdcurso;
    }

    // Constructor
    public Curso(int cdcurso, String nome, Float valor, Path url) {
        this.cdcurso = cdcurso;
        this.valor = valor;
        this.url = url;
        this.nome = nome;
    }

    //Getters and Setters

    public int getCdcurso() {
        return cdcurso;
    }

    public void setCdcurso(int cdcurso) {
        this.cdcurso = cdcurso;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Path getUrl() {
        return url;
    }

    public void setUrl(Path url) {
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
