package edu.icet.controller;

import edu.icet.dto.BurrowDto;
import edu.icet.entity.Burrower;
import edu.icet.service.BurrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/burrow")
@RequiredArgsConstructor
public class burrowController {
    final BurrowService service;

    @PostMapping("/add")
    public void addBurrower(@RequestBody BurrowDto burrowDto){
        service.addBurrower(burrowDto);
    }

    @GetMapping("/get")
    public List <Burrower>getAll(){
       return service.getBurrowers();
    }
    @DeleteMapping("/{id}")
    public boolean deleteBurower(@PathVariable Long id){
        return service.deleteBurrower(id);
    }
}
