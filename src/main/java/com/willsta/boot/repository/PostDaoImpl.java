package com.willsta.boot.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.willsta.boot.domain.Likes;
import com.willsta.boot.domain.Post;
import com.willsta.boot.domain.PostImage;
import com.willsta.boot.mapper.PostMapper;

@Repository
public class PostDaoImpl implements PostDao {
	@Autowired
	PostMapper postMapper;
	
	@Override
	public int insert(Post post) {
		return postMapper.insert(post);
	}

	@Override
	public int insertImg(PostImage pi) {
		return postMapper.insertImg(pi);
	}

	@Override
	public int update(Post post) {
		return postMapper.update(post);
	}
	
	@Override
	public int status_update(Integer pNo, String status) {
		return postMapper.status_update(pNo,status);
	}

	@Override
	public int delete(Integer pNo) {
		return postMapper.delete(pNo);
	}
	
	@Override
	public int delete_img(Integer pNo) {
		return postMapper.delete_img(pNo);
	}

	@Override
	public List<Post> selectMyList(Integer lastpNo, String userId, Integer queryGbn) {
		 return postMapper.selectMyList(lastpNo, userId,queryGbn);
	}

	@Override
	public List<Post> selectYouList(Integer lastpNo, String userId, Integer queryGbn) {
		return postMapper.selectYouList(lastpNo, userId,queryGbn);
	}

	@Override
	public Post selectPost(Integer pNo, String mId) {
		 return postMapper.selectOne(pNo, mId);
	}

	@Override
	public List<PostImage> selectContents(Integer pNo) {
		return postMapper.selectContents(pNo);
	}

	@Override
	public String maxContentNo(Integer pNo) {
		return postMapper.maxContentNo(pNo);
	}

	@Override
	public int insert_like(Likes lk) {
		return postMapper.insert_like(lk);
	}

	@Override
	public int delete_like(Likes lk) {
		return postMapper.delete_like(lk);
	}

	@Override
	public int select_like_count(Likes lk) {
		return postMapper.select_like_count(lk);
	}

	@Override
	public int up_viewcount(Integer pNo) {
		return postMapper.up_viewcount(pNo);
	}

	@Override
	public List<Map> selectPostRanking() {
		return postMapper.selectPostRanking();
	}

	

	



}
