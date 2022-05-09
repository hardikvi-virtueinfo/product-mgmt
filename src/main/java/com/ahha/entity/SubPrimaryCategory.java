package com.ahha.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="sub_primary_categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubPrimaryCategory extends AuditData{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sub_primary_cat_id")
	private Long subPrimaryCatId;
	
	@JsonIgnore
	@JoinColumn(name="primary_cat_id",nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	private PrimaryCategory primaryCategory;
	
	@Column(name="sub_primary_cat_name")
	private String subPrimaryCatName;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "subPrimaryCategory" ,cascade = CascadeType.ALL)
	private Set<ProductCategories> productCategoriesList;
}
