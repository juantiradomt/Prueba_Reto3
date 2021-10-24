package reto3.reto3.Operaciones;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reto3.reto3.Interfaces.interfaceCategory;
import reto3.reto3.Modelo.Category;

@Repository
public class CategoryOperation {

    @Autowired
    private interfaceCategory crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    public Optional<Category> getCategoria(int id){
        return crud.findById(id);
    }

    public Category save(Category Categoria){
        return crud.save(Categoria);
    }
    public void delete(Category Categoria){
       crud.delete(Categoria);
    }
    
}
