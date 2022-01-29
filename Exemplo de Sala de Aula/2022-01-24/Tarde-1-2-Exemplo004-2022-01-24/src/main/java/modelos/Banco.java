package modelos;

import java.util.HashMap;

public class Banco {
	
	private HashMap<String, Produto> tabela;
	
	public Banco(){
		tabela = new HashMap<String, Produto>();
		inicializar();
	}
	
	public HashMap<String, Produto> getTabela(){
		return tabela;
	}
	
	private void inicializar() {
		Produto prod = new Produto();
		
		prod.setCodigo("111");
		prod.setDescricao("Caneta azul");
		prod.setPreco(12);
		prod.setQuant(150);
		
		tabela.put(prod.getCodigo(), prod);
	}
	

}
