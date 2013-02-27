package py.com.concepto.sysposto.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.db1.myBatisPersistence.annotations.MBClass;

@Entity
@Table(name = "EMPRESA")
public class Empresa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6254839100620868907L;

	@Id
	@Column(name = "ID_EMPRESA",insertable = true, updatable = false, unique = true)
	private Long id;
	
	@Column(name="CD_EMPRESA", length=10, nullable= false)
	private Long codigo;

	@Column(name="DS_EMPRESA", length=60, nullable= false)
	private String descricao;
	
	@Column(name="BO_ATIVO", nullable = false)
	private Boolean ativo;
	
	
//	@OneToMany
//	@MBCascade(excludeStatement = "insertSimpleSemCascade",joinColumns="ID_FILIAL", targetJoinColumns="ID_FILIAL")
//	private List<Filial> filialList;
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

//	public List<Filial> getFilialList() {
//		return filialList;
//	}
//
//	public void setFilialList(List<Filial> filialList) {
//		this.filialList = filialList;
//	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
		
	
	
}
