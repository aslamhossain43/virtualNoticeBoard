
package com.renu.virtualNoticeBoard.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.renu.virtualNoticeBoard.VirtualNoticeBoardApplication;
import com.renu.virtualNoticeBoard.entity.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=VirtualNoticeBoardApplication.class)
@WebAppConfiguration
public class BoardRepositoryTest {

	@Autowired
	BoardRepository boardRepository;
	
	@Test
	public void findByNameTest() {
		Board board1=new Board(1l, "Asma", "123", "simple board test");
		Board board2=new Board(2l, "Aslam", "123", "simple board test");
		Board board3=new Board(3l, "Akhi", "123", "simple board test");
		Board board4=new Board(4l, "Asha", "123", "simple board test");
		boardRepository.save(board1);
		boardRepository.save(board2);
		boardRepository.save(board3);
		boardRepository.save(board4);
	 System.out.println(boardRepository.findByName("Asha"));
	   
	}
	
	
	
}
