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
@Table(name = "organizaciones")
public class Organizacion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "in_id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "vc_razon_social", nullable = false, length = 150)
	private String razonSocial;
	
	@Column(name = "vc_ruc", length = 11, nullable = false)
	private String rucOrganizacion;
	
	@Column(name = "ts_creacion")
	private Timestamp fechaCreacion;
	
	@Column(name = "ts_actualizacion")
	private Timestamp fechaActualizacion;
	
	@Column(name = "ts_eliminacion")
	private Timestamp fechaEliminacion;
	
	@Column(name = "in_estado_id", nullable = false)
	private int parametrosOrganizacion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRucOrganizacion() {
		return rucOrganizacion;
	}

	public void setRucOrganizacion(String rucOrganizacion) {
		this.rucOrganizacion = rucOrganizacion;
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

	public int getParametrosOrganizacion() {
		return parametrosOrganizacion;
	}

	public void setParametrosOrganizacion(int parametrosOrganizacion) {
		this.parametrosOrganizacion = parametrosOrganizacion;
	}
}
