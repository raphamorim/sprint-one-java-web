package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import modelo.Pessoa;

@RequestScoped
public class ControleUsuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Pessoa pessoa = new Pessoa();	
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	
	//Metodo chamado pelo botao salvar
	public void salvar(){
		pessoas.add(this.pessoa);
	}
	
}
