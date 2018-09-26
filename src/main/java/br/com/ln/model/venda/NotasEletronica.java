package br.com.ln.model.venda;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the notas_eletronicas database table.
 * 
 */
@Entity
@Table(name="notas_eletronicas")
@NamedQuery(name="NotasEletronica.findAll", query="SELECT n FROM NotasEletronica n")
public class NotasEletronica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="chave_nota")
	private Integer chaveNota;

	private Boolean agrupadas;

	private Integer ambiente;

	private String assinaturaqrcode;

	@Column(name="assinaturaqrcode_cancelamento")
	private String assinaturaqrcodeCancelamento;

	private String certificado;

	@Column(name="cnpj_destinatario")
	private String cnpjDestinatario;

	@Column(name="codigo_retorno")
	private Integer codigoRetorno;

	@Column(name="dh_recibo")
	private String dhRecibo;

	@Column(name="dh_recibo_cancelamento")
	private String dhReciboCancelamento;

	@Column(name="endereco_consulta")
	private String enderecoConsulta;

	private Boolean enviada;

	@Column(name="erro_transmitir")
	private Boolean erroTransmitir;

	private String id;

	@Column(name="id_cancelamento_sat")
	private String idCancelamentoSat;

	private Boolean impressa;

	private Integer lote;

	private String marcada;

	private String motivo;

	@Column(name="numero_nota")
	private Integer numeroNota;

	private String protocolo;

	private String protocolodecancelamentoextemporaneo;

	private String recibo;

	private String serie;

	private Boolean sincrono;

	private String status;

	@Column(name="tempo_espera")
	private Integer tempoEspera;

	@Column(name="uf_responsavel")
	private String ufResponsavel;

	@Column(name="versao_dados")
	private String versaoDados;

	@Column(name="versao_servico")
	private String versaoServico;

	//bi-directional one-to-one association to Nota
	@OneToOne
	@JoinColumn(name="chave_nota")
	private Notas nota;

	public NotasEletronica() {
	}

	public Integer getChaveNota() {
		return this.chaveNota;
	}

	public void setChaveNota(Integer chaveNota) {
		this.chaveNota = chaveNota;
	}

	public Boolean getAgrupadas() {
		return this.agrupadas;
	}

	public void setAgrupadas(Boolean agrupadas) {
		this.agrupadas = agrupadas;
	}

	public Integer getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(Integer ambiente) {
		this.ambiente = ambiente;
	}

	public String getAssinaturaqrcode() {
		return this.assinaturaqrcode;
	}

	public void setAssinaturaqrcode(String assinaturaqrcode) {
		this.assinaturaqrcode = assinaturaqrcode;
	}

	public String getAssinaturaqrcodeCancelamento() {
		return this.assinaturaqrcodeCancelamento;
	}

	public void setAssinaturaqrcodeCancelamento(String assinaturaqrcodeCancelamento) {
		this.assinaturaqrcodeCancelamento = assinaturaqrcodeCancelamento;
	}

	public String getCertificado() {
		return this.certificado;
	}

	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	public String getCnpjDestinatario() {
		return this.cnpjDestinatario;
	}

	public void setCnpjDestinatario(String cnpjDestinatario) {
		this.cnpjDestinatario = cnpjDestinatario;
	}

	public Integer getCodigoRetorno() {
		return this.codigoRetorno;
	}

	public void setCodigoRetorno(Integer codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getDhRecibo() {
		return this.dhRecibo;
	}

	public void setDhRecibo(String dhRecibo) {
		this.dhRecibo = dhRecibo;
	}

	public String getDhReciboCancelamento() {
		return this.dhReciboCancelamento;
	}

	public void setDhReciboCancelamento(String dhReciboCancelamento) {
		this.dhReciboCancelamento = dhReciboCancelamento;
	}

	public String getEnderecoConsulta() {
		return this.enderecoConsulta;
	}

	public void setEnderecoConsulta(String enderecoConsulta) {
		this.enderecoConsulta = enderecoConsulta;
	}

	public Boolean getEnviada() {
		return this.enviada;
	}

	public void setEnviada(Boolean enviada) {
		this.enviada = enviada;
	}

	public Boolean getErroTransmitir() {
		return this.erroTransmitir;
	}

	public void setErroTransmitir(Boolean erroTransmitir) {
		this.erroTransmitir = erroTransmitir;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdCancelamentoSat() {
		return this.idCancelamentoSat;
	}

	public void setIdCancelamentoSat(String idCancelamentoSat) {
		this.idCancelamentoSat = idCancelamentoSat;
	}

	public Boolean getImpressa() {
		return this.impressa;
	}

	public void setImpressa(Boolean impressa) {
		this.impressa = impressa;
	}

	public Integer getLote() {
		return this.lote;
	}

	public void setLote(Integer lote) {
		this.lote = lote;
	}

	public String getMarcada() {
		return this.marcada;
	}

	public void setMarcada(String marcada) {
		this.marcada = marcada;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Integer getNumeroNota() {
		return this.numeroNota;
	}

	public void setNumeroNota(Integer numeroNota) {
		this.numeroNota = numeroNota;
	}

	public String getProtocolo() {
		return this.protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getProtocolodecancelamentoextemporaneo() {
		return this.protocolodecancelamentoextemporaneo;
	}

	public void setProtocolodecancelamentoextemporaneo(String protocolodecancelamentoextemporaneo) {
		this.protocolodecancelamentoextemporaneo = protocolodecancelamentoextemporaneo;
	}

	public String getRecibo() {
		return this.recibo;
	}

	public void setRecibo(String recibo) {
		this.recibo = recibo;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Boolean getSincrono() {
		return this.sincrono;
	}

	public void setSincrono(Boolean sincrono) {
		this.sincrono = sincrono;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTempoEspera() {
		return this.tempoEspera;
	}

	public void setTempoEspera(Integer tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public String getUfResponsavel() {
		return this.ufResponsavel;
	}

	public void setUfResponsavel(String ufResponsavel) {
		this.ufResponsavel = ufResponsavel;
	}

	public String getVersaoDados() {
		return this.versaoDados;
	}

	public void setVersaoDados(String versaoDados) {
		this.versaoDados = versaoDados;
	}

	public String getVersaoServico() {
		return this.versaoServico;
	}

	public void setVersaoServico(String versaoServico) {
		this.versaoServico = versaoServico;
	}

	public Notas getNota() {
		return this.nota;
	}

	public void setNota(Notas nota) {
		this.nota = nota;
	}

}