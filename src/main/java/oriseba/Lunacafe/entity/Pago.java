package oriseba.Lunacafe.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String metodo;
	private double monto;
	private LocalDateTime fecha_hora = LocalDateTime.now();
	private String estado;
	
	@ManyToOne
    @JoinColumn(name = "pedido_id")
	private Pedido pedido;

	public Pago() {
		super();
	}

	public Pago(Long id, String metodo, double monto, LocalDateTime fecha_hora, String estado, Pedido pedido) {
		super();
		this.id = id;
		this.metodo = metodo;
		this.monto = monto;
		this.fecha_hora = fecha_hora;
		this.estado = estado;
		this.pedido = pedido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public LocalDateTime getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(LocalDateTime fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
