package model;

public class Cafe {
	private static Tamano tamano;
	private Ingredientes ingredientes;

	public Cafe(Tamano tamano, Ingredientes ingredientes) {
		this.tamano = tamano;
		this.ingredientes = ingredientes;
	}

	public static Tamano getTamano() {
		return tamano;
	}
}