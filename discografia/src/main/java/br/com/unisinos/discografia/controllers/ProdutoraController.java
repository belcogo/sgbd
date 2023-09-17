package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Produtora;
import br.com.unisinos.discografia.repository.ProdutoraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/produtoras")
public class ProdutoraController {

    @Autowired
    ProdutoraRepository produtoraRepository;

    @PostMapping
    public ResponseEntity<Produtora> adicionarProdutora(@RequestBody Produtora produtora) {
        try {
            return ResponseEntity.ok(produtoraRepository.save(produtora));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar produtora: ", ex);
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping
    public List<Produtora> listar() {
        return (List<Produtora>) produtoraRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produtora> obterPorId(@PathVariable Long id) {
        Optional<Produtora> produtora = produtoraRepository.findById(id);

        if (produtora.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(produtora.get());
    }

}
