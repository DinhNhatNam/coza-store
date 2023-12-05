package com.cybersoft.cozastore22.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_product;
    @Column(name = "images")
    private  String images;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private double price;
    @Column(name = "tag")
    private String tag;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryEntity id_category;

    @OneToMany(mappedBy = "id_product")
    private List<ProductEntity> list;



    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CategoryEntity getId_category() {
        return id_category;
    }

    public void setId_category(CategoryEntity id_category) {
        this.id_category = id_category;
    }
}
