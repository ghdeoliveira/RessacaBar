package ressacabar;

public class Mel extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Mel(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + ", Mel";
	}
	
	@Override
	public double custo() {
		return 1.95 + caipira.custo();
	}


}
