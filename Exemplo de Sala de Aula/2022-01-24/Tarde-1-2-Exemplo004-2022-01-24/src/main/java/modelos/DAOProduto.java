package modelos;

import java.util.HashMap;

public class DAOProduto {
	
	private Banco banco;
	private HashMap<String, Produto> tabela;
	
	public DAOProduto() {
		banco = new Banco();
		tabela = banco.getTabela();
	}
	
	public void incluir(Produto produto) {
		
	}
	
    public void excluir(Produto produto) {
		
	}
    
    public void alterar(Produto produto) {
		
	}
    
    public Produto consultar(Produto produto) {
		return tabela.get(produto.getCodigo());
	}

}
