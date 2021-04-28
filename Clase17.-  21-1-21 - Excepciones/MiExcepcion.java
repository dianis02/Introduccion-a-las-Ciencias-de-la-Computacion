/**
 * Clase para crear una excepcón que extiende de Excepcion
 * @author Diana Isabel Ramírez García
 * @version
 */
public class MiExcepcion extends Exception {

  /**
  * Constructor por omisión que manda a llamar
  * al Constructor de la clase padre
  */
  public MiExcepcion(){
    super();
  }

  /**
  * Constructor por parámetros que manda a llamar
  * al Constructor de la clase padre
  * @param String - mensaje
  */
  public MiExcepcion(String mensaje){
    super(mensaje);
  }

}
