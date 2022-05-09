package com.ahha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahha.entity.PrimaryCategory;

@Repository
public interface PrimaryCategoryRepository extends JpaRepository<PrimaryCategory, Long> {

}
