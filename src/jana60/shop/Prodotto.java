package jana60.shop;

import java.text.DecimalFormat;

/*
 * Consegna: Creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
 * - marca;
 * - nome;
 * - prezzo;
 * - iva.
 * Scegliere opportunamente il tipo di dato per gli attributi. Aggiungere un costruttore che 
 * inizializza tutti gli attributi.
 * Aggiungere dei metodi per:
 * - calcolare il prezzo comprensivo di iva;
 * - formattare il prezzo restituendo una stringa con un determinato numero di decimali e il carattere €;
 * Per testare le funzionalità della classe prodotto aggiungere una classe Main con metodo main 
 * dove istanziare degli oggetti Prodotto e chiamarne i vari metodi 
 * (i valori degli attributi possono essere scelti arbitrariamente da voi programmatori). 
 */

public class Prodotto {

	// attributi
	String marca;
	String nome;
	double prezzo;
	double iva;

	// costruttori
	Prodotto(String marca, String nome, double prezzo, double iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// metodi
	double calcoloPrezzoIvato() {
		return (1 + iva) * prezzo;

	}

	String formattaPrezzo() {
		DecimalFormat df = new DecimalFormat("'€'0.00");
		return df.format(calcoloPrezzoIvato());
	}

}
