package com.ahha.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.ahha.connector.ContentData;
import com.ahha.dto.PrimaryCategoryDto;
import com.ahha.dto.ResponseDto;
import com.ahha.service.IPrimaryCategoryService;

@RestController
@RequestMapping("api")
public class ProductController {

	@Autowired
	private IPrimaryCategoryService iPrimaryCategoryService;
	
	@Autowired
	private ContentData contentData;
	
	@GetMapping("product")
	public String getEmployee() throws RestClientException, IOException {
		return contentData.getUser();
	}
	
	@PostMapping("save/primaryCategory")
	private ResponseEntity<ResponseDto> savePrimaryCategory(@RequestBody PrimaryCategoryDto primaryCategoryDto) {
		ResponseEntity<ResponseDto> responseEntity = new ResponseEntity<ResponseDto>(iPrimaryCategoryService.savePrimaryCategory(primaryCategoryDto), HttpStatus.OK);
		return responseEntity;
	}
}
