package com.cybersoft.cozastore22.entity;

import javax.persistence.*;

@Entity
@Table(name = "productdetail")
public class ProductDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductDetail;
    @Column(name = "quantity")
    private int quantity;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_color")
    private ColorEntity id_color;

    @ManyToOne()
    @JoinColumn(name = "id_product")
    private ProductEntity id_product;

    @ManyToOne
    @JoinColumn(name = "id_size")
    private SizeEntity id_size;
}
