public class EjemploStatic{
    //atributo publico
    public static int edadPerro = 0; //static--> que le pertenece a la clase
    //atributo privado
    private int miEdad = 0; //atributo independiente en cada objeto

    //constructor por omision
    public EjemploStatic(){

    }

    //metodo calculador para aumentar edadPerro
    public void aumentarEdadPerro(){
      edadPerro++;
    }

      //metodo calculador para aumentar miEdad
    public void aumentarMiEdad(){
      miEdad++;
    }

    // metodo de acceso
    public int obtenermiEdad(){
      return miEdad;
    }

}
