package ressacabar;

public class Saque extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Saque(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + " Saquê";
	}
	
	@Override
	public double custo() {
		return 5.00 + caipira.custo();
	}

}
