package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryDemo implements LibroRepository {

    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryDemo() {
        libros.add(new Libro(1, "Cien años de soledad", "Gabriel García Márquez", "Sudamericana", 1967));
        libros.add(new Libro(2, "1984", "George Orwell", "Hermida Editores", 1949));
        libros.add(new Libro(3, "Don Quijote de la Mancha", "Miguel de Cervantes", "Independently published", 1605));
        libros.add(new Libro(4, "Matar a un ruiseñor", "Harper Lee", "Harper Collins Español", 1960));
        libros.add(new Libro(5, "El gran Gatsby", "F. Scott Fitzgerald", "Anagrama", 1925));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectando a base de datos ORACLE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectando a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
