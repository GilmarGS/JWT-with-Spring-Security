package estudo.spring.jwt.repository;

import estudo.spring.jwt.entitiy.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface DisciplinaRepository<T, ID extends Serializable> extends JpaRepository<Disciplina, Long> {

}
