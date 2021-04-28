public class Cadena{
  public static void main(String[] args){
    String literal = "hola";
    String literal3 = "hola";
    String literal2 = "holis";
    String pReservada = new String("hola");
    String pReservada2 = new String("hola");
    String pReservada3 = new String("hola clase icc hola");

    String mensaje = "Hola Mundo";
		//String nuevaCadena = mensaje.toLowerCase();
		//String nuevaCadena = mensaje.toUpperCase();
		//String nuevaCadena = mensaje.trim();
		//String nuevaCadena = mensaje.substring(1,4);
		String nuevaCadena = mensaje.replace("hola","Adios");

		System.out.println(nuevaCadena);


    System.out.println(literal.charAt(0));
    //System.out.println("h"==literal.charAt(0)); no son compatibles
    System.out.println(pReservada3.indexOf("icc"));
    System.out.println(literal.length());
    System.out.println(literal==literal3);
    System.out.println(literal==pReservada);
    System.out.println(pReservada2==pReservada);
    System.out.println(pReservada2.equals(pReservada));

  }
}
