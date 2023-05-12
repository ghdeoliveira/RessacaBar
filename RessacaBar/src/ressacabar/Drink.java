package ressacabar;

public abstract class Drink {
	
	String descricao = "Bebida desconhecida";
	
	public String getDescricao() {
		return descricao;
	}
	
	public abstract double custo();

}
