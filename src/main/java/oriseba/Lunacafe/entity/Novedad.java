package oriseba.Lunacafe.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class Novedad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String cuerpo;
	private int fecha_publicacion;
	private boolean visible;
	
	
	public Novedad(Long id, String titulo, String cuerpo, int fecha_publicacion, boolean visible) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.fecha_publicacion = fecha_publicacion;
		this.visible = visible;
	}


	public Novedad() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCuerpo() {
		return cuerpo;
	}


	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}


	public int getFecha_publicacion() {
		return fecha_publicacion;
	}


	public void setFecha_publicacion(int fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
