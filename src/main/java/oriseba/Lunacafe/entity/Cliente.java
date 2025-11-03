package oriseba.Lunacafe.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int teléfono;
	private String email;
	
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

//Constructors
	public Cliente() {
		super();
	}

public Cliente(Long id, String nombre, int teléfono, String email, List<Pedido> pedidos) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.teléfono = teléfono;
	this.email = email;
	this.pedidos = pedidos;
}

//Getters and Setters

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getTeléfono() {
	return teléfono;
}

public void setTeléfono(int teléfono) {
	this.teléfono = teléfono;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<Pedido> getPedidos() {
	return pedidos;
}

public void setPedidos(List<Pedido> pedidos) {
	this.pedidos = pedidos;
}





    
}
