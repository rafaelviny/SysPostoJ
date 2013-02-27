package py.com.concepto.sysposto.dao.impl;

import org.springframework.stereotype.Repository;

import py.com.concepto.sysposto.dao.UsuarioFilialDao;
import py.com.concepto.sysposto.model.entity.UsuarioFilial;
import br.com.db1.myBatisPersistence.dao.GenericMyBatisDaoImpl;

@Repository("usuarioFilialDao")
public class UsuarioFilialDaoImpl extends GenericMyBatisDaoImpl<UsuarioFilial, Long> implements UsuarioFilialDao {

	/**
	 * Construtor padrão da implementação do <code>Dao</code>.
	 */
	public UsuarioFilialDaoImpl() {
		super(UsuarioFilial.class); 
	}

}