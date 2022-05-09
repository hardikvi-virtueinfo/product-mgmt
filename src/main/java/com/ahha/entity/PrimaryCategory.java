package com.ahha.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="primary_categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrimaryCategory extends AuditData{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="primary_cat_id")
	private Long primaryCatId;
	
	@Column(name="primary_cat_name")
	private String primaryCatName;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "primaryCategory",cascade = CascadeType.ALL)
	private Set<SubPrimaryCategory> subCategoryList;
}
