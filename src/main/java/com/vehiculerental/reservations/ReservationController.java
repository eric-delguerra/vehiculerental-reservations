package com.vehiculerental.reservations;

import com.vehiculerental.reservations.DAO.ReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    private ReservationDao reservationDao;

    @GetMapping(value = "/reservations")
    public Iterable<Reservation> listReservations() {
        return reservationDao.findAll();
    }

    @GetMapping(value = "/reservation/{id}")
    public Reservation findReservation(@PathVariable("id") int id) {
        return reservationDao.findById(id);
    }

    @PostMapping(value = "/reservation")
    public void addReservation(@RequestBody Reservation reservation) {
        reservationDao.save(reservation);
    }

    @DeleteMapping(value = "/reservation/{id}")
    public void deleteReservation(@PathVariable("id") int id) {
        Reservation reservation = reservationDao.findById(id);
        reservationDao.delete(reservation);
    }

    @PutMapping(value = "/reservation")
    public void modifyReservation(@RequestBody Reservation reservation) {
        reservationDao.save(reservation);
    }


    @GetMapping(value = "/datesOfReservation")
    public List<Reservation> getAllBetweenDates(@RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate, @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate) {
        return reservationDao.findAllByDateOfBeginningAfterAndDateOfEndBefore(startDate, endDate);

    }

    @GetMapping("/reservations/customer/{id}")
    public ResponseEntity<Iterable<Reservation>> getCustomerReservations(@PathVariable("id") int id) {
        Iterable<Reservation> reservations = reservationDao.findAllByCustomerId(id);

        return ResponseEntity.ok(reservations);
    }
}
