/**
 * Subclase de la clase articulo que define un objeto libro
 * @author Francisco Manuel Monreal Gamboa
 * @version 1
 */
public class Libro extends Articulo{
String editorial;
	
	/** 
	 * Constructor a partir de la informacion de un libro
     */
	public Libro(String titulo,String autor,int anio,String edito){ 
	super(titulo,autor,anio);
	editorial=edito;
	}
	
	/**
	  * Metodo para asignar editorial al libro
	  * @param edi. editorial del libro
	  */
	public void asignarEditoral(String edi){
	editorial=edi;
	}
	
	/**
	*Metodo para obtener la editorial del libro
	* @return Editorial del libro 
	*/
	public String obtenerEditoral(){
	return editorial;
	}
	/**
	Metodo para obtener la representacion en cadena de un libro
	*/
	public String toString(){
	String a="El titulo del libro es: " + obtenerTitulo(); 
	String b="El autor del libro es: " + obtenerAutor(); 
	String c="La editorial del libro es: " + obtenerEditoral(); 
	String d="El año de publicacion del libro es: " + obtenerAnio(); 
	return a +"\n" +b +"\n" +c +"\n"+ d;
	}
}
