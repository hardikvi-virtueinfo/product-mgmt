package com.ahha.entity;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class AuditListener {
	
	@PrePersist
	protected void beforePersist(AuditData auditData) {
		Date date = new Date();
		auditData.setCreatedOn(date);
		auditData.setModifiedOn(date);
		
	}
	
	@PreUpdate
	protected void beforeUpdate(AuditData auditData) {
		auditData.setModifiedOn(new Date());
		
	}

}
