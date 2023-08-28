package com.Wollit.NomNomNumbers.service;

import com.Wollit.NomNomNumbers.dto.LoginDto;
import com.Wollit.NomNomNumbers.dto.SignupDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<?> authenticateUser(LoginDto dto);

    ResponseEntity<?> registerUser(SignupDto dto);

    ResponseEntity<?> logoutUser();
}
