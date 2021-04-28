public class ejemplo{
  public static void main(String[] args){
    int edad = 20;
    boolean estudiante = false;
    System.out.println("----------Ejemplo condicionales-----------");
    //checa que amabas condiciones se cumplan por el operador  &&
    if(edad < 18 && estudiante == true){
      System.out.println("Se cumple ambas condiciones");
    }else{
        System.out.println("No se cumple al menos una condicion");
    }

    System.out.println("\n"); //salto de linea
    System.out.println("----------Ejemplo conversiones-----------");
    int multiplicacion = 3*2;
    int suma = 4+6;
    double division= suma/multiplicacion;  //conversion implicita
    int resultad =  (int) division; //conversion explicita
    System.out.println(division);
    System.out.println(resultad);

    System.out.println("\n"); //salto de linea
    System.out.println("----------Ejemplo cadenas-----------");
    System.out.println("\n"); //salto de linea
    System.out.println("----------trim() y length()-----------");
    String palabra1 = "hola mundoh       ";
    int tam= palabra1.length();
    String palabra2 = palabra1.trim();
    int tam2= palabra2.length();
    System.out.println(tam + " es el tamaño con espacios en blanco al final");
    System.out.println(tam2+  " es el tamaño sin espacios en blanco al final");

    System.out.println("\n"); //salto de linea
    System.out.println("----------indexOf()-----------");
    int posicion= palabra1.indexOf("a");
    int posicion1= palabra1.indexOf("h", 1); //indicamos a partir de que posicion buscar
    System.out.println("a esta en la posicion: "+posicion);
    System.out.println("h esta en la posicion: "+posicion1+" buscando desde la posicion 1");

    System.out.println("\n"); //salto de linea
    System.out.println("----------substring(i,j)-----------");
    //recupera la cadena de la posicion i a j-1
    String subcadena = palabra1.substring(0,posicion+1);
    String subcadena1 = palabra1.substring(0,3);
    String subcadena2= palabra1.substring(0);
    System.out.println(subcadena);
    System.out.println(subcadena1);
    System.out.println(subcadena2);

  }
}
