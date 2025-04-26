package celular;

import recursos.PaginaInternet;

public class AbaNavegador {
    private PaginaInternet pagina;
    private int atualizacoes;

    public AbaNavegador(PaginaInternet pagina) {
        this.pagina = pagina;
        this.atualizacoes = 0;
    }

    public void atualizar() {
        atualizacoes++;
    }

    public PaginaInternet getPagina() {
        return pagina;
    }
}
