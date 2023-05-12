package ressacabar;

public class Vodka extends DecoradorCondimento {
	
	/*Drink drink;
	
	public Vodka(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String getDescricao() {
		return drink.getDescricao() + " Vodka";
	}
	
	@Override
	public double custo() {
		return 3.00 + drink.custo();
	}
	*/

	Caipira caipira;
	
	public Vodka(Caipira caipira) {
		this.caipira = caipira;
	}

	@Override
	public String getDescricao() {
		return caipira.getDescricao() + " Vodka";
	}
	
	@Override
	public double custo() {
		return 3.00 + caipira.custo();
	}
	
}
