package py.com.concepto.sysposto.model.entity.generated
{

		import br.com.db1.core.type.DB1Boolean; 
		import mx.collections.ArrayCollection; 
		import py.com.concepto.sysposto.model.entity.*; 

 		[Bindable]
 		public class _Usuario {		

			public function _Usuario() {
			}

			private var _id:Number; 
			private var _codigo:Number; 
			private var _nome:String; 
			private var _login:String; 
			private var _senha:String; 
			private var _primeiroAcesso:DB1Boolean; 
			private var _salvarSenha:DB1Boolean; 
			private var _ativo:DB1Boolean; 
			private var _filialList:ArrayCollection; 

			[Id]
			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator" )]
			[Column( name="ID_USUARIO" )]
			public function get id():Number{ 
				return _id; 
			} 

			public function set id(value :Number):void{ 
				_id =  value; 
			} 

			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator", length = 10, nullable = false )]
			[Column( name="CD_USUARIO" )]
			public function get codigo():Number{ 
				return _codigo; 
			} 

			public function set codigo(value :Number):void{ 
				_codigo =  value; 
			} 

			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator", length = 60, nullable = false )]
			[Column( name="NM_USUARIO" )]
			public function get nome():String{ 
				return _nome; 
			} 

			public function set nome(value :String):void{ 
				_nome =  value; 
			} 

			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator", length = 30, nullable = false )]
			[Column( name="LOGIN" )]
			public function get login():String{ 
				return _login; 
			} 

			public function set login(value :String):void{ 
				_login =  value; 
			} 

			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator", length = 30, nullable = false )]
			[Column( name="SENHA" )]
			public function get senha():String{ 
				return _senha; 
			} 

			public function set senha(value :String):void{ 
				_senha =  value; 
			} 

			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator", nullable = false )]
			[Column( name="BO_PRIMEIROACESSO" )]
			public function get primeiroAcesso():DB1Boolean{ 
				return _primeiroAcesso; 
			} 

			public function set primeiroAcesso(value :DB1Boolean):void{ 
				_primeiroAcesso =  value; 
			} 

			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator", nullable = false )]
			[Column( name="BO_SALVARSENHA" )]
			public function get salvarSenha():DB1Boolean{ 
				return _salvarSenha; 
			} 

			public function set salvarSenha(value :DB1Boolean):void{ 
				_salvarSenha =  value; 
			} 

			[Validate( name="br.com.db1.core.validator.DB1ColumnValidator", nullable = false )]
			[Column( name="BO_ATIVO" )]
			public function get ativo():DB1Boolean{ 
				return _ativo; 
			} 

			public function set ativo(value :DB1Boolean):void{ 
				_ativo =  value; 
			} 

			[ArrayElementType("py.com.concepto.sysposto.model.entity.Filial")]
			public function get filialList():ArrayCollection{ 
				return _filialList; 
			} 

			public function set filialList(value :ArrayCollection):void{ 
				_filialList =  value; 
			} 


		}

}