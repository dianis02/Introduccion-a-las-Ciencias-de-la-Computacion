/**
 * Clase que crea objetos Funcion (de cine)
 * @author Diana Isabel Ramírez García
 * @version
 */
public class Funcion{
  final int capacidad = 12;
  private int lugares_disponible;
  private String horario;
  private String pelicula;
  private double recaudado; //dinero recaudado por funcion (boleto individual)
  private static double totalrecaudado; //dinero recaudado por boletos generales e individuales
  private static double totalGenerales; //dinero recaudado por boletos generales
  private boolean[][] asientos = new boolean[3][4]; //tam [fila] [columna] se inicia en false;
  //pos false entonces esta libre , si es true está ocupado
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
  public boolean[][] obtenerAsientos(){
    return asientos;
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


  public void asignarTotalGenerales(double dinero){
    totalGenerales = dinero;
  }

  public void asignarTotalRecaudado(double dinero){
    totalrecaudado = dinero;
  }

  /**
  * Metodo para comprar un Boleto para la funcion que invoque al metodo
  * @param tipoBoleto - String indicando el tipo de boleto (general o individual)
  * @return Boleto - objeto de la clase Boleto
  */
  public Boleto comprarBoleto(String tipoBoleto,String asiento){
    Boleto b;
    int i ;
    if(lugares_disponible>0 && !asiento.equals("invalido")){
      b = new Boleto(this,tipoBoleto,asiento); //this señala al objeto actual que invoque al metodo
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

  public boolean compararHorario(String horario){
    //Convertimos Strings en int
    int hora = Integer.parseInt(this.horario.substring(0,2));
    int minutos = Integer.parseInt(this.horario.substring(3,5));
    int horaActual = Integer.parseInt(horario.substring(0,2));
    int minutosActual = Integer.parseInt(horario.substring(3,5));
    //comparamos que el horario de la pelicula sea mayor o igual que la hora que recibe
    return hora==horaActual && minutos >= minutosActual || hora>horaActual;
  }

  public String elegirAsiento(String f, int columna){
    int fila = obtenerFila(f);
    if(fila<0 || fila >=asientos.length || columna<0 ||columna >= asientos[fila].length){
        System.out.println("El asiento no es válido");
        return "invalido";
    }else if(asientos[fila][columna]){
      System.out.println("El lugar ya está ocupado");
      return "invalido";
    }else{
      asientos[fila][columna] = true;
      return f+columna;
    }
  }


  private int obtenerFila(String f){
    int fila = 0;
    switch (f) {
      case "A":
      fila = 0;
      break;

      case "B":
      fila = 1;
      break;

      case "C":
      fila = 2;
      break;

      case "D":
      fila = 3;
      break;

      default :
      fila = -1;
    }
    return fila;
  }


  private String obtenerFila(int f){
    String fila=null;
    switch (f) {
      case 0:
      fila = "A";
      break;

      case 1:
      fila = "B";
      break;

      case 2:
      fila = "C";
      break;

      case 3:
      fila = "D";
      break;
    }
    return fila;
  }

public boolean asientoOcupado(int fila, int columna, Funcion[] funciones){
  boolean[][] matriz;
  boolean libres = true;
  for(int i =0; i<funciones.length; i++){
    matriz=funciones[i].obtenerAsientos();
    if(!matriz[fila][columna]){
      matriz[fila][columna]=true;
  }else{
      System.out.println(funciones[i]+" ya tiene ocupado ese lugar");
       libres=false;
  }
  }
  return  libres;
}

public void imprimirMatriz(){
  System.out.println("    "+"0"+ "    "+" 1"+ "    "+" 2"+ "    "+"  3");
  for (int i = 0;i<asientos.length;i++) {// num filas
    for(int j = 0; j<asientos[i].length;j++){ //num columnas en la fila i
      if(j==0){
      System.out.print(obtenerFila(i) + " ");
      }
      System.out.print(asientos[i][j] + " ");
    }
    System.out.println();
  }
}

  }
