package com.ahha.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubProductCategoriesDto extends AudtiDataDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long subProductCatId;
	private String subProductCatName;
	private String description;
}
