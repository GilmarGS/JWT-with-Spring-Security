package estudo.spring.jwt.service;

import estudo.spring.jwt.entitiy.Disciplina;
import estudo.spring.jwt.repository.DisciplinaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    private DisciplinaRepository<Disciplina, Long> repository;

    public DisciplinaService(DisciplinaRepository<Disciplina, Long> repository){
        this.repository = repository;
    }

    public Disciplina adicionaDisciplina(Disciplina disciplina){
        return repository.save(disciplina);
    }
}
