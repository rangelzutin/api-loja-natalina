package br.com.ln.model.venda;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the notas database table.
 * 
 */
@Entity
@Table(name="notas")
@NamedQuery(name="Nota.findAll", query="SELECT n FROM Notas n")
public class Notas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer codigo;

	@Column(name="acrescimo_valor")
	private BigDecimal acrescimoValor;

	@Column(name="base_icms")
	private BigDecimal baseIcms;

	@Column(name="base_iss")
	private BigDecimal baseIss;

	@Column(name="cabeca_nota_avulsa")
	private Integer cabecaNotaAvulsa;

	@Column(name="cabecalho_devolucao")
	private Integer cabecalhoDevolucao;

	@Column(name="cabecalho_entrega")
	private Integer cabecalhoEntrega;

	@Column(name="cabecalho_nota_compra")
	private Integer cabecalhoNotaCompra;

	@Column(name="cabecalho_ordem_servico")
	private Integer cabecalhoOrdemServico;

	@Column(name="cabecalho_remessa_venda_fora")
	private Integer cabecalhoRemessaVendaFora;

	@Column(name="cabecalho_retorno_venda_fora")
	private Integer cabecalhoRetornoVendaFora;

	private String cancelada;

	private String cep;

	private String cfop;

	@Column(name="cfop_transporte")
	private String cfopTransporte;

	private Integer cliente;

	@Column(name="cod_obs")
	private Integer codObs;

	@Temporal(TemporalType.DATE)
	@Column(name="controle_data")
	private Date controleData;

	@Column(name="controle_hora")
	private Time controleHora;

	@Temporal(TemporalType.DATE)
	@Column(name="data_saida")
	private Date dataSaida;

	@Temporal(TemporalType.DATE)
	private Date dataemissao;

	@Column(name="desconto_valor")
	private BigDecimal descontoValor;

	@Column(name="devolucao_fornecedor")
	private Integer devolucaoFornecedor;

	private String especie;

	private Integer filial;

	private Integer fornecedor;

	private BigDecimal frete;

	@Column(name="frete_por_conta")
	private Integer fretePorConta;

	private Time hora;

	@Column(name="icm_subst")
	private BigDecimal icmSubst;

	private String informacoesfisco;

	private String marca;

	private Boolean mei;

	private Integer modelo;

	@Column(name="modelo_nota")
	private String modeloNota;

	private Integer nota;

	private Integer nsu;

	private String numero;

	private String observacoes;

	private Integer ordem;

	@Column(name="ordem_producao")
	private Integer ordemProducao;

	@Column(name="outras_despesas")
	private BigDecimal outrasDespesas;

	private Integer parcelas;

	@Column(name="peso_bruto")
	private BigDecimal pesoBruto;

	@Column(name="peso_liquido")
	private BigDecimal pesoLiquido;

	private String placa;

	private BigDecimal quantidade;

	@Column(name="redesp_placa")
	private String redespPlaca;

	@Column(name="redesp_transp")
	private Integer redespTransp;

	@Column(name="remessa_conserto")
	private Integer remessaConserto;

	private Boolean scan;

	private BigDecimal seguro;

	private String serie;

	private Integer subserie;

	private String tipo;

	@Column(name="tipo_emissao")
	private String tipoEmissao;

	@Column(name="total_cofins")
	private BigDecimal totalCofins;

	@Column(name="total_cofins_st")
	private BigDecimal totalCofinsSt;

	@Column(name="total_fcp_icms")
	private BigDecimal totalFcpIcms;

	@Column(name="total_fcp_st")
	private BigDecimal totalFcpSt;

	@Column(name="total_ipi")
	private BigDecimal totalIpi;

	@Column(name="total_pis")
	private BigDecimal totalPis;

	@Column(name="total_pis_st")
	private BigDecimal totalPisSt;

	@Column(name="total_servicos")
	private BigDecimal totalServicos;

	private Integer transferencia;

	private Integer transportadora;

	private String uf;

	private Integer usuario;

	@Column(name="valor_icms")
	private BigDecimal valorIcms;

	@Column(name="valor_iss")
	private BigDecimal valorIss;

	@Column(name="valor_produto")
	private BigDecimal valorProduto;

	@Column(name="valor_subst")
	private BigDecimal valorSubst;

	@Column(name="valor_total_nota")
	private BigDecimal valorTotalNota;

	//bi-directional one-to-one association to NotasEletronica
	@OneToOne(mappedBy="nota")
	private NotasEletronica notasEletronica;

	public Notas() {
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getAcrescimoValor() {
		return this.acrescimoValor;
	}

	public void setAcrescimoValor(BigDecimal acrescimoValor) {
		this.acrescimoValor = acrescimoValor;
	}

	public BigDecimal getBaseIcms() {
		return this.baseIcms;
	}

	public void setBaseIcms(BigDecimal baseIcms) {
		this.baseIcms = baseIcms;
	}

	public BigDecimal getBaseIss() {
		return this.baseIss;
	}

	public void setBaseIss(BigDecimal baseIss) {
		this.baseIss = baseIss;
	}

	public Integer getCabecaNotaAvulsa() {
		return this.cabecaNotaAvulsa;
	}

	public void setCabecaNotaAvulsa(Integer cabecaNotaAvulsa) {
		this.cabecaNotaAvulsa = cabecaNotaAvulsa;
	}

	public Integer getCabecalhoDevolucao() {
		return this.cabecalhoDevolucao;
	}

	public void setCabecalhoDevolucao(Integer cabecalhoDevolucao) {
		this.cabecalhoDevolucao = cabecalhoDevolucao;
	}

	public Integer getCabecalhoEntrega() {
		return this.cabecalhoEntrega;
	}

	public void setCabecalhoEntrega(Integer cabecalhoEntrega) {
		this.cabecalhoEntrega = cabecalhoEntrega;
	}

	public Integer getCabecalhoNotaCompra() {
		return this.cabecalhoNotaCompra;
	}

	public void setCabecalhoNotaCompra(Integer cabecalhoNotaCompra) {
		this.cabecalhoNotaCompra = cabecalhoNotaCompra;
	}

	public Integer getCabecalhoOrdemServico() {
		return this.cabecalhoOrdemServico;
	}

	public void setCabecalhoOrdemServico(Integer cabecalhoOrdemServico) {
		this.cabecalhoOrdemServico = cabecalhoOrdemServico;
	}

	public Integer getCabecalhoRemessaVendaFora() {
		return this.cabecalhoRemessaVendaFora;
	}

	public void setCabecalhoRemessaVendaFora(Integer cabecalhoRemessaVendaFora) {
		this.cabecalhoRemessaVendaFora = cabecalhoRemessaVendaFora;
	}

	public Integer getCabecalhoRetornoVendaFora() {
		return this.cabecalhoRetornoVendaFora;
	}

	public void setCabecalhoRetornoVendaFora(Integer cabecalhoRetornoVendaFora) {
		this.cabecalhoRetornoVendaFora = cabecalhoRetornoVendaFora;
	}

	public String getCancelada() {
		return this.cancelada;
	}

	public void setCancelada(String cancelada) {
		this.cancelada = cancelada;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCfop() {
		return this.cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getCfopTransporte() {
		return this.cfopTransporte;
	}

	public void setCfopTransporte(String cfopTransporte) {
		this.cfopTransporte = cfopTransporte;
	}

	public Integer getCliente() {
		return this.cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public Integer getCodObs() {
		return this.codObs;
	}

	public void setCodObs(Integer codObs) {
		this.codObs = codObs;
	}

	public Date getControleData() {
		return this.controleData;
	}

	public void setControleData(Date controleData) {
		this.controleData = controleData;
	}

	public Time getControleHora() {
		return this.controleHora;
	}

	public void setControleHora(Time controleHora) {
		this.controleHora = controleHora;
	}

	public Date getDataSaida() {
		return this.dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Date getDataemissao() {
		return this.dataemissao;
	}

	public void setDataemissao(Date dataemissao) {
		this.dataemissao = dataemissao;
	}

	public BigDecimal getDescontoValor() {
		return this.descontoValor;
	}

	public void setDescontoValor(BigDecimal descontoValor) {
		this.descontoValor = descontoValor;
	}

	public Integer getDevolucaoFornecedor() {
		return this.devolucaoFornecedor;
	}

	public void setDevolucaoFornecedor(Integer devolucaoFornecedor) {
		this.devolucaoFornecedor = devolucaoFornecedor;
	}

	public String getEspecie() {
		return this.especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Integer getFilial() {
		return this.filial;
	}

	public void setFilial(Integer filial) {
		this.filial = filial;
	}

	public Integer getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Integer fornecedor) {
		this.fornecedor = fornecedor;
	}

	public BigDecimal getFrete() {
		return this.frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public Integer getFretePorConta() {
		return this.fretePorConta;
	}

	public void setFretePorConta(Integer fretePorConta) {
		this.fretePorConta = fretePorConta;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public BigDecimal getIcmSubst() {
		return this.icmSubst;
	}

	public void setIcmSubst(BigDecimal icmSubst) {
		this.icmSubst = icmSubst;
	}

	public String getInformacoesfisco() {
		return this.informacoesfisco;
	}

	public void setInformacoesfisco(String informacoesfisco) {
		this.informacoesfisco = informacoesfisco;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean getMei() {
		return this.mei;
	}

	public void setMei(Boolean mei) {
		this.mei = mei;
	}

	public Integer getModelo() {
		return this.modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public String getModeloNota() {
		return this.modeloNota;
	}

	public void setModeloNota(String modeloNota) {
		this.modeloNota = modeloNota;
	}

	public Integer getNota() {
		return this.nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Integer getNsu() {
		return this.nsu;
	}

	public void setNsu(Integer nsu) {
		this.nsu = nsu;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Integer getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public Integer getOrdemProducao() {
		return this.ordemProducao;
	}

	public void setOrdemProducao(Integer ordemProducao) {
		this.ordemProducao = ordemProducao;
	}

	public BigDecimal getOutrasDespesas() {
		return this.outrasDespesas;
	}

	public void setOutrasDespesas(BigDecimal outrasDespesas) {
		this.outrasDespesas = outrasDespesas;
	}

	public Integer getParcelas() {
		return this.parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	public BigDecimal getPesoBruto() {
		return this.pesoBruto;
	}

	public void setPesoBruto(BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public BigDecimal getPesoLiquido() {
		return this.pesoLiquido;
	}

	public void setPesoLiquido(BigDecimal pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public String getRedespPlaca() {
		return this.redespPlaca;
	}

	public void setRedespPlaca(String redespPlaca) {
		this.redespPlaca = redespPlaca;
	}

	public Integer getRedespTransp() {
		return this.redespTransp;
	}

	public void setRedespTransp(Integer redespTransp) {
		this.redespTransp = redespTransp;
	}

	public Integer getRemessaConserto() {
		return this.remessaConserto;
	}

	public void setRemessaConserto(Integer remessaConserto) {
		this.remessaConserto = remessaConserto;
	}

	public Boolean getScan() {
		return this.scan;
	}

	public void setScan(Boolean scan) {
		this.scan = scan;
	}

	public BigDecimal getSeguro() {
		return this.seguro;
	}

	public void setSeguro(BigDecimal seguro) {
		this.seguro = seguro;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Integer getSubserie() {
		return this.subserie;
	}

	public void setSubserie(Integer subserie) {
		this.subserie = subserie;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoEmissao() {
		return this.tipoEmissao;
	}

	public void setTipoEmissao(String tipoEmissao) {
		this.tipoEmissao = tipoEmissao;
	}

	public BigDecimal getTotalCofins() {
		return this.totalCofins;
	}

	public void setTotalCofins(BigDecimal totalCofins) {
		this.totalCofins = totalCofins;
	}

	public BigDecimal getTotalCofinsSt() {
		return this.totalCofinsSt;
	}

	public void setTotalCofinsSt(BigDecimal totalCofinsSt) {
		this.totalCofinsSt = totalCofinsSt;
	}

	public BigDecimal getTotalFcpIcms() {
		return this.totalFcpIcms;
	}

	public void setTotalFcpIcms(BigDecimal totalFcpIcms) {
		this.totalFcpIcms = totalFcpIcms;
	}

	public BigDecimal getTotalFcpSt() {
		return this.totalFcpSt;
	}

	public void setTotalFcpSt(BigDecimal totalFcpSt) {
		this.totalFcpSt = totalFcpSt;
	}

	public BigDecimal getTotalIpi() {
		return this.totalIpi;
	}

	public void setTotalIpi(BigDecimal totalIpi) {
		this.totalIpi = totalIpi;
	}

	public BigDecimal getTotalPis() {
		return this.totalPis;
	}

	public void setTotalPis(BigDecimal totalPis) {
		this.totalPis = totalPis;
	}

	public BigDecimal getTotalPisSt() {
		return this.totalPisSt;
	}

	public void setTotalPisSt(BigDecimal totalPisSt) {
		this.totalPisSt = totalPisSt;
	}

	public BigDecimal getTotalServicos() {
		return this.totalServicos;
	}

	public void setTotalServicos(BigDecimal totalServicos) {
		this.totalServicos = totalServicos;
	}

	public Integer getTransferencia() {
		return this.transferencia;
	}

	public void setTransferencia(Integer transferencia) {
		this.transferencia = transferencia;
	}

	public Integer getTransportadora() {
		return this.transportadora;
	}

	public void setTransportadora(Integer transportadora) {
		this.transportadora = transportadora;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValorIcms() {
		return this.valorIcms;
	}

	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}

	public BigDecimal getValorIss() {
		return this.valorIss;
	}

	public void setValorIss(BigDecimal valorIss) {
		this.valorIss = valorIss;
	}

	public BigDecimal getValorProduto() {
		return this.valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public BigDecimal getValorSubst() {
		return this.valorSubst;
	}

	public void setValorSubst(BigDecimal valorSubst) {
		this.valorSubst = valorSubst;
	}

	public BigDecimal getValorTotalNota() {
		return this.valorTotalNota;
	}

	public void setValorTotalNota(BigDecimal valorTotalNota) {
		this.valorTotalNota = valorTotalNota;
	}

	public NotasEletronica getNotasEletronica() {
		return this.notasEletronica;
	}

	public void setNotasEletronica(NotasEletronica notasEletronica) {
		this.notasEletronica = notasEletronica;
	}

}