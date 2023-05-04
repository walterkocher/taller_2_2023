package model;

public enum Ingredientes {
	CREMA("CREMA"), LECHE("LECHE"), CHOCOLATE("CHOCOLATE");
	private String ingredientes;

	private Ingredientes(String ingredientes) {
		this.ingredientes=ingredientes;
	}

	public String getIngredientes() {
		return this.ingredientes;
	}
}