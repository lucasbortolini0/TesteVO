package br.comvarejonline.projetoinicial.repository;

import br.comvarejonline.projetoinicial.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductsEntity, Long> {}