package com.example.demo.controllers;

import com.example.demo.dao.LibroDao;
import com.example.demo.models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibroController {

    @Autowired
    private LibroDao libroDao;

    @RequestMapping(value = "libro/{id}")
    public Libro getLibro(@PathVariable int id){
        Libro libro = new Libro();
        libro.setTitulo("Hola mundo");
        libro.setAutor("Erick Nicolas ");
        libro.setEditorial("Norma");
        libro.setPrecio(10f);
        //libro.setAnio(2025);
        return libro;
    }

    @RequestMapping(value = "libros")
    public List<Libro> getLibros(){
        return libroDao.getLibros();
    }

    @RequestMapping(value = "libro")
    public List<Libro> getLibro(){

        List<Libro> libros= new ArrayList<>();

        Libro libro = new Libro();
        libro.setId(132);
        libro.setTitulo("Hola mundo");
        libro.setAutor("Erick Nicolas ");
        libro.setEditorial("Norma");
        libro.setPrecio(10f);
        //libro.setAnio(2025);

        Libro libro2 = new Libro();
        libro2.setId(32);
        libro2.setTitulo("Hola mundo");
        libro2.setAutor("Erick Nicolas ");
        libro2.setEditorial("Norma");
        libro2.setPrecio(10f);
        //libro2.setAnio(2025);

        Libro libro3 = new Libro();
        libro3.setId(12);
        libro3.setTitulo("Hola mundo");
        libro3.setAutor("Erick Nicolas ");
        libro3.setEditorial("Norma");
        libro3.setPrecio(10f);
        //libro3.setAnio(2025);

        libros.add(libro);
        libros.add(libro2);
        libros.add(libro3   );

        return libros;
    }
    public String eliminarLibro(){
        return "prueba";
    }
    public String editarLibro(){
        return "prueba";
    }
    public String agregarLibro(){
        return "prueba";
    }

    @RequestMapping(value = "prueba")
    public String purba(){
        return "prueba";
    }
}
