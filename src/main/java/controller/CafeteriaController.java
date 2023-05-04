package controller;

import model.Cafe;
import model.Cafeteria;
import data.GestorDeDatos;

import java.util.List;

public class CafeteriaController {
	private List<String> cafeterias;
	private List<String> cafes;

	public void cargarCafeteria() {
		cafeterias= GestorDeDatos.leerArchivoCafeterias("cafeterias.txt");

	}

	public void cargarCafes() {
		cafes= GestorDeDatos.leerArchivoCafes("cafe.text");
	}

	public void agregarCafe(Cafeteria cafeteria, Cafe cafe) {

	}

	public void eliminarCafe(Cafeteria cafeteria, Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public Cafe buscarCafe(Cafeteria cafeteria, Object tamano) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatosCafeteria(Cafeteria cafeteria) {
		throw new UnsupportedOperationException();
	}
}