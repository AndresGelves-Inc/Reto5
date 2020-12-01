/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.repositorios;


import co.edu.unal.Reto5.modelos.Usuario;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author malej
 */
public interface RepositorioUsuario extends CrudRepository<Usuario, String> {
    
//    @Query("SELECT * FROM Serie WHERE user_name= ?1")
    Usuario findByUserName (String userName); 
    
}
