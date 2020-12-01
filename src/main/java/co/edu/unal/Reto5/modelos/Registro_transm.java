/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.modelos;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("registro_transm")
public class Registro_transm {
   
    @Id
    private int idregistro_transm;
    @Column("user_name")
    private String user_name;
    @Column("id_contenido")
    private int id_contenido;
    @Column("date_time")
    private String date_time;

    public int getIdregistro_transm() {
        return idregistro_transm;
    }

    public void setIdregistro_transm(int idregistro_transm) {
        this.idregistro_transm = idregistro_transm;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getId_contenido() {
        return id_contenido;
    }

    public void setId_contenido(int id_contenido) {
        this.id_contenido = id_contenido;
    }



    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    @Override
    public String toString() {
        return "Registro_transm: " + "idregistro_transm: " + idregistro_transm + ", user_name: " + user_name + ", contenido: " + id_contenido + ", date_time: " + date_time;
    }
    
    
}
