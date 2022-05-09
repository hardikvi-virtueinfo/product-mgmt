package com.ahha.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="product_master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductMaster extends AuditData{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private Long productId;
	
	@JoinColumn(name="primary_cat_id",nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private PrimaryCategory primaryCategory;
	
	@JoinColumn(name="sub_primary_cat_id",nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private SubPrimaryCategory subPrimaryCategory;
	
	@JoinColumn(name="product_cat_id",nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private ProductCategories productCategories;
	
	@JoinColumn(name="sub_product_cat_id",nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private SubProductCategories subProductCategories;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="stock")
	private String stock;
	
	@Column(name="description")
	private String description;
}
