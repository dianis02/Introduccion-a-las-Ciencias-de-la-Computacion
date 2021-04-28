/**
 * Clase que crea objetos Funcion (de cine)
 * @author Diana Isabel Ramírez García
 * @version
 */
public class Funcion{
  final int capacidad = 10;
  private int lugares_disponible;
  private String horario;
  private String pelicula;
  private double recaudado; //dinero recaudado por funcion (boleto individual)
  private static double totalrecaudado; //dinero recaudado por boletos generales e individuales
  private static double totalGenerales; //dinero recaudado por boletos generales


  /**
  * Constructor por parametros
  * @param horario - String indicando el inicio de la funcion
  * @param pelicula - String con el titulo de la pelicula
  */
  public Funcion(String horario, String pelicula){
    lugares_disponible = capacidad;
    this.horario = horario;
    this.pelicula = pelicula;
    recaudado = 0;
    totalGenerales = 0;
    totalrecaudado = 0;
  }

  /**
  *Metodo para obtener recaudado
  *@return double
  */
  public double obtenerRecaudado(){
    return recaudado;
  }

  /**
  *Metodo para obtener lugares_disponible
  *@return int
  */
  public int obtenerDisponibilidad(){
    return lugares_disponible;
  }

  /**
  *Metodo para obtener pelicula
  *@return String
  */
  public String obtenerPelicula(){
    return pelicula;
  }

  /**
  *Metodo para obtener horario
  *@return String
  */
  public String obtenerHorario(){
    return horario;
  }

  /**
  *Metodo para obtener totalGenerales
  *@return double
  */
  public double obtenertotalGenerales(){
    return totalGenerales;
  }

  /**
  *Metodo para obtener totalrecaudado
  *@return double
  */
  public double obtenerTotalRecaudado(){
    return totalrecaudado;
  }




  /**
  * Metodo para comprar un Boleto para la funcion que invoque al metodo
  * @param tipoBoleto - String indicando el tipo de boleto (general o individual)
  * @return Boleto - objeto de la clase Boleto
  */
  public Boleto comprarBoleto(String tipoBoleto){
    Boleto b;
    int i ;
    if(lugares_disponible>0){
      b = new Boleto(this,tipoBoleto); //this señala al objeto actual que invoque al metodo
      sumarRecaudado(b);
      sumarTotalRecaudado(b);
      disminuirLugares();
  }else{
    i=0;
    System.out.println("Ya no hay lugares disponibles");
    b = null;
  }
    return b;
  }

  /**
  * Metodo que disminuye en uno la disponibilidad de lugares para la funcion
  */
  public void disminuirLugares(){
    if(lugares_disponible>0){
      lugares_disponible--;
    }else{
      System.out.println("Ya no hay lugares disponibles");
    }
  }

  /**
  * Metodo que suma el costo del boleto dependiendo su tipo: general o individual
  * Si es individual suma a recaudado y si es general suma a totalGenerales
  * @param b - Boleto del cual queremos extraer su tipo y costo
  */
  private void sumarRecaudado(Boleto b){
    if(b.obtenerTipoBoleto().equals("individual")){
      recaudado=recaudado + b.obtenerCosto();
    }else{
        totalGenerales+= b.obtenerCosto();
    }
  }

  /**
  * Metodo para sumar el dinero recaudado por la venta de boletos generales e individuales
  * @param b - Boleto del cual queremos extraer su costo
  */
  private void sumarTotalRecaudado(Boleto b){
      this.totalrecaudado+= b.obtenerCosto();
  }

  /**
  * Metodo para imprimir un objeto Funcion
  *@return String - representando un funcion
  */
  public String toString(){
    String p = "Película: "+ pelicula+"\n";
    String h ="Horario: "+ horario;
    return p+h;
  }

  /**
  * Metodo para comparar 2 Funciones
  *@param f - Funcion a comparar con el objeto Funcion que llame al metodo
  *@return boolean
  */
  public boolean equals(Funcion f){
    return this.pelicula.equals(f.obtenerPelicula()) &&
    this.horario.equals(f.obtenerHorario());
  }


  }
