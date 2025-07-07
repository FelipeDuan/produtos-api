package io.github.felipeduan.produtosapi.controller;

import io.github.felipeduan.produtosapi.model.Produto;
import io.github.felipeduan.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido" + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping("/buscar/{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("/editar/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping("/buscar")
    public List<Produto> buscar(@RequestParam("nome") String nome) {
        return produtoRepository.findByNome(nome);
    }
}
