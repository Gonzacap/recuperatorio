package recuperatorio.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	//CantidadProductosInsuficienteException

	private Integer id;
	private List<Pedido> pedidos;
	private Integer maximoPorProducto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	public void setMaximoPorProducto(Integer max) {
		this.maximoPorProducto = max;
	}
	
	
	public void crearPedido(Integer nroPedido) {
		if(this.pedidos==null)this.pedidos = new ArrayList<Pedido>();
		this.pedidos.add(new Pedido(nroPedido));
	}
	
	//-----------------
	
	public void agregarProducto(Integer nroPedido, Integer idProducto,Integer cantidad) throws BusquedaProductoException, StockINsuficienteException, DatabaseException, CantidadProductosInsuficienteException{

		//verificar si el stock existente alcanza para agregarlo al pedido
		Producto p = Database.buscarProducto(idProducto);
		
		if(p!=null) {
			if(p.getStock()>cantidad) {
				
				if((this.cantDeUnProd(p)+cantidad)<this.maximoPorProducto) {
					
					// verificar si el cliente cumple la condicion pedida para agregar el producto
					Pedido pedido = this.buscarPorNro(nroPedido);
					pedido.addDetalle(p, cantidad);
					
				}
				else {
					throw new CantidadProductosInsuficienteException("Error la compra supera su capacidad maxima por producto");
				}
				
			}
			else {
				throw new StockINsuficienteException("Error stock insuficiente");
			}
			
		}
		else {
			throw new BusquedaProductoException("Error producto no encontrado");
		}
	}
	
	
	//--------------
	
	public Pedido buscarPorNro(Integer nroPedido) {
		for(Pedido p : this.pedidos) {
			if(p.getNroPedido().equals(nroPedido)) return p;
		}
		return null;
	}
	
	public List<Producto> productosMontoMayor(Double monto){
		
	}
	
	public Double compraPromedio() {
		
	}
	
	//-----------
	
	public Integer cantDeUnProd(Producto prodBuscado) {
		
		Integer cant = 0;
		
		for(Pedido p:  this.pedidos) {
			
			for(PedidoDetalle pd: p.getDetalles()){
				
				if(pd.getProducto() == prodBuscado) {
					cant += pd.getCantidad();
				}
			}
		}
		
		return cant;
	}

	
}
