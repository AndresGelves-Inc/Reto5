/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.modelos;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
//import org.springframework.data.annotation.Id;

/**
 *
 * @author malej
 */

@Table("pelicula")
public class Pelicula{
    
    @Id
    @GeneratedValue
    private int id_pelicula;
    @Column("titulo")
    private String titulo;
    @Column("resumen")
    private String resumen;
    @Column("anio")
    private String anio;
    @Column("director")
    private String director;

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }    

    @Override
    public String toString() {
        return "Pelicula: " + "id_pelicula: " + id_pelicula + "Título: " + titulo + ", resumen: " + resumen + ", anio: " + anio + ", director: " + director ;
    }
    
    
    
}
