public class ColeccionFunciones{
  //crear las funciones aquí directo
  private Funcion f1 = new Funcion("12:00:00","Hereditary");
  private Funcion f2 = new Funcion("14:30:00","Alien");
  private Funcion f3 = new Funcion("16:00:00","It Follows");
  private Funcion f4 = new Funcion("18:00:00","A Quiet Place");
  private Funcion f5 = new Funcion("20:00:00","Jaws");
  private Funcion f6 = new Funcion("12:00:00","Todas");
  Funcion[] funciones = {f1,f2,f3,f4,f5,f6};;

  //Crear un arreglo con las funciones
  public ColeccionFunciones(){
    //funciones = {f1,f2,f3,f4,f5,f6};
  }


  //Metodo para mostrar las peliculas aun disponibles por el Horario
  //recibe un String con la hora actual
  public Funcion[] peliculasSobrantes(String horario){
    //Funcion [] sobrantes;
    int longitud=0;
    int pos=0;
    for(int i = 0; i<funciones.length; i++){
      //definir tam array
      if(funciones[i].compararHorario(horario)){
        //ejemplo funcion 2
        //0 1 2 3 4 5 6
        // 7- 2
        // 2 3 4 5 6
        pos=i;
        longitud= funciones.length-i;
        break;
      }
    }
    //lo creamos aqui por el alcance
      Funcion[] sobrantes = new Funcion[longitud];

      //llenamos el arreglo de sobrantes
      for(int i = 0; i<sobrantes.length; i++){
        sobrantes[i]=funciones[pos];
        pos++;
      }
    return sobrantes;
  }

  public Funcion[] obtenerColeccion(){
    return funciones;
  }

}
