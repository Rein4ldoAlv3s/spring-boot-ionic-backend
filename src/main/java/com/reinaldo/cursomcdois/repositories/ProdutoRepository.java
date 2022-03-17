package com.reinaldo.cursomcdois.repositories;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reinaldo.cursomcdois.domain.Categoria;
import com.reinaldo.cursomcdois.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	Page<Produto> search(String nome, List<Categoria> categorias, Pageable pageRequest);
}
