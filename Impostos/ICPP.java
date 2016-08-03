package Impostos;

import orcamentos.*;

public class ICPP extends TaxacaoMaxMin {

	@Override
	public boolean condicaoMaximaTaxa(Orcamento orc) {
		// TODO Auto-generated method stub
		if (orc.getValor() >= 500)
			return true;
		return false;
	}

	@Override
	public double calculaTaxMax(Orcamento orc) {
		// TODO Auto-generated method stub
		return orc.getValor()*0.007;
	}

	@Override
	public double calculaTaxMin(Orcamento orc) {
		// TODO Auto-generated method stub
		return orc.getValor()*0.005;
	}



}
