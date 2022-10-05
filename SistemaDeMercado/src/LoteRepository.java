import java.util.Map;

public class LoteRepository {
	
	private Map<String, Lote> mapa;
	
	public void salvarLote(Lote lote) {
		mapa.put(lote.getClass(), lote);
	}
	
	

}