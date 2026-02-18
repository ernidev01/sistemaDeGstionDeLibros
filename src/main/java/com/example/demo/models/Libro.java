package com.example.demo.models;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "libros")
@ToString
@EqualsAndHashCode
public class Libro {

    @Getter @Setter @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Getter @Setter
    @Column(name = "titulo")
    private String titulo;

    @Getter @Setter
    @Column(name = "autor")
    private String autor;

    @Getter @Setter
    @Column(name = "precio")
    private Float precio;

    @Getter @Setter
    @Column(name = "anio")
    private LocalDate anio;

    @Getter @Setter
    @Column(name = "editorial")
    private String editorial;
}
