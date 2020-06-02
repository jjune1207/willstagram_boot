package com.willsta.boot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.willsta.boot.domain.Comments;
import com.willsta.boot.mapper.CommentsMapper;

@Repository(value = "commentsDao")
public class CommentsDaoImpl implements CommentsDao {
	@Autowired
	private CommentsMapper commentsMapper;
	
	//댓글 작성
	@Override
	public int createComments(Comments comments) throws Exception {
		return commentsMapper.createComments(comments);
	}
	
	//대댓글 작성
	@Override
	public int createReComments(Comments comments) throws Exception {
		return commentsMapper.createReComments(comments);
	}
	
	//댓글 수정
	@Override
	public int updateComments(Comments comments) throws Exception {
		return commentsMapper.updateComments(comments);
	}
	
	//댓글 작성시 Post ViewCount 증가
	@Override
	public int postUpViewCount(int pNo) throws Exception {
		return commentsMapper.postUpViewCount(pNo);
	}
	
	//댓글 삭제 전 삭제될 결과의 수 확인
	@Override
	public int removeCommentsCountCheck(int cNo) throws Exception {
		return commentsMapper.removeCommentsCountCheck(cNo);
	}
	
	//댓글 삭제
	@Override
	public int removeComments(int cNo) throws Exception {
		return commentsMapper.removeComments(cNo);
	}
	
	//댓글 조회
	@Override
	public Comments findComments(int cNo) throws Exception {
		return commentsMapper.findComments(cNo);
	}
	
	//댓글 전체 조회
	@Override
	public List<Comments> findCommentsList() throws Exception {
		return commentsMapper.findCommentsList();
	}
	
	////하나의 포스트에 달린 총 댓글 수
	@Override
	public int postCommentsCount(int pNo) throws Exception {
		return commentsMapper.postCommentsCount(pNo);
	}

	//하나의 포스트에 달린 댓글 전체 조회
	@Override
	public List<Comments> postCommentsList(int pNo) throws Exception {
		return commentsMapper.postCommentsList(pNo);
	}
	
}
