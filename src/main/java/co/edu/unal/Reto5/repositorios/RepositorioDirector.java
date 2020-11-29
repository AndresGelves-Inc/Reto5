/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.Reto5.repositorios;

import co.edu.unal.Reto5.modelos.Director;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author malej
 */
public interface RepositorioDirector extends CrudRepository<Director, Integer> {
    
}
