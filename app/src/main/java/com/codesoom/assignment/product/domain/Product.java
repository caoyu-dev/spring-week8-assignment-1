package com.codesoom.assignment.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 상품 정보.
 */
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    /** 상품 식별자. */
    @Id
    @GeneratedValue
    private Long id;

    /** 상품명. */
    private String name;

    /** 상품제조사. */
    private String maker;

    /** 상품가격. */
    private Integer price;

    /** 상품이미지. */
    private String imageUrl;

    /**
     * 상품의 정보를 갱신합니다.
     * @param source 갱신될 상품 명세서
     */
    public void changeWith(Product source) {
        this.name = source.name;
        this.maker = source.maker;
        this.price = source.price;
    }
}
