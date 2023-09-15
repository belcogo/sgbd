package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Musica;
import br.com.unisinos.discografia.repository.MusicaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    MusicaRepository musicaRepository;

    @PostMapping
    public ResponseEntity<Musica> adicionarMusica(@RequestBody Musica musica) {
        try {
            return ResponseEntity.ok(musicaRepository.save(musica));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar musica: ", ex);
            return ResponseEntity.internalServerError().build();
        }
        // TODO: create example
    }

    @GetMapping
    public List<Musica> listar() {
        return (List<Musica>) musicaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> obterPorId(@PathVariable Long id) {
        Optional<Musica> musica = musicaRepository.findById(id);

        if (musica.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(musica.get());
    }

}
