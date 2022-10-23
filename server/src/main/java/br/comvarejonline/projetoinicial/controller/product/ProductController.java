package br.comvarejonline.projetoinicial.controller.product;

import br.comvarejonline.projetoinicial.data.vo.ResponseVO;
import br.comvarejonline.projetoinicial.entity.ProductsEntity;
import br.comvarejonline.projetoinicial.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/getProducts")
    public ResponseEntity<List<ProductsEntity>> findAllProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
    }

    @PostMapping(value = "/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseVO> save(@RequestBody ProductsEntity productsEntity) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(productService.saveProduct(productsEntity));
    }

}
