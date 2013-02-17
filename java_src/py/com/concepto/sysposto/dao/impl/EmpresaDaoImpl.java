package py.com.concepto.sysposto.dao.impl;

import org.springframework.stereotype.Repository;

import py.com.concepto.sysposto.dao.EmpresaDao;
import py.com.concepto.sysposto.model.entity.Empresa;
import br.com.db1.myBatisPersistence.dao.GenericMyBatisDaoImpl;



@Repository("empresaDao")
public class EmpresaDaoImpl extends GenericMyBatisDaoImpl<Empresa, Long> implements EmpresaDao {

	public EmpresaDaoImpl() {
		super(Empresa.class); 
	}

	@Override
	public Empresa findById(Long id) {
		// TODO Auto-generated method stub
		Empresa emp = super.findById(id);
		return  emp;
	}
	
	

}