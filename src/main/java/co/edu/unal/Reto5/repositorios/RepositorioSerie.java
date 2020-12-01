/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.repositorios;


import co.edu.unal.Reto5.modelos.Serie;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author malej
 */
@Repository
public interface RepositorioSerie extends CrudRepository<Serie, Integer> {
    
//    @Query("SELECT * FROM Serie WHERE titulo= :titulo")
    Serie findByTitulo (String titulo); 
    
}
    