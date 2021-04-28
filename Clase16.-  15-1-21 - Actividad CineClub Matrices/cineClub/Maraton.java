/**
 * Clase Maraton donde interactuamos con el usuario
 * @author Diana Isabel Ramírez García
 * @version
 */
import java.util.Scanner;
public class Maraton{
  public static void main(String [] pps) {
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    ColeccionFunciones c = new ColeccionFunciones();
    Funcion[] funciones = c.obtenerColeccion();


    int condicion =1;
    while(condicion == 1){
    System.out.println("Bienvenido al Maratón de Terror");
    System.out.println("------------------------------------");
    System.out.println("Las funciones que se muestran son: "+"\n");
    int num=1;
    for(int j = 0; j<funciones.length-1;j++){
      System.out.println(num+")"+funciones[j]);
      num++;
    }
    System.out.println("------------------------------------"+"\n");

    System.out.println("¿Quieres comprar un boleto o ver las funciones disponibles?(Ingresa 1/2 respectivamente)");
    int opcion =in2.nextInt();
    switch(opcion){
    case 1:
    System.out.println("¿Qué tipo de boleto deseas comprar?(individual/general)");
    String tipo =in.nextLine();
    Boleto boleto= null;
    //Boleto general
    if(tipo.equals("general")){

      String asientos = "";
      for(int i =0; i<funciones.length-1; i++){
        System.out.println("Elige un lugar para "+funciones[i].obtenerPelicula());
        funciones[i].imprimirMatriz();
        System.out.println("Ingresa la fila : A,B,C");
        String fila = in.nextLine();
        System.out.println("Ingresa la columna : 0,1,2");
        int columna = in2.nextInt();
        String asiento = funciones[i].elegirAsiento(fila,columna);
        boleto = funciones[i].comprarBoleto(tipo,asiento);
        asientos=asientos+","+asiento;
      }
      //boleto = funciones[5].comprarBoleto(tipo,asientos);
      //{50,50,50,50,50,50}
      //length = 6
      //300-x= 50;
      //x = 250= 50*5
      boleto = funciones[5].comprarBoleto(tipo,asientos);
      double precio = funciones[5].obtenertotalGenerales()-50*(funciones.length-1);
      funciones[5].asignarTotalGenerales(precio);
      funciones[5].asignarTotalRecaudado(precio);
      System.out.println(boleto);
      //Boleto individual
    }else if(tipo.equals("individual")){
      System.out.println("¿Para qué función?(Ingresa el número)"+"\n"+" Recuerda que son:");
      System.out.println("------------------------------------"+"\n");
      num=1;
      for(int j = 0; j<funciones.length-1;j++){
        System.out.println(num+")"+funciones[j]);
        num++;
      }
      System.out.println("------------------------------------"+"\n");

      //Elegimos funcion, podemos cambiar los ifs por un switch
      int op = in2.nextInt();
      funciones[op-1].imprimirMatriz();
      System.out.println("Ingresa la fila : A,B,C");
      String fila = in.nextLine();
      System.out.println("Ingresa la columna : 0,1,2");
      int columna = in2.nextInt();
      String asiento = funciones[op-1].elegirAsiento(fila,columna);
      boleto = funciones[op-1].comprarBoleto(tipo,asiento);
      System.out.println(boleto);
      //No se ingreso ni general ni individual
    }else{
      System.out.println("No es un tipo válido");
    }
    System.out.println("------------------------------------"+"\n");
    System.out.println("Dinero recaudado y disponibilidad: ");
    for(int i = 0; i<funciones.length-1;i++){
      System.out.println(funciones[i].obtenerPelicula()+": $"+funciones[i].obtenerRecaudado()+" disponibilidad : "+funciones[i].obtenerDisponibilidad());
    }
    System.out.println("Boletos generales"+": $"+funciones[5].obtenertotalGenerales()); //cualquier funcion podria llamar al metodo
    System.out.println(funciones[5].obtenerPelicula()+": $"+funciones[5].obtenerTotalRecaudado());// y nos daría el mismo valor por ser static
    System.out.println("------------------------------------"+"\n");
    break;

    case 2:
    System.out.println("Ingresa la hora(Ejemplo: 14:00)");
    String hora =in.nextLine();

    Funcion[] nuevo = c.peliculasSobrantes(hora);
    for(int i = 0; i<nuevo.length; i++){
      System.out.println(nuevo[i]);
    }
    break;
    //Aqui podemos concluir el ciclo cambiando el valor de condicion por 0
      }
      System.out.println("¿Deseas realizar otra operacion?(Ingresa el número:si=1/no=0)");
      condicion = in2.nextInt();

    }
  }
}
