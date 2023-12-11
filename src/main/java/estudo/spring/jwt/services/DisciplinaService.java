package estudo.spring.jwt.services;

import estudo.spring.jwt.entities.Disciplina;
import estudo.spring.jwt.repositories.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Disciplina> recuperaDisciplina(Long id){
        return repository.findById(id);
    }

    public Optional<Disciplina> deletaDisciplina(Long id) {
        Optional<Disciplina> disciplinaDeletada = repository.findById(id);
        repository.deleteById(id);

        return disciplinaDeletada;
    }
}
