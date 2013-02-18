package py.com.concepto.sysposto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.com.concepto.sysposto.dao.UsuarioDao;
import py.com.concepto.sysposto.model.entity.Usuario;
import py.com.concepto.sysposto.service.EmpresaService;
import py.com.concepto.sysposto.service.FilialService;
import py.com.concepto.sysposto.service.UsuarioService;
import br.com.db1.exception.persistence.DB1PersistenceException;
import br.com.db1.myBatisPersistence.service.GenericMyBatisServiceImpl;


/**
 * Implementa��o da <code>Interface</code> que define os m�todos de neg�cio Gen�ricos.
 * Define o nome do <code>Service</code> que ser� criado no <code>Spring</code> e
 * o modelo <code>Transacional</code>. <br/>
 *
 * Esta classe deve conter a implementa��o das regras de neg�cios necess�ria
 * para o <code>Model</code>.
 *
 * @author DB1 Inform�tica - Generated by DB1 Eclipse Plugin
 *
 */
@Service(value = "usuarioService")
@Transactional(rollbackFor = Exception.class)
public class UsuarioServiceImpl extends GenericMyBatisServiceImpl<Usuario,Long> implements UsuarioService {

	/**
	 * Propriedade que ser� injetada pelo <code>Spring</code>.
	 */
	@Autowired 
	private UsuarioDao usuarioDao;
	

	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
		this.setGenericDao(usuarioDao);
	}



	@Override
	public Usuario findUsuarioByAutentificacao(String login, String senha) {
		return usuarioDao.findUsuarioByAutentificacao(login, senha);
	}


	
	


	


	

}