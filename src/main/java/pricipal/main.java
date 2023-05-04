package pricipal;

import controller.CafeteriaController;
import view.*;

public class main {
	public static void main(String[] args) {
		inicializar();
	}


	public static void inicializar() {
		CafeteriaController cafeteriaController= new CafeteriaController();
		VentanaMenu ventanaMenu= new VentanaMenu("talle2",800,800);


	}
}