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
public class PrimaryCategoryDto extends AudtiDataDto{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long primaryCatId;
	
	private String primaryCatName;
	
	private String description;
	
	private Set<SubPrimaryCategoryDto> subCategoryList;
}
