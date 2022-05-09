package com.ahha.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahha.dto.PrimaryCategoryDto;
import com.ahha.dto.ResponseDto;
import com.ahha.entity.PrimaryCategory;
import com.ahha.entity.ProductDetailPK;
import com.ahha.repository.PrimaryCategoryRepository;
import com.ahha.service.IPrimaryCategoryService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PrimaryCategoryServiceImpl implements IPrimaryCategoryService {

	@Autowired
	private PrimaryCategoryRepository primaryCategoryRepository;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public ResponseDto savePrimaryCategory(PrimaryCategoryDto primaryCategoryDto) {
		final PrimaryCategory category = objectMapper.convertValue(primaryCategoryDto, new TypeReference<PrimaryCategory>() {});
		category.getSubCategoryList().forEach(subPrimaryCategory -> subPrimaryCategory.setPrimaryCategory(category));
		
		category.getSubCategoryList()
			.forEach(subPrimaryCategory -> subPrimaryCategory.getProductCategoriesList()
					.forEach(prodCat -> {
						prodCat.setSubPrimaryCategory(subPrimaryCategory);
						prodCat.getSubProductCategoriesList()
							.forEach(subProductCat -> {
							subProductCat.setProductCategories(prodCat);
						});
					}));
		
		
		
//		category.getSubCategoryList()
//		.forEach(subPrimaryCategory -> subPrimaryCategory.getProductCategoriesList()
//				.forEach(prodSub -> prodSub.getProductDetailList()
//						.forEach(prodDet -> {
//							prodDet.getId().getProductMaster().setPrimaryCategory(category);
//							prodDet.getId().getProductMaster().setSubPrimaryCategory(subPrimaryCategory);
//							
//							prodDet.getId().getProductMaster().setProductCategories(prodSub);
//							//prodDet.getId().getProductMaster().setSubProductCategories(null);
//
//
//						} )));

		
		ResponseDto dto = new ResponseDto();
		PrimaryCategory savedCategory = primaryCategoryRepository.save(category);
		primaryCategoryDto = objectMapper.convertValue(savedCategory, new TypeReference<PrimaryCategoryDto>() {});
		dto.setData(primaryCategoryDto);
		
		return dto;

	}

}
