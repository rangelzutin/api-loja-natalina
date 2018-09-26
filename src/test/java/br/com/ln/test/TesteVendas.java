package br.com.ln.test;


import javax.persistence.EntityManager;

import br.com.ln.resource.VendasResource;
import br.com.ln.util.JPAFactory;

public class TesteVendas {

	public static void main(String[] args) {

		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		
		/*VendasDAO dao = new VendasDAO(manager);
		
		BigDecimal vendasTotalProdutos = dao.getTotalVendasMensal("P", 8, "AUTORIZADA", "NFCE");
		System.out.println(vendasTotalProdutos);
		
		BigDecimal vendasTotalNotas = dao.getTotalVendasMensal("N", 8, "AUTORIZADA", "NFCE");
		System.out.println(vendasTotalNotas);*/
		
		VendasResource resource = new VendasResource();
		System.out.println(resource.getTotalVendasMensal());
	}
}