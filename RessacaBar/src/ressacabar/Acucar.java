package ressacabar;

public class Acucar extends DecoradorCondimento {
	
	Caipira caipira;
	
	public Acucar(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + ", Açúcar";
	}
	
	@Override
	public double custo() {
		return 1.25 + caipira.custo();
	}


}
