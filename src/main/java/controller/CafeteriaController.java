package controller;

import model.Cafe;
import model.Cafeteria;
import data.GestorDeDatos;
import model.Tamano;

import java.io.*;
import java.util.ArrayList;
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

	public void eliminarCafe(Cafe cafe) {
		//con ayuda de danko y chat gpt
		String archivoOriginal = "cafes.txt";
		String archivoTemporal = "cafes_1.txt";
		String datoAEliminar = cafe.toString();

		BufferedReader lector = null;
		PrintWriter escritor = null;

		try {
			// Abre el archivo original para lectura
			lector = new BufferedReader(new FileReader(archivoOriginal));

			// Crea el archivo temporal para escritura
			escritor = new PrintWriter(new FileWriter(archivoTemporal));

			// Lee línea por línea el contenido del archivo original
			String linea;
			while ((linea = lector.readLine()) != null) {
				// Si la línea no contiene el dato a eliminar, la copia al archivo temporal
				if (!linea.equals(datoAEliminar)) {
					escritor.println(linea);
				}
			}
		} catch (IOException e) {
			System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
		} finally {
			// Cierra los archivos
			try {
				if (lector != null) {
					lector.close();
				}
				if (escritor != null) {
					escritor.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el archivo: " + e.getMessage());
			}
		}

		// Reemplaza el archivo original con el archivo temporal
		File archivoOriginalObj = new File(archivoOriginal);
		File archivoTemporalObj = new File(archivoTemporal);
		if (archivoTemporalObj.renameTo(archivoOriginalObj)) {
			System.out.println("Datos eliminados del archivo.");
		} else {
			System.out.println("Error al reemplazar el archivo original.");
		}
	}


	public List<String> buscarCafe(Tamano tamano) {
		List<String> cafes1 = new ArrayList<>();
		for (String cafe : this.cafes){
			if(Cafe.getTamano().equals(tamano)){
				cafes1.add(cafe);
			}
		}
		return cafes1;

	}

	public void modificarDatosCafeteria(Cafeteria cafeteria) {

	}
}