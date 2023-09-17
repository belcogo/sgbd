package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Artista;
import br.com.unisinos.discografia.entities.Funcao;
import br.com.unisinos.discografia.repository.ArtistaRepository;
import br.com.unisinos.discografia.repository.FuncaoRepository;
import br.com.unisinos.discografia.enums.TipoFuncaoEnum;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    ArtistaRepository artistaRepository;

    @Autowired
    FuncaoRepository funcaoRepository;

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

    @GetMapping("/{id}/funcoes")
    public ResponseEntity<List<Funcao>> obterFuncoes(@PathVariable Long id, @PathParam("tipo") String tipo) {
        Optional<Artista> artista = artistaRepository.findById(id);
        TipoFuncaoEnum tipoFuncaoEnum = TipoFuncaoEnum.valueOf(tipo.toUpperCase(Locale.ROOT));

        if (artista.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

       List<Funcao> funcoes = funcaoRepository.findByArtistaAndTipo(artista.get(), tipoFuncaoEnum);

        return ResponseEntity.ok(funcoes);
    }

}
