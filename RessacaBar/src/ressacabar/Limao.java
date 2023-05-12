package ressacabar;

public class Limao extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Limao(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + ", Limão";
	}
	
	@Override
	public double custo() {
		return 0.85 + caipira.custo();
	}

}