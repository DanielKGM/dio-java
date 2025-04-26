package celular;

import recursos.Musica;

public class ReprodutorConcreto {
    private Musica musica;
    private boolean pausado;
    private int progresso;

    public void setMusica(Musica musica) {
        this.musica = musica;
        this.progresso = 0;
        this.pausado = false;
    }

    public void tocar() {
        if (musica != null) {
            pausado = false;
        }
    }

    public void pausar() {
        pausado = true;
    }

    public void selecionarMusica(Musica musica) {
        setMusica(musica);
    }

    public Musica getMusica() {
        return musica;
    }

    public boolean isPausado() {
        return pausado;
    }

    public int getProgresso() {
        return progresso;
    }
}
