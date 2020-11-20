package com.spike.cinema.controller;

import com.spike.cinema.cinema.HallRepo;
import com.spike.cinema.model.Cinema;
import com.spike.cinema.model.Hall;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hall")
public class HallController {
    private final HallRepo repo;

    HallController(HallRepo repo) {this.repo = repo;}

    @GetMapping
    public List<Hall> get() {
        return repo.findAll();
    }

    @PostMapping
    public Hall post(Hall item) {
        return repo.save(item);
    }
}
