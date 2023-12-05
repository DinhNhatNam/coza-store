package com.cybersoft.cozastore22.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "size")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "id_size")
    private List<ProductDetailEntity> listProduct;
}
