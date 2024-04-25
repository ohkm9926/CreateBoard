package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServicelmpl implements BoardService {

 @Inject
 private BoardDAO dao;
 
 @Override
 public List<BoardVO> list() throws Exception {

  return dao.list();
 }

@Override
public void write(BoardVO vo) throws Exception {
	// TODO Auto-generated method stub
	dao.write(vo);
}

//게시물 조회
@Override
public BoardVO view(int bno) throws Exception {

return dao.view(bno);
}

//게시물 수정
@Override
public void modify(BoardVO vo) throws Exception {

dao.modify(vo);
}

//게시물 삭제
public void delete(int bno) throws Exception {
dao.delete(bno);
}
}
