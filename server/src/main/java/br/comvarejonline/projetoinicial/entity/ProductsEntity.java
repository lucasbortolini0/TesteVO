package br.comvarejonline.projetoinicial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class ProductsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "barCode", nullable = false)
    Long barCode;

    @Column(name = "productName", nullable = false)
    String productName;

    @Column(name = "minQuantity", nullable = false)
    int minQuantity;

    @Column(name = "startingBalance", nullable = false)
    int startingBalance;

}
