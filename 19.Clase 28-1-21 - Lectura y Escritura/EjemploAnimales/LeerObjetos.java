import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.EOFException;
/**
*
* @author Diana Isabel Ramírez García
* @version
*/
public class LeerObjetos{
	public static void main(String [] pps) {
		ObjectInputStream lector= null;
		FileInputStream archivo = null;
		//variable para recuperar
		Animales animalito = null;
		//necesitamos un nombre para el archivo
		String nombreArchivo = "Prueba.txt";
		try{
			//Creamos el archivo en donde leeremos
			archivo=new FileInputStream(nombreArchivo);
			//Creamos el objeto de lectura
			lector=new ObjectInputStream(archivo);
			//ciclo para leer todo el archivo
			do {
				//recuperamos el objeto
				animalito = (Animales) lector.readObject();
				System.out.println(animalito);
			} while (animalito != null);

		} catch(EOFException e) {
			System.out.println("Fin de la lectura del archivo");
		}catch (ClassNotFoundException e) {
			System.out.println("El objeto recuperado no es un Animal");
		} catch(IOException e) {
			System.out.println("Error "+ e);
		} finally {
			if (lector!= null) {
				System.out.println("Vamos a cerrar el flujo de "+ nombreArchivo);
				//usamos try porque puede suceder algún error
				try {
					// Cerramos el flujo del lector
					lector.close();
					// Cerramos el flujo del archivo
					archivo.close();
					System.out.println("Se recuperó con éxito");
				} catch (IOException e) {
					System.out.println(e);
				}//cerramos catch dentro de finally
			}else {
				System.out.println("No hay ningun archivo abierto.");
			}//cerramos la condicional
		}//cerramos finally
	}
}
