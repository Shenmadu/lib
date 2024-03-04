package edu.icet.service.impl;

import edu.icet.dto.LoginDto;
import edu.icet.entity.Login;
import edu.icet.repository.LoginRepository;
import edu.icet.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    final LoginRepository repository;
    final ModelMapper mapper;
    @Override
    public void insertLoginData(LoginDto loginDto) {
        repository.save(mapper.map(loginDto, Login.class));
    }
}
