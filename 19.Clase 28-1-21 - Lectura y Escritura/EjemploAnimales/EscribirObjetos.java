import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
/**
*
* @author Diana Isabel Ramírez García
* @version
*/
public class EscribirObjetos{
	public static void main(String [] pps) {

		ObjectOutputStream escritor = null;
		FileOutputStream archivo = null;
		//necesitamos un nombre para el archivo
		String nombreArchivo = "Prueba.txt";
		try{
			//Creamos el archivo en donde escribiremos
			archivo=new FileOutputStream(nombreArchivo);
			//Creamos el objeto de escritura
			escritor=new ObjectOutputStream(archivo);
			//Creamos un objeto Perro y Gato
			Animales gatito = new Gato("Mona");
			Animales perrito = new Perros("Bruno");
			//Guardamos el objeto en el archivo
			escritor.writeObject(gatito);
			escritor.writeObject(perrito);

		} catch(NotSerializableException e){
			System.out.println("El objeto a guardar no es serializable");
		} catch(IOException e){
			System.out.println("Surgió un error en el guardado"+e);
		} finally {
			if (escritor != null) {
				System.out.println("Vamos a cerrar el flujo de "+ nombreArchivo);
				//usamos try porque puede suceder algún error
				try {
					// Cerramos el flujo del escritor
					escritor.close();
					// Cerramos el flujo del archivo
					archivo.close();
					System.out.println("Se guardo con éxito");
				} catch (IOException e) {
					System.out.println(e);
				}//cerramos catch dentro de finally
			}else {
				System.out.println("No hay ningun archivo abierto.");
			}//cerramos la condicional
		}//cerramos finally
	}
}
