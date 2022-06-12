package com.sang12.blog.domain.board;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.sang12.blog.domain.common.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author Choi Sang Il
 * BOARD 도메인 객체
 */
@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="BOARD01TM")
public class BoardEntity extends BaseEntity implements Serializable{
	private static final long serialVersionUID = -7410113111280947387L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long boardId;
	
	Integer largeCategory;
	Integer middleCategory;
	Integer bottomCategory;
	
	@NotNull
	String title;
	
	@NotNull
	String displayYn;
	
	String keyword;
	
	@NotNull
	@Lob
	@Column( length = 100000 )
	String content;
	
	@Transient
	String largeCategoryName;
	@Transient
	String middleCategoryName;
	@Transient
	String bottomCategoryName;
	
	@Transient
	List<RelateBoardTitleEntity> relateBoardTitleList;
	
	@Transient
	List<BoardReplyEntity> boardReplyEntity;
}
