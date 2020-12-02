/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.repositorios;


import co.edu.unal.Reto5.modelos.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author malej
 */
@Repository
public interface RepositorioPelicula extends CrudRepository<Pelicula, Integer> {
    
    //@Query("SELECT * FROM Pelicula WHERE titulo= ?1")
    Pelicula findByTitulo (String titulo); 
    
}
