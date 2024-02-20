package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Burrower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long burrowId;
    private String burrowName;
    private String isbn;
    private LocalDate date;
}
