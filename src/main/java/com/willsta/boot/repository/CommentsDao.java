package com.willsta.boot.repository;

import java.util.List;

import com.willsta.boot.domain.Comments;

public interface CommentsDao {

	//댓글 작성
	int createComments(Comments comments) throws Exception;
	
	//대댓글 작성
	int createReComments(Comments comments) throws Exception;

	//댓글 수정
	int updateComments(Comments comments) throws Exception;
	
	//댓글 작성시 Post ViewCount 증가
	int postUpViewCount(int pNo) throws Exception;
	
	//댓글 삭제 전 삭제될 결과의 수 확인
	int removeCommentsCountCheck(int cNo) throws Exception;

	//댓글 삭제
	int removeComments(int cNo) throws Exception;

	//댓글 조회
	Comments findComments(int cNo) throws Exception;

	//댓글 전체 조회
	List<Comments> findCommentsList() throws Exception;
	
	//하나의 포스트에 달린 총 댓글 수
	int postCommentsCount(int pNo) throws Exception;
	
	//하나의 포스트에 달린 댓글 전체 조회
	List<Comments> postCommentsList(int pNo) throws Exception;
}