import java.util.Map;

public class ProdutoRepository {
	
	private Map<String, Produto> mapa;
	
	public void salvarProduto(Produto produto ) {
		mapa.put(produto.getNome(), produto);
	}

}
