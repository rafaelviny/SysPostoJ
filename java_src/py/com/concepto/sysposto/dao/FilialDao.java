package py.com.concepto.sysposto.dao;

import java.util.List;

import py.com.concepto.sysposto.model.entity.Filial;
import br.com.db1.myBatisPersistence.dao.GenericMyBatisDao;


public interface FilialDao extends GenericMyBatisDao<Filial, Long> {

	List<Filial> findListFilialByUsuarioId(Long idUsuario);

}