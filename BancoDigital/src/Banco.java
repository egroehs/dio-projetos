import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;

    // other methods

    public void imprimirTodosOsClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Todos clientes:" + cliente);
        }
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
