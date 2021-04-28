/**
 * Clase ejemplo de Excepciones
 * @author Diana Isabel Ramírez García
 * @version
 */
public class EjemploExcepciones {

  /**
  * Método estático para ejemplificar el lanzado de excepciones
  * @param int - valor
  * @throws IllegalAccessException
  * @throws MiExcepcion
  */
  static void metodo1(int valor) throws IllegalAccessException,MiExcepcion{
    if (valor<0){
      System.out.println("Estoy adentro del if");
      throw new IllegalAccessException("Surgió un error");
    }else if(valor == 0){
      System.out.println("Estoy adentro del if else");
      throw new MiExcepcion("Esta es mi propia excepcion");
    }else{
      System.out.println("No hubo excepción");
    }
  }


  public static void main(String args[]){
    int valor= 0;
    try {
      //int valor= 1; no lo declaramos aquí por el alcance
      metodo1(valor);
    }
    catch (IllegalAccessException e) {
      System.out.println("Se atrapó la excepción: "+"\n" +e);
    }
    catch (MiExcepcion e) {
      System.out.println("Se atrapó la excepción: "+"\n" +e);

    }finally{
      System.out.println("valor es igual a "+valor);
      System.out.println("Siempre se ejecuta el finally");
    }
  }
}
