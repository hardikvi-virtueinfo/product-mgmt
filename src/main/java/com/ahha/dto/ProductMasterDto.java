package com.ahha.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductMasterDto extends AudtiDataDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productId;
	private String productName;
	private String stock;
	private String description;

}
