package ressacabar;

public class Vinho extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Vinho(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + " Vinho";
	}
	
	@Override
	public double custo() {
		return 2.50 + caipira.custo();
	}

}
