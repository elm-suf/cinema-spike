package com.spike.cinema.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Seat {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NonNull
    private Integer row;
    @NonNull
    private Integer number;
}
