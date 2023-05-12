package ressacabar;

public class Cachaca extends DecoradorCondimento {
	
	
	Caipira caipira;
	
	public Cachaca(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + " Cachaça";
	}
	
	@Override
	public double custo() {
		return 2.00 + caipira.custo();
	}
	
}
