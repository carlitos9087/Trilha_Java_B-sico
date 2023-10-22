package Apple.Iphone23;


import Apple.funcoes.AparelhoTelefonico;
import Apple.funcoes.ReprodutorMusical;
import Apple.funcoes.NavegadorInternet;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        // Exemplo de uso do Reprodutor Musical
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("roberto carlos");

        // Exemplo de uso do Aparelho Telefônico
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Exemplo de uso do Navegador na Internet
        navegador.exibirPagina("https://www.eo_java_/nao/tem/jeito.br");
        navegador.adicionarNovaAba("https://www.muito_jav4.com");
        navegador.atualizarPagina();
    }
}
