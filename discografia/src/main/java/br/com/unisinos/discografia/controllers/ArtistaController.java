package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Artista;
import br.com.unisinos.discografia.repository.ArtistaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    ArtistaRepository artistaRepository;

    @PostMapping
    public ResponseEntity<Artista> adicionarArtista(@RequestBody Artista artista) {
        try {
            return ResponseEntity.ok(artistaRepository.save(artista));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar artista: ", ex);
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping
    public List<Artista> listar() {
        return (List<Artista>) artistaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> obterPorId(@PathVariable Long id) {
        Optional<Artista> artista = artistaRepository.findById(id);

        if (artista.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(artista.get());
    }

}
