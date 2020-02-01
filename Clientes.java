import java.util.ArrayList;

public class Clientes {

	private ArrayList<Cliente> clientes;

	public Clientes() {
		clientes = new ArrayList<Cliente>();
	}
	public void registrar(Cliente cliente) {
		clientes.add(cliente);
	}
	public String buscarCliente(String nroDocTit) {
		Cliente cliente;
		for(int i = 0; i < clientes.size(); i++) {
			cliente = clientes.get(i);
			if(cliente.getNroDocTit().equals(nroDocTit))
				return cliente.getClienteId();
		}
		return null;
	}	
	
}
