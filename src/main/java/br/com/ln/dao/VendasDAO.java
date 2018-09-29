package br.com.ln.dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class VendasDAO {

private EntityManager manager;
	
	public VendasDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public BigDecimal getTotalVendasMensal(String tipoValorTotal, Integer mes, String status, String tipoEmissao) {
		
		StringBuilder jpql = new StringBuilder();
		
		jpql.append("SELECT ");
		
		if(tipoValorTotal=="P") jpql.append(" SUM(nt.valorProduto)");  
		if(tipoValorTotal=="N") jpql.append(" SUM(nt.valorTotalNota)");
					  
		jpql.append(" FROM Notas nt WHERE nt.nota IN");
		jpql.append(" (SELECT ne.numeroNota FROM NotasEletronica ne WHERE DATE_PART('month',(DATE(ne.dhRecibo))) = :pMes AND ne.status = :pStatus)");
		
		if(tipoEmissao != null) jpql.append(" AND nt.tipoEmissao = :pTipoEmissao");
		
		Query query = manager.createQuery(jpql.toString());
		
		query.setParameter("pMes", mes);
		query.setParameter("pStatus", status);
		
		if(tipoEmissao != null) query.setParameter("pTipoEmissao", tipoEmissao);
		
		return (BigDecimal) query.getSingleResult();
	}
}
