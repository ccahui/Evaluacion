
public class Producto {
	public static final int AHORRROS = 1;
	public static final int PRESTAMO = 2;
	
	private String productoId;
	private String prodNom;
	private int prodTipo;
	
	public Producto(String id) {
		this.productoId = id;
	}

	public String getProductoId() {
		return productoId;
	}

	public void setProductoId(String productoId) {
		this.productoId = productoId;
	}

	public String getProdNom() {
		return prodNom;
	}

	public void setProdNom(String prodNom) {
		this.prodNom = prodNom;
	}

	public int getProdTipo() {
		return prodTipo;
	}

	public void setProdTipo(int prodTipo) {
		this.prodTipo = prodTipo;
	}
}
