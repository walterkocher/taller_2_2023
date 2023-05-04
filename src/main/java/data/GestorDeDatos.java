package data;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestorDeDatos {

	public static List<String> leerArchivoCafeterias(String direccion) {
		List<String> cafeterias = new ArrayList<>();
		BufferedReader lector = null;

		try {
			// Abre el archivo para lectura
			lector = new BufferedReader(new FileReader(direccion));

			// Lee línea por línea el contenido del archivo
			String linea;
			while ((linea = lector.readLine()) != null) {
				cafeterias.add(linea);
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		} finally {
			// Cierra el archivo
			try {
				if (lector != null) {
					lector.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el archivo: " + e.getMessage());
			}
		}
		return cafeterias;
	}


	public static List<String> leerArchivoCafes(String direccion) {
		List<String> cafes = new ArrayList<>();
		BufferedReader lector = null;

		try {
			// Abre el archivo para lectura
			lector = new BufferedReader(new FileReader(direccion));

			// Lee línea por línea el contenido del archivo
			String linea;
			while ((linea = lector.readLine()) != null) {
				cafes.add(linea);
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		} finally {
			// Cierra el archivo
			try {
				if (lector != null) {
					lector.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el archivo: " + e.getMessage());
			}
		}
		return cafes;

	}

	public boolean registrarDatos(List objetos,String direccion) {
		try {
			File file = new File(direccion);
			Files.deleteIfExists(Paths.get(direccion));
			File fichero = new File(direccion);
			fichero.createNewFile();
			FileWriter fw = new FileWriter(fichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Object objeto : objetos) {
				bw.write(objeto.toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}
}