package ressacabar;

public class Adocante extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Adocante(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + ", Adoçante";
	}
	
	@Override
	public double custo() {
		return 1.75 + caipira.custo();
	}


}
