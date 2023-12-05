package com.cybersoft.cozastore22.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "color")
public class ColorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "id_color")
    private List<ProductDetailEntity> listProductdetail;
}
