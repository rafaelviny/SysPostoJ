package py.com.concepto.sysposto.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FILIAL")
public class Filial implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3748301998522010701L;

	@Id
	@Column(name = "ID_FILIAL",insertable = true, updatable = false, unique = true)
	private Long id;
	
	@Column(name="CD_FILIAL", length=10, nullable= false)
	private Long codigo;

	
	@Column(name="DS_FILIAL", length=60, nullable= false)
	private String descricao;
	
	
	@Column(name="BO_ATIVO", nullable = false)
	private Boolean ativo;
	
	@JoinColumn(name = "ID_EMPRESA",referencedColumnName = "ID_EMPRESA")
	private Empresa empresa;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	
}
