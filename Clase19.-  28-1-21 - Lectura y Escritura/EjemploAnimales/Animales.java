import java.io.Serializable;
/**
* Clase Padre Animales
* @author Diana Isabel Ramírez García
* @version
*/
public class Animales implements Serializable{
  String nombre;

  /**
  *Constructor por parámetros
  * @param String - nombre
  */
  public Animales(String nombre){
    this.nombre=nombre;
  }

  /**
  * Método que imprime el sonido de un animal
  * Se puso woof como ejemplo para que Perros lo heredara tal cual
  * sin sobrescribir como fue el caso de Gato
  */
  public void hacerSonido(){
    System.out.println("woof");
  }

}
