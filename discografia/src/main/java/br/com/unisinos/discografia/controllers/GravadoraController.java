package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Discografia;
import br.com.unisinos.discografia.entities.Gravadora;
import br.com.unisinos.discografia.repository.DiscografiaRepository;
import br.com.unisinos.discografia.repository.GravadoraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/gravadoras")
public class GravadoraController {

    @Autowired
    GravadoraRepository gravadoraRepository;

    @Autowired
    DiscografiaRepository discografiaRepository;

    @PostMapping
    public ResponseEntity<Gravadora> adicionarGravadora(@RequestBody Gravadora gravadora) {
        try {
            return ResponseEntity.ok(gravadoraRepository.save(gravadora));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar gravadora: ", ex);
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping
    public List<Gravadora> listar() {
        return (List<Gravadora>) gravadoraRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gravadora> obterPorId(@PathVariable Long id) {
        Optional<Gravadora> gravadora = gravadoraRepository.findById(id);

        if (gravadora.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(gravadora.get());
    }

    @GetMapping("/{id}/discografias")
    public ResponseEntity<List<Discografia>> obterDiscografias(@PathVariable Long id) {
        Optional<Gravadora> gravadora = gravadoraRepository.findById(id);

        if (gravadora.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        List<Discografia> discografias = (List<Discografia>) discografiaRepository.findByGravadora(gravadora.get());

        return ResponseEntity.ok(discografias);
    }
}
