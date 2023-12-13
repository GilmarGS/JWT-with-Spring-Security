package estudo.spring.jwt.services;

import estudo.spring.jwt.entities.Login;
import estudo.spring.jwt.repositories.LoginRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final LoginRepository<Login, Long> repository;

    public LoginService(LoginRepository<Login, Long> repository) {
        this.repository = repository;
    }

    public Login adicionaLogin(Login login){
        return repository.save(login);
    }
}
