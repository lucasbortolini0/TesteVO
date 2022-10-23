package br.comvarejonline.projetoinicial.service;

import br.comvarejonline.projetoinicial.data.vo.ResponseVO;
import br.comvarejonline.projetoinicial.entity.ProductsEntity;

import java.util.List;

public interface ProductService {

    List<ProductsEntity> getProducts();

    ResponseVO saveProduct(ProductsEntity product);

    void editProduct(ProductsEntity productEdit);
}
