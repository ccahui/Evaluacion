
public class Cliente {

	private String nroDocTit;
	private String clienteId;
	private boolean esComp;
	private String nroDocComp;
	
	public Cliente(String nroDocTit, String clienteId) {
		this.nroDocTit = nroDocTit;
		this.clienteId = clienteId;
	}
	
	public String getNroDocTit() {
		return nroDocTit;
	}
	public void setNroDocTit(String nroDocTit) {
		this.nroDocTit = nroDocTit;
	}
	public String getClienteId() {
		return clienteId;
	}
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	public boolean isEsComp() {
		return esComp;
	}
	public void setEsComp(boolean esComp) {
		this.esComp = esComp;
	}
	public String getNroDocComp() {
		return nroDocComp;
	}
	public void setNroDocComp(String nroDocComp) {
		this.nroDocComp = nroDocComp;
	}
	
	
	
}
