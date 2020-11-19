package com.spike.cinema.cinema;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    CinemaRepo repo;

    @GetMapping
    public List<Cinema> getAll() {
        return repo.findAll();
    }
}
