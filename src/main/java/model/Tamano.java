package model;

public enum Tamano {
	CHICO ("CHICO"),
	MEDIANO("MEDIANO"),
	GRANDE("GRANDE");

	private String tamano;

	private Tamano(String tamano) {
		this.tamano=tamano;

	}

	public String getTamano() {
		return this.tamano;
	}
}