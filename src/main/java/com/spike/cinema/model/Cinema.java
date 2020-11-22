package com.spike.cinema.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.net.Proxy;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String address;

    @JsonManagedReference
    @OneToMany(mappedBy = "cinema")
    private List<Hall> halls;
}
