package io.github.felipeduan.produtosapi.repository;

import io.github.felipeduan.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
