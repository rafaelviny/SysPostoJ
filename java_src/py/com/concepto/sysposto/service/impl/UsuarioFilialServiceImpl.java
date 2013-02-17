package py.com.concepto.sysposto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.com.concepto.sysposto.dao.UsuarioFilialDao;
import py.com.concepto.sysposto.model.entity.UsuarioFilial;
import py.com.concepto.sysposto.service.UsuarioFilialService;
import br.com.db1.myBatisPersistence.service.GenericMyBatisServiceImpl;



@Service(value = "usuarioFilialService")
@Transactional(rollbackFor = Exception.class)
public class UsuarioFilialServiceImpl extends GenericMyBatisServiceImpl<UsuarioFilial,Long> implements UsuarioFilialService {


	@Autowired 
	private UsuarioFilialDao usuarioFilialDao;

	public UsuarioFilialDao getUsuarioFilialDao() {
		return usuarioFilialDao;
	}

	public void setUsuarioFilialDao(UsuarioFilialDao usuarioFilialDao) {
		this.usuarioFilialDao = usuarioFilialDao;
		this.setGenericDao(usuarioFilialDao);
	}

}