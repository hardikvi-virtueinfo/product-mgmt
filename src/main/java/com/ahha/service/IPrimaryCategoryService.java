package com.ahha.service;

import com.ahha.dto.PrimaryCategoryDto;
import com.ahha.dto.ResponseDto;

public interface IPrimaryCategoryService {

	ResponseDto savePrimaryCategory(PrimaryCategoryDto primaryCategoryDto);
}
