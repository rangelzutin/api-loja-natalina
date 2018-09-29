package br.com.ln.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.ln.model.jogador.Jogador;
import br.com.ln.service.VendasController;

@Path("vendas")
public class VendasResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/nfce/{mes}")
	public String getTotalVendasMensalNFCE(@PathParam("mes") Integer mes) {
		return new Gson().toJson(new VendasController().getTotalVendasMensal("N", mes, "AUTORIZADA", "NFCE"));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/all")
	public String getTotalVendasMensal() {
		return new Gson().toJson(new VendasController().getTotalVendasMensal("N", 8, "AUTORIZADA", null));
	}
	
	//https://examples.javacodegeeks.com/core-java/json-jax-rs-example/
	//https://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson/
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/salva_jogadores")
	public Response salvaJogadores(List<Jogador> jogadores) {
	
		String result = "Record entered: "+ jogadores;
		return Response.status(201).entity(result).build();
	
	}
}
