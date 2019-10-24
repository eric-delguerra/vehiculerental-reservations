package com.vehiculerental.reservations;

import com.vehiculerental.reservations.DAO.ReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationController {

    @Autowired
    private ReservationDao reservationDao;

    @GetMapping(value = "/reservations")
    public Iterable<Reservation> listReservations(){
        return reservationDao.findAll();
    }

    @GetMapping(value = "/reservation/{id}")
    public Reservation findReservation(@PathVariable("id") int id){
        return reservationDao.findById(id);
    }

    @PostMapping(value = "/reservation")
    public void addReservation(@RequestBody Reservation reservation){
        reservationDao.save(reservation);
    }

    @DeleteMapping(value = "/reservation/{id}")
    public void deleteReservation(@PathVariable("id") int id){
        Reservation reservation = reservationDao.findById(id);
        reservationDao.delete(reservation);
    }

    @PutMapping(value = "reservation")
    public void modifyReservation(@RequestBody Reservation reservation){
        reservationDao.save(reservation);
    }
}
