package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Funcao;
import br.com.unisinos.discografia.repository.FuncaoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/funcaos")
public class FuncaoController {

    @Autowired
    FuncaoRepository funcaoRepository;

    @PostMapping
    public ResponseEntity<Funcao> adicionarFuncao(@RequestBody Funcao funcao) {
        try {
            return ResponseEntity.ok(funcaoRepository.save(funcao));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar funcao: ", ex);
            return ResponseEntity.internalServerError().build();
        }
        // TODO: create example
    }

    @GetMapping
    public List<Funcao> listar() {
        return (List<Funcao>) funcaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcao> obterPorId(@PathVariable Long id) {
        Optional<Funcao> funcao = funcaoRepository.findById(id);

        if (funcao.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(funcao.get());
    }

}
