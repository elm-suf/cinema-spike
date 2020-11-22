package com.spike.cinema.cinema;

import com.spike.cinema.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepo extends JpaRepository<Hall, Long> {
}
