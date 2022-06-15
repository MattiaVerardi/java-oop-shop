package jana60.shop;

public class Main {

	public static void main(String[] args) {

		// prodotto 1

		Prodotto prodotto1 = new Prodotto("Nike", "Air Jordan 1", 120, 0.22);
		System.out.println("Il marchio " + prodotto1.marca + " produce il modello " + prodotto1.nome
				+ " al prezzo ivato di " + prodotto1.formattaPrezzo());

	}

}
