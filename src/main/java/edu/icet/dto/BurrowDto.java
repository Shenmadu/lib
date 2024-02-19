package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BurrowDto {
    private Long burrowId;
    private String burrowName;
    private String isbn;
    private String date;
}
