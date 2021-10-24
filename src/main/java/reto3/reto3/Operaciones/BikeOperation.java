package reto3.reto3.Operaciones;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reto3.reto3.Interfaces.interfaceBike;
import reto3.reto3.Modelo.Bike;

@Repository
public class BikeOperation {

    @Autowired
    private interfaceBike crud;

    public List<Bike> getAll(){
        return (List<Bike>) crud.findAll();
    }

    public Optional<Bike> getBike(int id){
        return crud.findById(id);
    }

    public Bike save(Bike bike){
        return crud.save(bike);
    }
    public void delete(Bike bike){
        crud.delete(bike);
    }
    
}
