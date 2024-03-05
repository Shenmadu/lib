package edu.icet.controller;

import edu.icet.dto.LoginDto;
import edu.icet.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {
    final LoginService service;

    @PostMapping("/request-login")
    public Boolean validLogin(@RequestBody LoginDto loginDto){
        return service.validLogin(loginDto);

    }
}
