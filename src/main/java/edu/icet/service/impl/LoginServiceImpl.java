package edu.icet.service.impl;

import edu.icet.dto.LoginDto;
import edu.icet.entity.Login;
import edu.icet.repository.LoginRepository;
import edu.icet.service.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class LoginServiceImpl implements LoginService {
    final LoginRepository repository;
    final ModelMapper mapper;
    @Override
    public void insertLoginData(LoginDto loginDto) {
        repository.save(mapper.map(loginDto, Login.class));
    }

    @Override
    public Boolean validLogin(LoginDto loginDto) {
        log.info(loginDto.toString());
        return repository.existsByEmailAndPassword(loginDto.getEmail(),loginDto.getPassword());
    }
}
