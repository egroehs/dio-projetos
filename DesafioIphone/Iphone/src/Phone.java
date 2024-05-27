
public class Phone implements Callable {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando..." + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz...");
    }

}

