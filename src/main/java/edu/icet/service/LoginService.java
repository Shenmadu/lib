package edu.icet.service;

import edu.icet.dto.LoginDto;

public interface LoginService {
    void insertLoginData(LoginDto loginDto);
    Boolean validLogin(LoginDto loginDto);
}
