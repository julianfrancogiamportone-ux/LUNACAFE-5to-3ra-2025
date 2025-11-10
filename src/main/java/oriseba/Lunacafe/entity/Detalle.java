package oriseba.Lunacafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class Detalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int Cantidad;
	private double precio_unitario;
	 @ManyToOne
	 @JoinColumn(name = "pedido_id")
	 private Pedido pedido;

	 @ManyToOne
	 @JoinColumn(name = "producto_id")
	 private Producto producto;

	 public Detalle() {
		super();
	 }

	 public Detalle(Long id, int cantidad, double precio_unitario, Pedido pedido, Producto producto) {
		super();
		this.id = id;
		Cantidad = cantidad;
		this.precio_unitario = precio_unitario;
		this.pedido = pedido;
		this.producto = producto;
	 }

	 public Long getId() {
		 return id;
	 }

	 public void setId(Long id) {
		 this.id = id;
	 }

	 public int getCantidad() {
		 return Cantidad;
	 }

	 public void setCantidad(int cantidad) {
		 Cantidad = cantidad;
	 }

	 public double getPrecio_unitario() {
		 return precio_unitario;
	 }

	 public void setPrecio_unitario(double precio_unitario) {
		 this.precio_unitario = precio_unitario;
	 }

	 public Pedido getPedido() {
		 return pedido;
	 }

	 public void setPedido(Pedido pedido) {
		 this.pedido = pedido;
	 }

	 public Producto getProducto() {
		 return producto;
	 }

	 public void setProducto(Producto producto) {
		 this.producto = producto;
	 }
	 
	 
}
