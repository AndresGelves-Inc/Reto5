/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.modelos;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author malej
 */
@Table("director")
public class Director {
    
    @Id
    private int id_director;
    @Column("nombre_director")
    private String nombre_director;
    @Column("apellidos_director")
    private String apellidos_director;
    @Column("nacionalidad")
    private String nacionalidad;

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id_director) {
        this.id_director = id_director;
    }

    public String getNombre_director() {
        return nombre_director;
    }

    public void setNombre_director(String nombre_director) {
        this.nombre_director = nombre_director;
    }

    public String getApellido_director() {
        return apellidos_director;
    }

    public void setApellido_director(String apellido_director) {
        this.apellidos_director = apellido_director;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Director id_director: " + id_director + ", nombre_director: " + nombre_director + ", apellido_director: " + apellidos_director + ", nacionalidad: " + nacionalidad ;
    }
    
    
}
