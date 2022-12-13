package com.source.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuditDto implements Serializable {

	
	private String createdby;
	private LocalDateTime localDateTime;
	private String updatedBy;
	private LocalDateTime updatedDateTime;
	
	
	public AbstractAuditDto()
	{
		System.out.println("Calling the no-argu consturction of AbstractAuditDto");
	}
	
	
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public LocalDateTime getCreatedDateTime() {
		return localDateTime;
	}
	public void setCreatedDateTime(LocalDateTime LocalDateTime) {
		this.localDateTime = LocalDateTime;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	
	
	
	
	
	
	
	
	
}
