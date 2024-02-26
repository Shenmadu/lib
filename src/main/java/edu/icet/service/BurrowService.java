package edu.icet.service;

import edu.icet.dto.BurrowerDto;
import edu.icet.entity.Burrower;

import java.util.List;

public interface BurrowService {
    void addBurrower(BurrowerDto burrowerDto);
    List<Burrower> getBurrowers();
    boolean deleteBurrower(Long id);

    BurrowerDto findByUserName(String userName);

    Boolean isExistsUserName(String userName);
}
