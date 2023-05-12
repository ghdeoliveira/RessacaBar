package ressacabar;

public class Morango extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Morango(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + ", Morango";
	}
	
	@Override
	public double custo() {
		return 1.95 + caipira.custo();
	}

}
