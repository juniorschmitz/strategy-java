package ava;

public class Financiamento {
	private String cliente;
	private double rendaBruta;
	private boolean moradiaPropria;
	private String fabricanteVeiculo;
	private String modeloVeiculo;
	private int anoFabricacaoVeiculo;
	private int anoModeloVeiculo;
	private double valorVeiculo;
	private double valorEntrada;
	private Calculo tipo;

	private int periodos;
	private double valorTarifaAberturaCredito;
	private double valorFinal;
	private double valorParcela;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public boolean isMoradiaPropria() {
		return moradiaPropria;
	}

	public void setMoradiaPropria(boolean moradiaPropria) {
		this.moradiaPropria = moradiaPropria;
	}

	public String getFabricanteVeiculo() {
		return fabricanteVeiculo;
	}

	public void setFabricanteVeiculo(String fabricanteVeiculo) {
		this.fabricanteVeiculo = fabricanteVeiculo;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public int getAnoFabricacaoVeiculo() {
		return anoFabricacaoVeiculo;
	}

	public void setAnoFabricacaoVeiculo(int anoFabricacaoVeiculo) {
		this.anoFabricacaoVeiculo = anoFabricacaoVeiculo;
	}

	public int getAnoModeloVeiculo() {
		return anoModeloVeiculo;
	}

	public void setAnoModeloVeiculo(int anoModeloVeiculo) {
		this.anoModeloVeiculo = anoModeloVeiculo;
	}

	public double getValorVeiculo() {
		return valorVeiculo;
	}

	public void setValorVeiculo(double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	public double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	

	public void setPeriodos(int periodos) {
		this.periodos = periodos;
	}

	public Calculo getTipo() {
		return tipo;
	}

	public void setTipo(Calculo tipo) {
		this.tipo = tipo;
	}

	public void setValorTarifaAberturaCredito(double valorTarifaAberturaCredito) {
		this.valorTarifaAberturaCredito = valorTarifaAberturaCredito;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public int getPeriodos() {
		return periodos;
	}

	public double getValorTarifaAberturaCredito() {
		return valorTarifaAberturaCredito;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public void calcula(int meses) {
		this.getTipo().calcula(this, meses);
	}

	double getValorFinanciado() {
		return getValorVeiculo() - getValorEntrada();
	}
}