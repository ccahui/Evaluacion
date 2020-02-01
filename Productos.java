import java.util.ArrayList;

public class Productos {

	private ArrayList<Producto> productos;

	public Productos() {
		this.productos = new ArrayList<Producto>();
	}
	public void registrar(Producto producto) {
		this.productos.add(producto);
	}
	
	public int tipoDeProducto(String productoId) {
		Producto producto;
		for(int i = 0; i < productos.size(); i++) {
			producto = productos.get(i);
			if(producto.getProductoId().equals(productoId))
				return producto.getProdTipo();
		}
		return -1;
	}
	
	
	
}
