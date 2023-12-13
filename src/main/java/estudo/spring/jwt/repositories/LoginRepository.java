package estudo.spring.jwt.repositories;

import estudo.spring.jwt.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface LoginRepository<T, ID extends Serializable> extends JpaRepository<Login, Long> {

}
