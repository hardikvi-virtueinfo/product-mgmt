package com.ahha.dto;

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
public class ProductDetailDto extends AudtiDataDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productId;
	private long srNo;
}
