package reto3.reto3.Operaciones;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reto3.reto3.Interfaces.interfaceMesage;
import reto3.reto3.Modelo.Mesage;

@Repository
public class MesageOperation {

    @Autowired
    private interfaceMesage crud3;
    
    public List<Mesage> getAll(){
        return (List<Mesage>) crud3.findAll();
    }
    public Optional<Mesage> getMessage(int id){
        return crud3.findById(id);
    }

    public Mesage save(Mesage message){
        return crud3.save(message);
    }
    public void delete(Mesage message){
        crud3.delete(message);
    }
    
}
