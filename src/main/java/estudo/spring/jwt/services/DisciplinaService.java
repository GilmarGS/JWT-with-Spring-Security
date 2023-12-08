package estudo.spring.jwt.services;

import estudo.spring.jwt.entitiy.Disciplina;
import estudo.spring.jwt.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    private final DisciplinaRepository<Disciplina, Long> repository;

    public DisciplinaService(DisciplinaRepository<Disciplina, Long> repository){
        this.repository = repository;
    }

    public Disciplina adicionaDisciplina(Disciplina disciplina){
        return repository.save(disciplina);
    }

    public List<Disciplina> recuperaDisciplinas() {
        return repository.findAll();
    }
}
