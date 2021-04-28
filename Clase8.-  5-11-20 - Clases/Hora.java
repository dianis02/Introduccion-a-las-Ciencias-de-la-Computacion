
public class Hora{
  private int horas;
  private int minutos;
  private int segundos;

  /**
  * Constructor por omisión. Construye la hora 00:00:00
  */
  public Hora(){
    this(0,0,0);
  }

  /** Constructor de una Hora a partir de la hora, los minutos y los segundos
  * @param horas - valor para las horas
  * @param minutos - valor para los minutos
  * @param segundos - valor para los segundos
  */
  public Hora(int horas, int minutos, int s){
    this.horas=horas;
    asignarMinutos(minutos);
    segundos= s;
  }

  /**
  * Constructor una Hora a partir de otra
  * @param h - Hora que se copiará
  */
  public Hora(Hora hora){
    horas = hora.horas;
    minutos = hora.minutos;
    segundos = hora.segundos;
  }
  //metodos de acceso
  /**
  * Método para obtener los minutos en una hora
  * @return int - los minutos del objeto Hora
  */
  public int obtenerMinutos(){
    return minutos;
  }

  /**
  * Método para obtener los segundos en una hora
  * @return int - los segundos del objeto Hora
  */
  public int obtenerSegundos(){
    return segundos;
  }

  /**
  * Método para obtener el número de horas
  * @return int - las horas del objeto Hora
  */
  public int obtenerHoras(){
    return horas;
  }


  //metodos modificadores

  /**
  * Método para asignar los segundos de una hora
  * @param h - los segundos para el objeto Hora
  */
  public void asignarSegundos(int segundos){
    if(segundos >=0 && segundos <60){
      this.segundos = segundos;
    }else{
      System.out.println("No es válido");
      System.exit(0); //termina ejecución
    }
  }

  /**
  * Método para asignar los minutos de una hora
  * @param minutos - los minutos para el objeto Hora
  */
  public void asignarMinutos(int minutos){
    if(minutos >=0 && minutos <60){
      this.minutos =minutos;
    }else{
      System.out.println("No es válido");
      System.exit(0); //termina ejecución
    }
  }

  /**
  * Método para asignar la hora
  * @param horas - las horas para el objeto Hora
  */
  public void asignarHoras(int horas){
    if(horas >=0 && horas <60){
      this.horas =horas;
    }else{
      System.out.println("No es válido");
      System.exit(0); //termina ejecución
    }
  }

  //metodos auxiliares

  /* Método para convertir una hora(hr:min:seg) a un número entero que representa
  * los segundos transcurridos. Cada hora equivale a 3600 segs y cada
  * minuto a 60 segundos
  * @return int - total de segundos de la hora
  */
  private int enSegundos(){
    return horas*3600 + minutos*60+segundos;
  }

  /* Método para convertir un número entero, que representa los segundos
  * transcurridos, en un objeto de la clase Hora
  * @param n - segundos a convertir
  * @return Hora - objeto de la clase hora
  */
  private Hora enHoras(int n){
    int h,m,s;
    h = n/3600;
    n= n % 3600;
    m = n/60;
    s= n %60;
    return new Hora(h,m,s);

  }

  //metodos calculadores
  
  /** Método que suma minutos a un objeto de la clase Hora
  * @param minutos - minutos que se sumarán a la Hora
  */
  public void sumar(int minutos){
    int seg = minutos *60;
    int SumaSegs = enSegundos() + seg;
    Hora suma = enHoras(SumaSegs);
    this.horas = suma.obtenerHoras();
    this. minutos = suma.obtenerMinutos();
    this.segundos = suma.obtenerSegundos();
  }


  /**
  * Método para sumar dos horas
  * @param h - Hora que se sumará a la hora actual
  */
  public void sumar(Hora h){
    int SumaSegs = h.enSegundos() + enSegundos();
    Hora suma = enHoras(SumaSegs);
    this.horas = suma.obtenerHoras();
    this. minutos = suma.obtenerMinutos();
    this.segundos = suma.obtenerSegundos();

  }

  /**
  * Método para comparar dos horas, devolviendo la relación de orden entre ellas
  * @param h - Hora con la que se comparará el objeto que envı́a el mensaje
  * @return int - la relación de orden entre dos horas. >0, <0, =0
  */
  public int comparar(Hora h){
    return enSegundos() - h.enSegundos();
  }

  /**
  * Método para determinar si dos horas son iguales
  * @param h - hora contra la cual se va a comparar
  * @return boolean - true si son iguales y false en otro caso
  */
  public boolean equals(Hora h){
    return comparar(h) == 0;
  }

  /**
  * Método para restar al objeto que envı́a el mensaje la hora especificada en el parámetro
  * @param h -- Hora que se restará
  */
  public void restar(Hora h){
    if(comparar(h) < 0){
      System.out.println("El valor no puede ser negativo");
      System.exit(0);
    }else{
      int restaSegs = h.enSegundos() - enSegundos();
      Hora resta = enHoras(restaSegs);
      this.horas = resta.obtenerHoras();
      this. minutos = resta.obtenerMinutos();
      this.segundos = resta.obtenerSegundos();

    }
  }

  /**
  * Método para convertir una Hora a cadena de caracteres
  * @return String -- la hora en formato de cadena
  */
  public String toString(){
    return horas + ": " + minutos+ ": "+segundos;
  }

}
