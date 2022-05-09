package com.ahha.dto;

import java.util.Set;

import com.ahha.entity.SubProductCategories;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoriesDto extends AudtiDataDto{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productCatId;
	private String productCatName;
	private String description;
	
	private Set<SubProductCategoriesDto> subProductCategoriesList;

}
