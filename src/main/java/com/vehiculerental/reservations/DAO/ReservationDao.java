package com.vehiculerental.reservations.DAO;

import com.vehiculerental.reservations.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDao extends JpaRepository<Reservation, Integer> {
    Reservation findById(int id);
}
