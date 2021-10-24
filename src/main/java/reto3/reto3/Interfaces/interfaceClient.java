package reto3.reto3.Interfaces;

import org.springframework.data.repository.CrudRepository;
import reto3.reto3.Modelo.Client;


public interface interfaceClient extends CrudRepository <Client,Integer> {
    
}