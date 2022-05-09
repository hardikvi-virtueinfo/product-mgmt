package com.ahha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahha.entity.ProductDetail;
import com.ahha.entity.ProductDetailPK;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, ProductDetailPK> {

}
