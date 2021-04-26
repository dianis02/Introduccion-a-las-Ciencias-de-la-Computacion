/*
 * Decompiled with CFR 0_118.
 */
import java.io.Serializable;

public class Articulo implements Serializable{
    private String titulo;
    private String autor;
    private int anio;

    public Articulo(String string, String string2, int n) { 
        this.titulo = string;
        this.autor = string2;
        this.anio = n;
    }

    public int obtenerAnio() {
        return this.anio;
    }

    public String obtenerTitulo() {
        return this.titulo;
    }

    public String obtenerAutor() {
        return this.autor;
    }

    public void asignarAutor(String string) {
        this.autor = string;
    }

    public void asignarTitulo(String string) {
        this.titulo = string;
    }

    public void asignarAnio(int n) {
        this.anio = n;
    }

    public String toString() {
        return "Titulo" + this.titulo + "Anio:" + this.anio + "autor " + this.autor;
    }
}
