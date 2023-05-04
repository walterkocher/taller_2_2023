package model;

import java.util.ArrayList;
import model.Cafe;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private ArrayList<String> redesSociales;
	private ArrayList<Cafe> cafes = new ArrayList<Cafe>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<String> getRedesSociales() {
		throw new UnsupportedOperationException();
	}

	public void setRedesSociales(ArrayList<String> redesSociales) {
		throw new UnsupportedOperationException();
	}

	public Cafeteria(String nombre, String direccion, ArrayList<String> redesSociales) {
		throw new UnsupportedOperationException();
	}
}