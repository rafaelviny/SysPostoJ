package py.com.concepto.sysposto.service;

import java.util.List;

import py.com.concepto.sysposto.model.entity.Filial;
import br.com.db1.myBatisPersistence.service.GenericMyBatisService;



public interface FilialService extends GenericMyBatisService<Filial, Long> {
	
	List<Filial> findListFilialByUsuarioId(Long idUsuario);
	

}

