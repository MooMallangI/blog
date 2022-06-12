package com.sang12.blog.domain.common;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
 
@Setter
@Getter
@MappedSuperclass
public class BaseEntity {
	@Temporal(TemporalType.DATE)
	Date registerDate;
	String registerId;
	
	@Temporal(TemporalType.DATE)
	Date finalChangeDate;
	String finalChangeId;
}
