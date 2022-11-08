package pe.edu.upc.youngWorker.entities;

import javax.persistence.*;

@Entity
@Table(name="Encargados")
public class Encargado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEncargado;
	@Column(name = "nombreEncargado",length = 45,nullable = false)
	private String nombreEncargado;
	@Column(name = "empresa",length = 45,nullable = false)
	private String empresa;
	@OneToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;

	
	public Encargado(int idEncargado, String nombreEncargado, String empresa, Usuario usuario) {
		this.idEncargado = idEncargado;
		this.nombreEncargado = nombreEncargado;
		this.empresa = empresa;
		this.usuario = usuario;
	}

	public Encargado(){
		super();
	}

	public int getIdEncargado() {
		return idEncargado;
	}
	public void setIdEncargado(int idEncargado) {
		this.idEncargado = idEncargado;
	}

	public String getNombreEncargado() {
		return nombreEncargado;
	}
	public void setNombreEncargado(String nombreEncargado) {
		this.nombreEncargado = nombreEncargado;
	}

	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
