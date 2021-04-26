public class Examen{
  String[] nombres;
  String[] examenA;
  String[] examenB;

  /**
  * Constructor tal que el tamaño de examenA y B debe ser exacto o a lo más con
  * un espacio de sobra.
  */
  public Examen(String[] nombres){
    this.nombres = nombres;
    examenA = new String[(int)Math.ceil((double)this.nombres.length/2)];
    examenB = new String[(int)Math.ceil((double)this.nombres.length/2)];
  }

  /**
  *Metodo que llena el arreglo examenA con las posiciones pares del arreglo
  *nombres y llena el arreglo examenB con las posiciones impares.
  */

  //15= nombres.length
  //8 = examenA.length
  //8 = examenB.length
  public void dividirGrupo(){
    int pos = 0;

    for(int i = 0; i<nombres.length; i++){
      if(i%2==0){
        System.out.println("Entre al if");
        examenA[pos]=nombres[i];
      }else{
        pos++;
        System.out.println("Entre al else");
        examenB[pos]=nombres[i];
        //pos++;
      }
    }
  }



  /**
  * Metodo que imprime en reversa al arreglo nombres
  */
  public void reversa(){
    for(int i = nombres.length-1; i>=0 ; i--){
      System.out.print(nombres[i]+ ", ");
    }
  }

  /**
  * Metodo que imprime el arreglo examenA
  */
  public void imprimirListaA(){
    for(int i = 0; i<examenA.length; i++){
      System.out.print(examenA[i]+ ", ");
    }
  }

  /**
  * Metodo que imprime el arreglo examenB
  */
    public void imprimirListaB(){
      for(int i = 0; i<examenB.length; i++){
        System.out.print(examenB[i]+ ", ");
      }
    }
}
