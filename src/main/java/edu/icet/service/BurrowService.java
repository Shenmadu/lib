package edu.icet.service;

import edu.icet.dto.BurrowDto;
import edu.icet.entity.Burrower;

import java.util.List;

public interface BurrowService {
    void addBurrower(BurrowDto burrowDto);
    List<Burrower> getBurrowers();
    boolean deleteBurrower(Long id);
}
