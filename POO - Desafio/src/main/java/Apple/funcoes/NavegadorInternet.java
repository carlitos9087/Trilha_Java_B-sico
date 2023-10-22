package Apple.funcoes;

public class NavegadorInternet {
    public void exibirPagina(String url) {
       
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba(String url) {
      
        System.out.println("Adicionando nova aba com a página: " + url);
    }

    public void atualizarPagina() {
        
        System.out.println("Atualizando a página atual");
    }
}
