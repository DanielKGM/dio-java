package recursos;

public class Musica {
    private String nome;
    private int tamanho;

    public Musica(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
}
