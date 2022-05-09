package com.ahha.dto;

import java.util.Set;

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

public class SubPrimaryCategoryDto extends AudtiDataDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long subPrimaryCatId;
	private String subPrimaryCatName;
	private String description;
	private Set<ProductCategoriesDto> productCategoriesList;

}
