package com.spike.cinema.controller;

import com.spike.cinema.cinema.ReservationRepo;
import com.spike.cinema.model.Cinema;
import com.spike.cinema.model.Reservation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    private final ReservationRepo repo;

    ReservationController(ReservationRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Reservation> get() {
        return repo.findAll();
    }

    @PostMapping
    public Reservation post(Reservation item) {
        return repo.save(item);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(Reservation item) {
        var present = repo.findById(item.getId()).isPresent();
        if (present) {
            repo.delete(item);
            return new ResponseEntity<>(String.format("Deleted item with id: ${%d}", item.getId()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(String.format("No item found with id : ${%d}", item.getId()),
                    HttpStatus.NOT_FOUND);
        }
    }
}
