package com.spike.cinema.cinema;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cinema")
public class CinemaController {

    private final CinemaRepo repo;

    CinemaController(CinemaRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Cinema> get() {
        return repo.findAll();
    }

    // @GetMapping("/{id}")
    // public Cinema getById(@Param("id")) {
    // return repo.findAll();
    // }

    @PostMapping
    public Cinema post(Cinema item) {
        return repo.save(item);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(Cinema item) {
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
