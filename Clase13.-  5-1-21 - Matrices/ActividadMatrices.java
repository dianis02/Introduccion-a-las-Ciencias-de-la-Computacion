/**
* Clase con preguntas sobre matrices
* @author Diana Isabel Ramírez García
* @version
*/
public class ActividadMatrices{
  public static void main(String [] pps) {
    //¿Qué regresa cada código?
    //Recuerda la solución con explicación se encuentra en las diapositivas
    //de la clase  05/01/21.
    //Actividad 1
    int valor = 0;
    int[][] matriz = new int[3][4];
    System.out.println("Respuesta 1:");
    for (int i = 0;i<matriz.length;i++) { // num de filas en la matriz = 3
      for(int j = 0; j<matriz[i].length;j++){ // es num de columnas en la fila i = 4
        matriz[i][j] = i;
      }
    }
    // ij
    // 00 01 02 03
    // 0   0 0  0
    // 10  11 12 13
    // 1  1   1   1
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        valor +=matriz[i][j];
      }
      System.out.print(valor+",");
    }
    System.out.println("");


    //Actividad 2
    valor = 0;
    System.out.println("Respuesta 2:");
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        matriz[i][j] = i;
      }
    }
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        valor +=matriz[i][j];
      }
      System.out.print(valor+",");
      valor = 0;
    }
    System.out.println("");

    //Actividad 3
    valor = 0;
    System.out.println("Respuesta 3:");
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        matriz[i][j] = i;
      }
    }
    for (int i = 0;i<matriz.length;i++) {
      System.out.print(valor+",");
      for(int j = 0; j<matriz[i].length;j++){
        valor +=matriz[i][j];
      }
    }
    System.out.println("");


    //Actividad 4
    valor = 0;
    System.out.println("Respuesta 4:");
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        matriz[i][j] = i;
        System.out.print(matriz[i][j]+",");
      }
    }
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        valor +=matriz[i][j];
      }
    }
    System.out.println("");

    //Actividad 5
    valor = 0;
    System.out.println("Respuesta 5:");
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        matriz[i][j] = j;
        System.out.print(matriz[i][j]+",");
      }
    }
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        valor +=matriz[i][j];
      }
    }
    System.out.println("");

    //Actividad 6
    valor = 0;
    System.out.println("Respuesta 6:");
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        matriz[i][j] = i+1;
      }
    }
    for (int i = 0;i<matriz.length;i++) {
      for(int j = 0; j<matriz[i].length;j++){
        valor +=matriz[i][j];
      }
      System.out.print(valor+",");
    }

    System.out.println("");
    System.out.println("Ejemplo matriz de objetos: ");

    Perros[][] perritos = new Perros[3][3];
    for(int i = 0; i<perritos.length; i++){
      //fila 0
      // fila 1
      // fila 2
      for(int j = 0; j<perritos[i].length; j++){
        //columna 0 , 1 , 2
        if(j == 0){
          perritos[i][j]= new Perros("Bruno");
        }else if(j== 1){
          perritos[i][j]= new Perros("Camila");
        }else{
          perritos[i][j]= new Perros("Mini");
        }
        System.out.print(perritos[i][j].nombre+" ");
      }
      System.out.println("");
    }


  }

}
