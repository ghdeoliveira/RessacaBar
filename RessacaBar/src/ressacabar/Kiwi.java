package ressacabar;

public class Kiwi extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Kiwi(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + ", Kiwi";
	}
	
	@Override
	public double custo() {
		return 2.15 + caipira.custo();
	}

}
