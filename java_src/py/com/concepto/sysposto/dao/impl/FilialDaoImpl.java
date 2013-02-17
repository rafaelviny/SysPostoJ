package py.com.concepto.sysposto.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import py.com.concepto.sysposto.dao.FilialDao;
import py.com.concepto.sysposto.model.entity.Filial;
import br.com.db1.myBatisPersistence.dao.GenericMyBatisDaoImpl;
import br.com.db1.myBatisPersistence.util.MyBatisUtil;

@Repository("filialDao")
public class FilialDaoImpl extends GenericMyBatisDaoImpl<Filial, Long> implements FilialDao {

	/**
	 * Construtor padrão da implementação do <code>Dao</code>.
	 */
	public FilialDaoImpl() {
		super(Filial.class); 
	}

	
	
	
	/**
	 * pesquisa todas as filiais vinculadas a um usuario
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Filial> findListFilialByUsuarioId(Long idUsuario) {
		return  this.getSqlSession().selectList("findListFilialByUsuarioId", MyBatisUtil.createMap("idUsuario", idUsuario));			
	}

}