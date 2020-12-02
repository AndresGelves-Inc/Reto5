/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.modelos;


import java.beans.Statement;
import java.sql.ResultSet;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("serie")
public class Serie {
    

    
    @Id
    @GeneratedValue
    private int id_serie;
    @Column("titulo")
    private String titulo;
    @Column("temporadas")
    private Long temporadas;
    @Column("episodios")
    private Long episodios;

    public int getId() {
        return id_serie;
    }

    public void setId(int id) {
        this.id_serie = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Long temporadas) {
        this.temporadas = temporadas;
    }

    public Long getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Long episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Serie: " + "id_pelicula: " + id_serie + ", Título: " + titulo + ", temporadas: " + temporadas + ", episodios: " + episodios;
    }
    
    
}
