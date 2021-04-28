public class Beca{
  public static void main(String[] args){
    //conversion implicita (menor tipo a mayor)
    double multiplicacion = 3.13f + 4.1f;
    System.out.println(multiplicacion);
    //conversion explicita (mayor tipo a menor)
    float conversion = (float)multiplicacion;
    System.out.println(conversion);
    float valor = 1.2f;

    //Ejercicios clase Beca
    System.out.println("Diana Ramírez");
    int edad = 18;
    System.out.println(edad);
    boolean casaPropia = true;
    double salario = 5123.120;
    double neto = salario*.85;
    boolean ingresoMax = 4000>= neto;
    System.out.println(ingresoMax);
    System.out.println(neto);
    boolean aplicar = ingresoMax && casaPropia;
    System.out.println(aplicar);

  }
}
