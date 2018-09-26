package br.com.ln.service;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.ln.dao.VendasDAO;
import br.com.ln.util.JPAFactory;

public class VendasController {
	
	public BigDecimal getTotalVendasMensal(String tipoValorTotal, int mes, String status, String tipoEmissao) {
		
		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		
		VendasDAO dao = new VendasDAO(manager);
		BigDecimal totalVendasMensal = dao.getTotalVendasMensal(tipoValorTotal, mes, status, tipoEmissao);
		
		manager.getTransaction().commit();
		manager.close();
		
		return totalVendasMensal;
	}

}
