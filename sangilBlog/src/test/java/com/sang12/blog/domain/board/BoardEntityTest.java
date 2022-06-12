package com.sang12.blog.domain.board;

import java.util.Date;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import com.sang12.blog.repository.common.BoardRepository;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase
public class BoardEntityTest {
	@Autowired
	private BoardRepository boardRep;
	
	//@Test
	public void save() {
		BoardEntity board = new BoardEntity();
		
		board.setLargeCategory(1);
		board.setTitle("test");
		board.setContent("test2");
		board.setRegisterDate(new Date());
		board.setFinalChangeDate(new Date());
		board.setDisplayYn("Y");
		board.setRegisterId("testAdmin");
		
		boardRep.save(board);
		System.out.println(board.getRegisterDate());
	}
}
