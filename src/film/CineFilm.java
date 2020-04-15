/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

import java.util.ArrayList;

/**
 *
 * @author 57311
 */
public class CineFilm {
    
    private String nombre;
    private String director;
    private int year;
    private String resena;

    public CineFilm(String n, String d, int y, String r) {
        nombre = n;
        director = d;
        year = y;
        resena = r;
    }
@Override
    public String toString(){ 
        return ("Nombre de la película: "+nombre+" \nDirector: "+director+"\nAño: " +year+ "\nReseña: " + resena + "\n"); 
    } 

    public String getNombre() {
        return this.nombre;
    }

    public String getDirector() {
        return this.director;
    }

    public int getYear() {
        return this.year;
    } 
    
    public String getResena() {
        return this.resena;
    }

    public void mostrarDatos(String nombres){
        
    } 
}


