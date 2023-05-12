package ressacabar;

public class RessacaBar {

	public static void main(String[] args) {

		Drink drink = new Caipira();
		System.out.println(drink.getDescricao() + " = R$ " + String.format("%.2f", drink.custo()));
		
		Caipira drink1 = new Caipira();
		drink1 = new Vodka(drink1);
		drink1 = new Morango(drink1);
		drink1 = new Adocante(drink1);
		System.out.println(drink1.getDescricao() + " = R$ " + String.format("%.2f", drink1.custo()));
		
		Caipira drink2 = new Caipira();
		drink2 = new Saque(drink2);
		drink2 = new Abacaxi(drink2);
		drink2 = new Kiwi(drink2);
		drink2 = new Acucar(drink2);
		System.out.println(drink2.getDescricao() + " = R$ " + String.format("%.2f", drink2.custo()));
		
		Caipira drink3 = new Caipira();
		drink3 = new Vinho(drink3);
		drink3 = new Limao(drink3);
		drink3 = new Mel(drink3);
		System.out.println(drink3.getDescricao() + " = R$ " + String.format("%.2f", drink3.custo()));
		
		Drink drink4 = new Caipirinha();
		System.out.println(drink4.getDescricao() + " = R$ " + String.format("%.2f", drink4.custo()));

	}

}
