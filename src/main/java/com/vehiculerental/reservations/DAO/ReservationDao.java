package com.vehiculerental.reservations.DAO;

import com.vehiculerental.reservations.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationDao extends JpaRepository<Reservation, Integer> {
    Reservation findById(int id);
    List <Reservation> findAllByDateOfBeginningBeforeAndDateOfEndAfter(Date end, Date start);
}
