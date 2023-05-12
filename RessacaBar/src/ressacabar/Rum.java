package ressacabar;

public class Rum extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Rum(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + " Rum";
	}
	
	@Override
	public double custo() {
		return 2.80 + caipira.custo();
	}

}
