package com.spike.cinema.cinema;

import com.spike.cinema.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
