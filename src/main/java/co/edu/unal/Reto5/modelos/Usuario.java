/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.modelos;



import java.io.Serializable;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author malej
 */

@Table("usuario")
public class Usuario implements Serializable {
    

    
    @Id
    @GeneratedValue
    private int user_id;
    @Column("user_name")
    private String userName;
    //private int idusuario;
    @Column("nombre_user")
    private String nombre_user;
    @Column("apellido_user")
    private String apellido_user;
    @Column("email")
    private String email;
    @Column("celular")
    private long celular;
    @Column("contrasenia")
    private String contrasenia;
    @Column("fecha_nacimiento")
    private String fecha_nacimiento;
    //private int registro_transm_idregistro_transm;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String user_name) {
        this.userName = user_name;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellido_user() {
        return apellido_user;
    }

    public void setApellido_user(String apellido_user) {
        this.apellido_user = apellido_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Usuario: " + userName + ", nombre usuario: " + nombre_user + ", apellido usuario: " + apellido_user + ", email: " + email + ", celular: " + celular + ", contraseña: " + contrasenia + ", fecha_nacimiento: " + fecha_nacimiento;
    }
    
    
}
