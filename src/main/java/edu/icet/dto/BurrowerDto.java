package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor
@NoArgsConstructor
public class BurrowerDto {
    private Long burrowId;
    private String burrowerFirstName;
    private String burrowerLastName;
    private String userName;
    private String address1;
    private String address2;
    private String contactNumber;
    private String email;
    private String country;
}
