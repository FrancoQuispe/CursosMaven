package tk.yanuks.veterinaria.backend.modal;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "in_id", unique = true, nullable = false)
	private int Id;
	
	@Column(name = "vc_usuario", nullable = false, length = 100)
	private String nombreUsuario;
	
	@Column(name = "vc_contrasena", nullable = false, length = 100)
	private String contrasenaUsuario;
	
	@Column(name = "ts_creacion")
	private Timestamp fechaCreacion;
	
	@Column(name = "ts_actualizacion")
	private Timestamp fechaActualizacion;
	
	@Column(name = "ts_eliminacion")
	private Timestamp fechaEliminacion;
	
	@ManyToOne
	@JoinColumn(name = "in_organizacion_id", nullable = false)
	private Organizacion organizacion;
	
	@Column(name = "vc_correo", nullable = false)
	private int correoUsuario;
	
	@Column(name = "in_estado_id", nullable = false)
	private int estadoUsuario;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}

	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Timestamp getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Timestamp fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Timestamp getFechaEliminacion() {
		return fechaEliminacion;
	}

	public void setFechaEliminacion(Timestamp fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}

	public int getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(int correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public int getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(int estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Organizacion getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}
}
