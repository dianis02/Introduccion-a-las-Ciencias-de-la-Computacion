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
    Funcion f1 = new Funcion("12:00:00","Hereditary");
    Funcion f2 = new Funcion("14:00:00","Alien");
    Funcion f3 = new Funcion("16:00:00","It Follows");
    Funcion f4 = new Funcion("18:00:00","A Quiet Place");
    Funcion f5 = new Funcion("20:00:00","Jaws");
    Funcion f6 = new Funcion("12:00:00","Todas");
    Funcion[] funciones = {f1,f2,f3,f4,f5};

    int condicion =1;
    while(condicion == 1){
    System.out.println("Bienvenido al Maratón de Terror");
    System.out.println("------------------------------------");
    System.out.println("Las funciones que se muestran son: "+"\n");
    System.out.println("1)"+f1);
    System.out.println("2)"+f2);
    System.out.println("3)"+f3);
    System.out.println("4)"+f4);
    System.out.println("5)"+f5);
    System.out.println("------------------------------------"+"\n");

    System.out.println("¿Qué tipo de boleto deseas comprar?(individual/general)");
    String tipo =in.nextLine();
    Boleto boleto;
    //Boleto general
    if(tipo.equals("general")){
      boleto = f6.comprarBoleto(tipo);
      for(int i =0; i<funciones.length; i++){
        //usamos un arreglo de Funciones
        funciones[i].disminuirLugares();
      }
      //Es equivalente al codigo comentado abajo
      /**f1.disminuirLugares();
      f2.disminuirLugares();
      f3.disminuirLugares();
      f4.disminuirLugares();
      f5.disminuirLugares();*/
      System.out.println(boleto);
      //Boleto individual
    }else if(tipo.equals("individual")){
      System.out.println("¿Para qué función?(Ingresa el número)"+"\n"+" Recuerda que son:");
      System.out.println("------------------------------------"+"\n");
      System.out.println("1)"+f1);
      System.out.println("2)"+f2);
      System.out.println("3)"+f3);
      System.out.println("4)"+f4);
      System.out.println("5)"+f5);
      System.out.println("------------------------------------"+"\n");

      //Elegimos funcion, podemos cambiar los ifs por un switch
      int op = in2.nextInt();
      if(op==1){
        boleto = f1.comprarBoleto(tipo);
        System.out.println(boleto);
      }else if(op == 2){
        boleto = f2.comprarBoleto(tipo);
        System.out.println(boleto);
      }else if(op==3){
        boleto = f3.comprarBoleto(tipo);
      }else if(op==4){
        boleto = f4.comprarBoleto(tipo);
        System.out.println(boleto);
      }else if(op==5){
        boleto = f5.comprarBoleto(tipo);
        System.out.println(boleto);
      }else{
        System.out.println("No es opción válida");

      }
      //No se ingreso ni general ni individual
    }else{
      System.out.println("No es un tipo válido");
    }

    //Se muestra las cantidades recaudadas
    System.out.println("------------------------------------"+"\n");
    System.out.println("Dinero recaudado y disponibilidad: ");
    System.out.println(f1.obtenerPelicula()+": $"+f1.obtenerRecaudado()+" disponibilidad : "+f1.obtenerDisponibilidad());
    System.out.println(f2.obtenerPelicula()+": $"+f2.obtenerRecaudado()+" disponibilidad : "+f2.obtenerDisponibilidad());
    System.out.println(f3.obtenerPelicula()+": $"+f3.obtenerRecaudado()+" disponibilidad : "+f3.obtenerDisponibilidad());
    System.out.println(f4.obtenerPelicula()+": $"+f4.obtenerRecaudado()+" disponibilidad : "+f4.obtenerDisponibilidad());
    System.out.println(f5.obtenerPelicula()+": $"+f5.obtenerRecaudado()+" disponibilidad : "+f5.obtenerDisponibilidad());
    System.out.println("Boletos generales"+": $"+f4.obtenertotalGenerales()); //cualquier funcion podria llamar al metodo
    System.out.println(f6.obtenerPelicula()+": $"+f1.obtenerTotalRecaudado());// y nos daría el mismo valor por ser static
    System.out.println("------------------------------------"+"\n");

    //Aqui podemos concluir el ciclo cambiando el valor de condicion por 0
    System.out.println("¿Deseas comprar otro boleto?(Ingresa el número:si=1/no=0)");
    condicion = in2.nextInt();

    }
  }
}
