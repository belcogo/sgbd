package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Artista;
import br.com.unisinos.discografia.repository.ArtistaRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    ArtistaRepository artistaRepository;

    @PostMapping
    public ResponseEntity<Artista> adicionarArtista() throws URISyntaxException {
        Artista artista = new Artista(1l, "Taylor Alisson Swift", "Taylor Swift", "Cantora e compositora de sucesso global com um estilo musical diversificado.");

        artista = artistaRepository.save(artista);

        return ResponseEntity.ok(artista);
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
