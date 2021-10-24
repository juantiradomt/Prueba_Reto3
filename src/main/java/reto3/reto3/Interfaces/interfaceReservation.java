package reto3.reto3.Interfaces;

import org.springframework.data.repository.CrudRepository;
import reto3.reto3.Modelo.Reservation;


public interface interfaceReservation extends CrudRepository <Reservation,Integer> {
    
}