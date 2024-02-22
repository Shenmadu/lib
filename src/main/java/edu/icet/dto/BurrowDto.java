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
    private String burrowerFirstName;
    private String burrowerLastName;
    private String address1;
    private String address2;
    private String contactNumber;
    private String email;
    private String country;
}
