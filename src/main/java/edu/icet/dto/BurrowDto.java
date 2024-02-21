package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BurrowDto {
    private Long burrowId;
    private String burrowName;
    private String address;
    private String contactNumber;
    private String nic;
    private LocalDate date;
}
