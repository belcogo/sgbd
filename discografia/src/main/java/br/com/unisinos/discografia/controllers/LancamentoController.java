package br.com.unisinos.discografia.controllers;

import br.com.unisinos.discografia.entities.Lancamento;
import br.com.unisinos.discografia.repository.LancamentoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired
    LancamentoRepository lancamentoRepository;

    @PostMapping
    public ResponseEntity<Lancamento> adicionarLancamento(@RequestBody Lancamento lancamento) {
        try {
            return ResponseEntity.ok(lancamentoRepository.save(lancamento));
        } catch (Exception ex) {
            log.error("Ocorreu um erro ao salvar lancamento: ", ex);
            return ResponseEntity.internalServerError().build();
        }
        // TODO: create example
    }

    @GetMapping
    public List<Lancamento> listar() {
        return (List<Lancamento>) lancamentoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lancamento> obterPorId(@PathVariable Long id) {
        Optional<Lancamento> lancamento = lancamentoRepository.findById(id);

        if (lancamento.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(lancamento.get());
    }

}
