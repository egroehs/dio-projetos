
public class iPhone implements Playable, Callable, Browsable {
    private MusicPlayer musicPlayer;
    private Phone phone;
    private InternetBrowser internetBrowser;

    public iPhone() {
        musicPlayer = new MusicPlayer();
        phone = new Phone();
        internetBrowser = new InternetBrowser();
    }

    @Override
    public void play() {
        musicPlayer.play();
    }

    @Override
    public void pause() {
        musicPlayer.pause();
    }

    @Override
    public void selectMusic(String music) {
        musicPlayer.selectMusic(music);
    }

    @Override
    public void ligar(String numero) {
        phone.ligar(numero);
    }

    
    @Override
    public void atender() {
        phone.atender();
    }

    @Override
    public void iniciarCorreioVoz(){
        phone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        internetBrowser.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        internetBrowser.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        internetBrowser.atualizarPagina();
    }

    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        myiPhone.play();
        myiPhone.pause();
        myiPhone.selectMusic("musica");
        myiPhone.ligar("123456789");
        myiPhone.atender();
        myiPhone.iniciarCorreioVoz();
        myiPhone.exibirPagina("https://example.com");
        myiPhone.adicionarNovaAba();
        myiPhone.atualizarPagina();
    }
}
