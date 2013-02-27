package py.com.concepto.sysposto.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.db1.myBatisPersistence.annotations.MBClass;

@Entity
@Table(name = "USUARIO")
@MBClass(additionalInsertColumns = "ID_SYSTEM_INSTANCE", 
		additionalInsertValues = "#{@sessionHandler.SYSTEM_INSTANCE.id}")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7572596536310014005L;

	@Id
	@Column(name = "ID_USUARIO",insertable = true, updatable = false, unique = true)
	private Long id;
	
	@Column(name="CD_USUARIO", length=10, nullable= false)
	private Long codigo;

	
	@Column(name="NM_USUARIO", length=60, nullable= false)
	private String nome;
	
	@Column(name="LOGIN", length=30, nullable= false)
	private String login;
	
	@Column(name="SENHA", length=30, nullable= false)
	private String senha;

	
	@Column(name="LEMBRETESENHA", length=30, nullable= false)
	private String lembrete;
	
	@Column(name="BO_PRIMEIROACESSO", nullable = false)
	private Boolean primeiroAcesso;

	@Column(name="BO_SALVARSENHA", nullable = false)
	private Boolean salvarSenha;
	
	@Column(name="BO_ATIVO", nullable = false)
	private Boolean ativo;
	
	@Transient
	private List<UsuarioFilial> usuarioFilialList;
	
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getPrimeiroAcesso() {
		return primeiroAcesso;
	}

	public void setPrimeiroAcesso(Boolean primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}

	public Boolean getSalvarSenha() {
		return salvarSenha;
	}

	public void setSalvarSenha(Boolean salvarSenha) {
		this.salvarSenha = salvarSenha;
	}
	
	public String getLembrete() {
		return lembrete;
	}

	public void setLembrete(String lembrete) {
		this.lembrete = lembrete;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public List<UsuarioFilial> getUsuarioFilialList() {
		return usuarioFilialList;
	}

	public void setUsuarioFilialList(List<UsuarioFilial> usuarioFilialList) {
		this.usuarioFilialList = usuarioFilialList;
	}

	
	
}
