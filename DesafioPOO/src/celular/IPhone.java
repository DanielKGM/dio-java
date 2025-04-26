package celular;

import java.util.ArrayList;
import java.util.List;

import celular.interfaces.AparelhoTelefonico;
import celular.interfaces.NavegadorInternet;
import celular.interfaces.ReprodutorMusical;
import recursos.Album;
import recursos.Musica;
import recursos.PaginaInternet;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private List<Album> albuns;
    private List<String> mensagensCorreioVoz;
    private String ligacao;
    private List<AbaNavegador> abasNavegador;
    private ReprodutorConcreto reprodutorMusical;

    public IPhone() {
        this.albuns = new ArrayList<>();
        this.mensagensCorreioVoz = new ArrayList<>();
        this.abasNavegador = new ArrayList<>();
        this.reprodutorMusical = new ReprodutorConcreto();
    }

    // ReprodutorMusical
    public void tocar() {
        reprodutorMusical.tocar();
    }

    public void pausar() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String nome) {
        for (Album album : albuns) {
            for (Musica musica : album.getMusicas()) {
                if (musica.getNome().equalsIgnoreCase(nome)) {
                    reprodutorMusical.selecionarMusica(musica);
                    return;
                }
            }
        }
    }

    // AparelhoTelefonico
    public void ligar(String numero) {
        if (this.ligacao == null)
            this.ligacao = numero;
    }

    public void encerrarLigacao() {
        this.ligacao = null;
    }

    public void atender() {
        this.ligacao = "atendida";
    }

    public void iniciarCorreioVoz() {
        mensagensCorreioVoz.add("Nova mensagem de voz");
    }

    // NavegadorInternet
    public void exibirPagina(String url) {
        PaginaInternet pagina = new PaginaInternet(url, "Conteúdo carregado");
        abasNavegador.add(new AbaNavegador(pagina));
    }

    public void adicionarNovaAba() {
        abasNavegador.add(new AbaNavegador(new PaginaInternet("about:blank", "")));
    }

    public void atualizarPagina() {
        if (!abasNavegador.isEmpty()) {
            abasNavegador.get(abasNavegador.size() - 1).atualizar();
        }
    }

}
