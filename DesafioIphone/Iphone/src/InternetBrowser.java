public class InternetBrowser implements Browsable {

@Override
public void exibirPagina(String url) {
    System.out.print("Exibindo a pagina...");
}

@Override
public void adicionarNovaAba() {
    System.out.print("Adicionando nova aba...");
}

@Override
public void atualizarPagina() {
    System.out.print("Atualizando a pagina...");
}
}
