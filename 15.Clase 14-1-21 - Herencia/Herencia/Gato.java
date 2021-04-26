/**
* Clase derivada Gato que hereda de Animales
* @author Diana Isabel Ramírez García
* @version
*/
public class Gato extends Animales {

  /**
  *Constructor por parámetros
  * @param String - nombre
  */
  public Gato(String nombre){
    super(nombre);
  }

  /**
  * Método que imprime el sonido de un gato
  */
  public void hacerSonido(){
    System.out.println("miau");
  }

  // MAIN
  public static void main(String [] pps) {
    Animales animal1 = new Perros("Bruno");
    Animales animal2 = new Gato("Mona");

    //Código exactamente igual, sin embargo por el polimorfismo imprime
    // cosas distintas
    animal1.hacerSonido();
    animal2.hacerSonido();
  }

}
