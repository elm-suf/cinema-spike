package com.spike.cinema.cinema;

import com.spike.cinema.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepo extends JpaRepository<Cinema, Long> {
}
