package com.example.demo.models;

import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Enabled
public class Libro {
    @Getter @Setter //@Id
    private int id;
    @Getter @Setter
    private String titulo;
    @Getter @Setter
    private String autor;
    @Getter @Setter
    private Float precio;
    @Getter @Setter
    private int anio;
    @Getter @Setter
    private String editorial;
}
