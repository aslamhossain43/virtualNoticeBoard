package com.renu.virtualNoticeBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renu.virtualNoticeBoard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

	public Board findByName(String name);
	
}
