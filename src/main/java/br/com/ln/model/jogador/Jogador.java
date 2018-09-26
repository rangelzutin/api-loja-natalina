package  br.com.ln.model.jogador;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Rangel Zutin
 * @version 1.0
 * @since Janeiro 2018
 */
public class Jogador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private int ausenciaTrimestre;
	private int ausenciaAcumulada;
	private int ausenciaTotal;
	private int ranking;
	private int quantosJogou;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM dd, yyyy hh:mm:ss a", locale = "en_US")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimaAusencia;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM dd, yyyy hh:mm:ss a", locale = "en_US")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimaPresenca;
	
	@Enumerated(EnumType.STRING)
	private Posicao posicao;
	
	private boolean espera;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAusenciaTrimestre() {
		return ausenciaTrimestre;
	}

	public void setAusenciaTrimestre(int ausenciaTrimestre) {
		this.ausenciaTrimestre = ausenciaTrimestre;
	}

	public int getAusenciaAcumulada() {
		return ausenciaAcumulada;
	}

	public void setAusenciaAcumulada(int ausenciaAcumulada) {
		this.ausenciaAcumulada = ausenciaAcumulada;
	}

	public int getAusenciaTotal() {
		return ausenciaTotal;
	}

	public void setAusenciaTotal(int ausenciaTotal) {
		this.ausenciaTotal = ausenciaTotal;
	}

	public Date getUltimaAusencia() {
		return ultimaAusencia;
	}

	public void setUltimaAusencia(Date ultimaAusencia) {
		this.ultimaAusencia = ultimaAusencia;
	}

	public Date getUltimaPresenca() {
		return ultimaPresenca;
	}

	public void setUltimaPresenca(Date ultimaPresenca) {
		this.ultimaPresenca = ultimaPresenca;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getQuantosJogou() {
		return quantosJogou;
	}

	public void setQuantosJogou(int quantosJogou) {
		this.quantosJogou = quantosJogou;
	}

	public boolean isEspera() {
		return espera;
	}

	public void setEspera(boolean espera) {
		this.espera = espera;
	}
	
	
}