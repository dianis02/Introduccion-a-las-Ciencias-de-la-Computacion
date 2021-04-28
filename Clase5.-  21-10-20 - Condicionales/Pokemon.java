import java.util.Scanner;
public class Pokemon{
  public static void main(String[] args){
    Scanner enteros = new Scanner(System.in);
    Scanner cadenas = new Scanner(System.in);

    String nombre;
    String rival = "Gary";
    String rivalPokemones = "pikachu,snorlax,dragonite";
    String pokemones;
    //pokemones con más de 1 para poder realizar el cambio de pokemon si quisieramos
    //String pokemones="pikachu";
    boolean estaEnHabitacion = true;
    String ciudades = "Facultad de Ciencias,Anexo de Ingenierı́a,bosque Tı́a Ally";
    int monedasJugador = 300;
    boolean ganar = false;

    System.out.println("Hoy es un buen dı́a en ciudad"+ciudades.substring(0,20)+" porque hoy inicias tus aventuras pokemon");
    System.out.println("Bienvenido, cual es tu nombre");
    nombre = cadenas.nextLine();
    System.out.println("Hola" + nombre);
    System.out.println("1) bulbasaur  2)squirtle  3)charmander ");
    int eleccion = enteros.nextInt();
    if(eleccion== 1){
      pokemones = "bulbasaur";
      //así pondríamos si pokemones ya estuviera inicializado para concatenar otro
      //Se haría este cambio en las 3 opciones
      //pokemones += "bulbasaur";
      System.out.println("Elegiste a "+ pokemones);
    } else if (eleccion == 2){
      pokemones = "squirtle";
      System.out.println("Elegiste a "+ pokemones);
    }else{
    pokemones = "charmander";
    System.out.println("Elegiste a "+ pokemones);
    }

    if(estaEnHabitacion == true){
      int inicio = rivalPokemones.indexOf("snorlax");
      //int fin = rivalPokemones.indexOf("x");
      int longitud = "snorlax".length();
      int fin = inicio + longitud ;
      //System.out.println(rival + " eligio a "+ rivalPokemones.substring(inicio,fin+1));
      System.out.println(rival + " eligio a "+ rivalPokemones.substring(inicio,fin));
      System.out.println("Tienes más de un pokemon?");
      String respuesta = cadenas.nextLine();
      if(respuesta.equals("si")){
        System.out.println("Lo quieres cambiar?");
        String cambiar = cadenas.nextLine().toLowerCase();
        //tengo mas pokemones y cambiar
        if(cambiar.equals("si")){
          System.out.println("Por cuál?");
            String nuevoPokemon = cadenas.nextLine().toLowerCase();
            //Cabe notar que como pokemones en este punto unicamente tiene uno ,nos
            //lanzará un error , y si tuviese más pokemones debería estar el que indica el jugador
            // por el contrario tampoco servira
            int inicio2 = pokemones.indexOf(nuevoPokemon);
            //int fin = rivalPokemones.indexOf("x");
            int longitud2 = nuevoPokemon.length();
            int fin2 = inicio2 + longitud2 ;
            //System.out.println(rival + " eligio a "+ rivalPokemones.substring(inicio,fin+1));
            System.out.println( nombre+ " eligio a "+ pokemones.substring(inicio2,fin2));

        }else{
          System.out.println("No cambiaste de pokemon");
        }
      }else{
        System.out.println("No cambiaste de pokemon porque no tienes más");
      }
//batalla pokemon
      System.out.println("Inicio la batalla pokemon");
      if(ganar == true){
          System.out.println("Se desmayo el pokemon del rival");
          monedasJugador+= 100;
      }

      System.out.println("Se desmayo tu pokemon, sigue entrenando más");
      monedasJugador = monedasJugador-100;

    }else{
      //no hay rival en la estaEnHabitacion
      System.out.println("No hay nadie, seguire entrenando");
    }
    System.out.println("Nuestra aventura pokemon está por continuar ");
  }
}
