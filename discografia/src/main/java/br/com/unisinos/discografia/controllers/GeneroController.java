package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Genero;
import br.com.unisinos.discografia.repository.GeneroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    GeneroRepository generoRepository;

    @PostMapping
    public ResponseEntity<Genero> adicionarGenero(@RequestBody Genero genero) {
        try {
            return ResponseEntity.ok(generoRepository.save(genero));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar genero: ", ex);
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping
    public List<Genero> listar() {
        return (List<Genero>) generoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> obterPorId(@PathVariable Long id) {
        Optional<Genero> genero = generoRepository.findById(id);

        if (genero.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(genero.get());
    }

}
