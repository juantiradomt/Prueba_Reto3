package reto3.reto3.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reto3.reto3.Modelo.Mesage;
import reto3.reto3.Operaciones.MesageOperation;

@Service
public class MesageService {

    @Autowired
    private MesageOperation metodosCrud;

    public List<Mesage> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Mesage> getMessage(int messageId) {
        return metodosCrud.getMessage(messageId);
    }

    public Mesage save(Mesage message){
        if(message.getIdMessage()==null){
            return metodosCrud.save(message);
        }else{
            Optional<Mesage> e= metodosCrud.getMessage(message.getIdMessage());
            if(e.isEmpty()){
                return metodosCrud.save(message);
            }else{
                return message;
            }
        }
    }

    public Mesage update(Mesage message){
        if(message.getIdMessage()!=null){
            Optional<Mesage> e= metodosCrud.getMessage(message.getIdMessage());
            if(!e.isEmpty()){
                if(message.getMessageText()!=null){
                    e.get().setMessageText(message.getMessageText());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return message;
            }
        }else{
            return message;
        }
    }

    public boolean deleteMessage(int messageId) {
        Boolean aBoolean = getMessage(messageId).map(message -> {
            metodosCrud.delete(message);
            return true;
        }).orElse(false);
        return aBoolean;
    }

    
}
