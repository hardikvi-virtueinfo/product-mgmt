package com.ahha.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners({AuditListener.class})
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int isActive;
	private String createdBy;
	private String modifiedBy;
    private String ipAddress;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    @CreatedDate
    @JsonIgnore
    Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @LastModifiedDate
    @JsonIgnore
    Date modifiedOn;
    
    
}
