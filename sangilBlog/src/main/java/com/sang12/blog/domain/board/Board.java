package com.sang12.blog.domain.board;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;



/**
 * com.sang12.blog.domain.board
 * Board.java
 * 
 * @author Choi Sang Il
 * @Date 2018. 7. 25.
 * @Description : 게시판 domain 모델
 */
@Entity
@Data
@Table(name="BOARD01TM")
public class Board implements Serializable{
	private static final long serialVersionUID = -7410113111280947387L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long boardId;
	
	Integer largeCategory;
	Integer middleCategory;
	Integer bottomCategory;
	
	@NotNull
	String title;
	@NotNull
	String content;
	
	Date registerDate;
	String registerId;
	Date finalChangeDate;
	String finalChangeId;
}