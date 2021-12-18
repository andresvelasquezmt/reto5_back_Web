/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5_Web.interfaces;

import Reto5_Web.modelo.Gadget;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author andre
 */
public interface GadgetInterface extends MongoRepository<Gadget, Integer> {
    
    List<Gadget> findByPriceLessThanEqual(double price);
    List<Gadget> findByDescriptionLike(String description);
    
}
