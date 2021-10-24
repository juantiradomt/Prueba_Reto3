package reto3.reto3.Operaciones;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reto3.reto3.Interfaces.interfaceClient;
import reto3.reto3.Modelo.Client;


@Repository
public class ClientOperation {

    @Autowired
    private interfaceClient crud1;

    public List<Client> getAll(){
        return (List<Client>) crud1.findAll();
    }
    public Optional<Client> getCliente(int id){
        return crud1.findById(id);
    }

    public Client save(Client cliente){
        return crud1.save(cliente);
    }
    public void delete(Client cliente){
        crud1.delete(cliente);
    }
    
}
