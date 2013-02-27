package py.com.concepto.sysposto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.com.concepto.sysposto.dao.UsuarioDao;
import py.com.concepto.sysposto.model.entity.Filial;
import py.com.concepto.sysposto.model.entity.Usuario;
import py.com.concepto.sysposto.service.UsuarioService;
import br.com.db1.myBatisPersistence.service.GenericMyBatisServiceImpl;
import br.com.db1.session.DB1Session;

@Service(value = "usuarioService")
@Transactional(rollbackFor = Exception.class)
public class UsuarioServiceImpl extends GenericMyBatisServiceImpl<Usuario,Long> implements UsuarioService {

	/**
	 * Propriedade que será injetada pelo <code>Spring</code>.
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
	/**
	 * salva a filial na sessao
	 */
	public void saveSubsidiaryInSession(Filial filial){
		DB1Session.createJavaSession();
		DB1Session.getCurrentSessionType().registerInSession("SYSTEM_INSTANCE", filial);
	}

	

}