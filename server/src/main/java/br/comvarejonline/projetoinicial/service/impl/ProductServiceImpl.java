package br.comvarejonline.projetoinicial.service.impl;

import br.comvarejonline.projetoinicial.data.vo.ResponseVO;
import br.comvarejonline.projetoinicial.entity.ProductsEntity;
import br.comvarejonline.projetoinicial.exception.ProductException;
import br.comvarejonline.projetoinicial.repository.ProductRepository;
import br.comvarejonline.projetoinicial.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;

    @Override
    public List<ProductsEntity> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public ResponseVO saveProduct(ProductsEntity product) {

        try {
      //      String frase = null;
      //      String x = frase.toUpperCase();
      //      System.out.println(x);
     //       productRepository.save(product);
        } catch (Exception e) {
            throw new ProductException(e);
        }

        return new ResponseVO(200, "ok ok", null);
    }

    @Override
    public void editProduct(ProductsEntity productEdit) {

        Optional<ProductsEntity> productsEntity = productRepository.findById(productEdit.getId());

        if (productsEntity.isPresent()) {
            productsEntity.get().setProductName(productEdit.getProductName());
            productsEntity.get().setMinQuantity(productEdit.getMinQuantity());
            productsEntity.get().setStartingBalance(productEdit.getStartingBalance());

            productRepository.save(productEdit);
        }
    }
}
