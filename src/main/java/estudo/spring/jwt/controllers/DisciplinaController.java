package estudo.spring.jwt.controllers;

import estudo.spring.jwt.entitiy.Disciplina;
import estudo.spring.jwt.services.DisciplinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DisciplinaController {
    private final DisciplinaService service;

    public DisciplinaController(DisciplinaService service){
        this.service = service;
    }

    @PostMapping (value = "/disciplina")
    public ResponseEntity<Disciplina> adicionaDisciplina(@RequestBody Disciplina disciplina){
        return new ResponseEntity<Disciplina>(service.adicionaDisciplina(disciplina), HttpStatus.CREATED);
    }
    @GetMapping(value="/disciplinas")
    public ResponseEntity<List<Disciplina>> recuperaDisciplinas(){
        return new ResponseEntity<List<Disciplina>>(service.recuperaDisciplinas(), HttpStatus.OK);
    }
    @GetMapping(value="/disciplina/{id}")
    public ResponseEntity<Disciplina> recuperaDisciplina(@PathVariable Long id){
        Optional<Disciplina> disciplina = service.recuperaDisciplina(id);

        return disciplina.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).
                orElseGet(() -> new ResponseEntity<>(disciplina.get(), HttpStatus.NOT_FOUND));
    }
}
