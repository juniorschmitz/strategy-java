package ava;

public class Conv2015 implements Calculo {

	@Override
	public void calcula(Financiamento f, int meses) {tub
		f.setValorFinal(f.getValorFinanciado() * Math.pow(1 + 0.02, meses));
		f.setValorFinal(f.getValorFinanciado() * Math.pow(1 + 0.02, meses));
		f.setValorParcela(f.getValorFinal() / meses);
		f.setValorTarifaAberturaCredito(200.0);
		f.setPeriodos(meses);
	}

}
