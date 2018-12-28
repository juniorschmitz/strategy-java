package ava;

public class Vip2015 implements Calculo {

	@Override
	public void calcula(Financiamento f, int meses) {
		f.setValorFinal(f.getValorFinanciado() * Math.pow(1 + 0.015, meses));
		f.setValorParcela(f.getValorFinal() / meses);
		f.setValorTarifaAberturaCredito(100.0);
		f.setPeriodos(meses);
	}
}
