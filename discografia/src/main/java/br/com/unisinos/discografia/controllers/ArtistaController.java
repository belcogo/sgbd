package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Artista;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @PostMapping
    public ResponseEntity<Artista> adicionarArtista() throws URISyntaxException {
        Artista artista = new Artista(1, "Taylor Alisson Swift", "Taylor Swift", "Ganhadora de vários grammys");
        return ResponseEntity.ok(artista);
    }

    @GetMapping
    public List<Artista> listar() {
        Artista artista = new Artista(1, "Taylor Alisson Swift", "Taylor Swift", "Ganhadora de vários grammys");
        return List.of(artista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> obterPorId(@RequestParam("id") int id) {
        if (id != 1) {
            return ResponseEntity.notFound().build();
        }

        Artista artista = new Artista(1, "Taylor Alisson Swift", "Taylor Swift", "Ganhadora de vários grammys");
        return ResponseEntity.ok(artista);
    }

}
