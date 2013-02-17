package py.com.concepto.sysposto.dao;

import py.com.concepto.sysposto.model.entity.Usuario;
import br.com.db1.myBatisPersistence.dao.GenericMyBatisDao;



public interface UsuarioDao extends GenericMyBatisDao<Usuario, Long> {

	Usuario findUsuarioByAutentificacao(String login, String senha);
}