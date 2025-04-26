package recursos;

import java.util.List;

public class Album {
    private List<Musica> musicas;

    public Album(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
