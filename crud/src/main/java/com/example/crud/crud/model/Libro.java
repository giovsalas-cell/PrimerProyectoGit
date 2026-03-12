package com.example.crud.crud.model;

import jakarta.persistence.*; // Importante para @Entity e @Id
import lombok.Data; // Importante para @Data

@Entity
@Data
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
}