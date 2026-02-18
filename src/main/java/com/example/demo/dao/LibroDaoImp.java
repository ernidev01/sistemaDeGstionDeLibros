package com.example.demo.dao;

import com.example.demo.models.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional

public class LibroDaoImp implements LibroDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Libro> getLibros() {
        String query = "FROM Libro";
        return entityManager.createQuery(query).getResultList();
    }
}
