package unfv.edu.pe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Esto esta alineado a como se creo la tabla en la BD
	private Long idestado;

	@Column(name = "descestado")
	private String descestado;

	public Long getIdestado() {
		return idestado;
	}

	public void setIdestado(Long idestado) {
		this.idestado = idestado;
	}

	public String getDescestado() {
		return descestado;
	}

	public void setDescestado(String descestado) {
		this.descestado = descestado;
	}

	public Estado(String descestado) {
		super();
		this.descestado = descestado;
	}

	public Estado() {
		super();
	}	
}
