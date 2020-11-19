package com.spike.cinema;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.spike.cinema.cinema.Cinema;
import com.spike.cinema.cinema.CinemaRepo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@DisplayName("Furrry")
public class CinemaResourceTests {

    @Autowired
    private CinemaRepo repo;

    @Test
    public void save_entity_in_repo() {
        var cinema = createEntity();

        var saved = repo.save(cinema);

        assertNotNull(cinema);
        assertNotNull(saved);
        assertEquals(cinema, saved);

        assertEquals(repo.count(), 1);
    }

    private Cinema createEntity() {
        return Cinema.builder().address("via dai dai").name("cinema 1").build();
    }
}
