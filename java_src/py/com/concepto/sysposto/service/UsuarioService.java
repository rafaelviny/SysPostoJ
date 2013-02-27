package py.com.concepto.sysposto.service;

import py.com.concepto.sysposto.model.entity.Filial;
import py.com.concepto.sysposto.model.entity.Usuario;
import br.com.db1.myBatisPersistence.service.GenericMyBatisService;



public interface UsuarioService extends GenericMyBatisService<Usuario, Long> {

	Usuario findUsuarioByAutentificacao(String login, String senha);

	void saveSubsidiaryInSession(Filial filial);

}

