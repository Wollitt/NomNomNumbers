package com.Wollit.NomNomNumbers.controller;

import com.Wollit.NomNomNumbers.dto.LoginDto;
import com.Wollit.NomNomNumbers.dto.SignupDto;
import com.Wollit.NomNomNumbers.service.AuthServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
@RequestMapping("api/auth")
public class AuthController {

    private AuthServiceImpl authService;

    @PostMapping("/signin")
    @Transactional
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginDto dto) {
        return authService.authenticateUser(dto);
    }

    @PostMapping("/signup")
    @Transactional
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupDto dto) {
        return authService.registerUser(dto);
    }

    @PostMapping("/signout")
    @Transactional
    public ResponseEntity<?> logoutUser() {
        return authService.logoutUser();
    }

}
