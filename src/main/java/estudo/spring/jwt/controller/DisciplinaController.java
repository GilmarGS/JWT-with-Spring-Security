package estudo.spring.jwt.controller;

import estudo.spring.jwt.entitiy.Disciplina;
import estudo.spring.jwt.service.DisciplinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisciplinaController {
    private DisciplinaService service;

    public DisciplinaController(DisciplinaService service){
        this.service = service;
    }

    @PostMapping (value = "/disciplina")
    public ResponseEntity<Disciplina> adicionaDisciplina(@RequestBody Disciplina disciplina){
        return new ResponseEntity<Disciplina>(service.adicionaDisciplina(disciplina), HttpStatus.CREATED);
    }
}
