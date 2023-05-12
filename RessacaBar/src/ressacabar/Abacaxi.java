package ressacabar;

public class Abacaxi extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Abacaxi(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + ", Abacaxi";
	}
	
	@Override
	public double custo() {
		return 1.35 + caipira.custo();
	}

}
