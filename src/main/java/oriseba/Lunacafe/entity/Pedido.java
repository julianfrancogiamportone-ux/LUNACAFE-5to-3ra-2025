package oriseba.Lunacafe.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity

public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime fecha_hora = LocalDateTime.now();
	private String tipo;
	private String estado;
	private double total;
	
	 @ManyToOne
	 @JoinColumn(name = "cliente_id")
	    private Cliente cliente;

	 @ManyToOne
	 @JoinColumn(name = "empleado_id")
	    private Empleado empleado;

	 @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	 private List<Detalle> detalle;
	
	 @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	 private List<Pago> pago;
	
	 public Pedido() {
		super();
	 }
public Pedido(Long id, LocalDateTime fecha_hora, String tipo, String estado, double total, Cliente cliente,
		Empleado empleado, List<Detalle> detalle) {
	super();
	this.id = id;
	this.fecha_hora = fecha_hora;
	this.tipo = tipo;
	this.estado = estado;
	this.total = total;
	this.cliente = cliente;
	this.empleado = empleado;
	this.detalle = detalle;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public LocalDateTime getFecha_hora() {
	return fecha_hora;
}
public void setFecha_hora(LocalDateTime fecha_hora) {
	this.fecha_hora = fecha_hora;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Cliente getCliente() {
	return cliente;
}
public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Empleado getEmpleado() {
	return empleado;
}
public void setEmpleado(Empleado empleado) {
	this.empleado = empleado;
}
public List<Detalle> getDetalle() {
	return detalle;
}
public void setDetalle(List<Detalle> detalle) {
	this.detalle = detalle;
}
	 



}
