package py.com.concepto.sysposto.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANEXO")
public class Anexo {
	@Id
	@Column(name = "id",insertable = true, updatable = false, unique = true)
	private Long id;
	
	@Column(name="descricao", length=200, nullable= false)
	private String descricao;

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
		
	
	
}
