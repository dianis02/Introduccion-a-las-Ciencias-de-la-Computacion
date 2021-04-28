public class Main{
  public static void main(String [] pps) {
    //creamos 2 objetos a a partir del constructor por omision
    EjemploStatic obj1 = new EjemploStatic();
    EjemploStatic obj2 = new EjemploStatic();

    //aumentamos el atributo static edadPerro
    obj1.aumentarEdadPerro();
    obj2.aumentarEdadPerro();

    //aumentamos el atributo miEdad del objeto1
    obj1.aumentarMiEdad();
    obj1.aumentarMiEdad();
    obj1.aumentarMiEdad();

    //aumentamos el atributo miEdad del objeto2
    obj2.aumentarMiEdad();

    // para ejemplificar que el atributo edadPerro será el mismo
    System.out.println("Obj1 y Obj2 tienen el mismo perro");

    // acceso publico edadPerro
    System.out.println("El perro de obj1 tiene: "+obj1.edadPerro);
    System.out.println("El perro de obj1 tiene: "+obj2.edadPerro);

    //acceso privado miEdad
    //Por eso usamos un metodo de acceso
    System.out.println("obj1 edad : "+obj1.obtenermiEdad());
    System.out.println("obj2 edad: "+obj2.obtenermiEdad());
  }
}
