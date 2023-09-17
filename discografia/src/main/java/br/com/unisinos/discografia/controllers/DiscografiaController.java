package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Discografia;
import br.com.unisinos.discografia.entities.Musica;
import br.com.unisinos.discografia.repository.DiscografiaRepository;
import br.com.unisinos.discografia.repository.MusicaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/discografias")
public class DiscografiaController {

    @Autowired
    DiscografiaRepository discografiaRepository;

    @Autowired
    MusicaRepository musicaRepository;

    @PostMapping
    public ResponseEntity<Discografia> adicionarDiscografia(@RequestBody Discografia discografia) {
        try {
            return ResponseEntity.ok(discografiaRepository.save(discografia));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar discografia: ", ex);
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping
    public List<Discografia> listar() {
        return (List<Discografia>) discografiaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Discografia> obterPorId(@PathVariable Long id) {
        Optional<Discografia> discografia = discografiaRepository.findById(id);

        if (discografia.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(discografia.get());
    }

    @GetMapping("/{id}/musicas")
    public ResponseEntity<List<Musica>> obterMusicas(@PathVariable Long id) {
        Optional<Discografia> discografia = discografiaRepository.findById(id);

        if (discografia.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        List<Musica> musicas = (List<Musica>) musicaRepository.findByDiscografia(discografia.get());

        return ResponseEntity.ok(musicas);
    }
}
