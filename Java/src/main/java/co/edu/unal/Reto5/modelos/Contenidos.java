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

@Table("contenidos")
public class Contenidos {
    
    @Id
    private int contenido_id_;
    @Column("titulos")
    private String titulos;

    public int getContenido_id_() {
        return contenido_id_;
    }

    public void setContenido_id_(int contenido_id_) {
        this.contenido_id_ = contenido_id_;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }



    
    @Override
    public String toString(){
        String contenidos = "Contenidos: " + '\n' + "id: " + contenido_id_ +"Título: " + titulos ;
        return contenidos;
    }
    
}
