package estudo.spring.jwt.controllers;

import estudo.spring.jwt.entitiy.Disciplina;
import estudo.spring.jwt.services.DisciplinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
