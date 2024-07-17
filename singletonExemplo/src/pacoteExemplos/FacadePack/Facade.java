package pacoteExemplos.FacadePack;

import pacoteExemplos.Subsistema2.cepApi;
import pacoteExemplos.Subsistema1.crmService;
public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = cepApi.getInstancia().recuperarCidade(cep);
		String estado = cepApi.getInstancia().recuperarEstado(cep);
		
		crmService.gravarCliente(nome, cep, cidade, estado);
	}
}