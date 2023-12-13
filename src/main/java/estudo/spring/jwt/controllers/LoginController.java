package estudo.spring.jwt.controllers;

import estudo.spring.jwt.entities.Login;
import estudo.spring.jwt.services.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PutMapping("/login")
    public ResponseEntity<Login> adicionaLogin(@RequestBody Login login){
        return new ResponseEntity<>(service.adicionaLogin(login), HttpStatus.CREATED);
    }
}
