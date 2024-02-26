package edu.icet.controller;

import edu.icet.dto.BurrowerDto;
import edu.icet.dto.Response;
import edu.icet.entity.Burrower;
import edu.icet.service.BurrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/burrow")
@RequiredArgsConstructor
public class BurrowController {
    final BurrowService service;

    @PostMapping("/add")
    public void addBurrower(@RequestBody BurrowerDto burrowerDto){
        service.addBurrower(burrowerDto);
    }

    @GetMapping("/get")
    public List <Burrower>getAll(){
       return service.getBurrowers();
    }
    @DeleteMapping("/{id}")
    public Response deleteBurrower(@PathVariable Long id){
         return service.deleteBurrower(id)?
                 new Response("Burrower Removed"):
                 new Response("Burrower not exist");
    }
    @GetMapping("/getburrower/{userName}")
    public BurrowerDto findByUserName(@PathVariable String userName){
        return service.findByUserName(userName);
    }
    @GetMapping("/is-exist/{userName}")
    public Boolean isExistsUserName(@PathVariable String userName){
        return service.isExistsUserName(userName);
    }
}
