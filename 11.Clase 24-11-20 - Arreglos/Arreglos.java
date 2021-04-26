public class Arreglos{
  public static void main(String [] pps){

    int[] enteros = new int[10]; //creamos un arreglo llamado enteros de tam 10
    //viene con un valor por default cada posicion

    int val = 23; //variable llamada val con valor 23

    //Recuerda las posiciones van de 0 a la longitud-1
    enteros[3]=val-1; //asignamos valor a la posición 3 del arreglo

    int pos4 = enteros[3]; //guardamos en otra var el valor de la pos 3 del arreglo

    System.out.println("val: "+val);
    System.out.println("enteros[3]: "+enteros[3]);
    enteros[3]--; //modificamos el valor que almacena la pos 3
    System.out.println("enteros[3]: "+enteros[3]);
    System.out.println("val: "+val);
    System.out.println("pos4: " + pos4);
    System.out.println("val y pos4 son independiente de enteros[3]"+
                        "es decir podemos seguir modificando a enteros[3]"+
                        "pero val y pos4 ya están asignadas");

    //Si solicitamos una posicion fuera del rango, manda error
    //int pos = enteros[10]; //no existe la pos 10, llega hasta 9
    //System.out.println(pos);

    System.out.println("----------------------------------------------------------" );
      System.out.println("Arreglo enteros" );
    //Iteramos el arreglo enteros
    for(int i = 0; i<enteros.length; i++){
      //enteros[i]= i; //asignamos un valor a las posiciones
      System.out.println("enteros["+i+"]:"+enteros[i]);
    }

    int[] enteros2 = new int[15]; //creamos otro arreglo llamado enteros2 de tam 15
      System.out.println("----------------------------------------------------------" );
        System.out.println("Arreglo enteros2" );
                      //enteros2.length=15
    for(int i = 0; i <enteros2.length; i++){ //queremos copiar los valores de enteros a enteros 2
      if(i<enteros.length){ //aseguramos que no pidamos una posicion inexistente a enteros
      enteros2[i]= enteros[i]; //
        System.out.println("enteros2["+i+"]:"+enteros2[i]);
      }else{ //j es mayor o igual a enteros.length
      enteros2[i]=i;
      System.out.println("enteros2["+i+"]:"+enteros2[i]);
    }

    /**Recuerda, la variable que declares dentro del for , su alcance será
    *unicamente dentro de este, si la declaras antes del for su alcance es mayor.
    */

    }

  enteros2[7]= 20; //sobreescribimos el valor
  System.out.println("enteros2["+7+"]:"+enteros2[7]);
  int var1 = enteros2[7]; // se le asigna el valor de enteros2[7] a var1
  System.out.println("var1 :"+var1);


    }
  }
