/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.modelos;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
//import org.springframework.data.annotation.Id;

/**
 *
 * @author malej
 */
//@Entity
@Table("pelicula")
public class Pelicula {
    
    @Id
    private int id_pelicula;
    @Column("titulo")
    private String titulo;
    @Column("resumen")
    private String resumen;
    @Column("anio")
    private int anio;
    @Column("id_director")
    private int id_director;

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id_director) {
        this.id_director = id_director;
    }



    @Override
    public String toString() {
        return "Pelicula: " + "id_pelicula: " + id_pelicula + "Título: " + titulo + ", resumen: " + resumen + ", anio: " + anio + ", director: " + id_director ;
    }
    
    
    
}
