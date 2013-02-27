package py.com.concepto.sysposto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.com.concepto.sysposto.dao.FilialDao;
import py.com.concepto.sysposto.model.entity.Filial;
import py.com.concepto.sysposto.service.FilialService;
import br.com.db1.myBatisPersistence.service.GenericMyBatisServiceImpl;



@Service(value = "filialService")
@Transactional(rollbackFor = Exception.class)
public class FilialServiceImpl extends GenericMyBatisServiceImpl<Filial,Long> implements FilialService {


	@Autowired 
	private FilialDao filialDao;

	public FilialDao getFilialDao() {
		return filialDao;
	}

	public void setFilialDao(FilialDao filialDao) {
		this.filialDao = filialDao;
		this.setGenericDao(filialDao);
	}

	@Override
	public List<Filial> findListFilialByUsuarioId(Long idUsuario) {
		return filialDao.findListFilialByUsuarioId(idUsuario);
	}


}