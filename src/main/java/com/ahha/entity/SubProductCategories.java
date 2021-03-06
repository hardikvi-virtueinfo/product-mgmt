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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="sub_product_categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubProductCategories extends AuditData{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sub_product_cat_id")
	private Long subProductCatId;
	
	@JsonIgnore
	@JoinColumn(name="product_cat_id",nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private ProductCategories productCategories;
	
	@Column(name="sub_product_cat_name")
	private String subProductCatName;
	
	@Column(name="description")
	private String description;

}
