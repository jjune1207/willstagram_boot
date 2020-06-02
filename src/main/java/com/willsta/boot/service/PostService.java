package com.willsta.boot.service;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.willsta.boot.domain.Likes;
import com.willsta.boot.domain.Post;
import com.willsta.boot.domain.PostImage;
@Transactional(propagation=Propagation.REQUIRED,
				isolation=Isolation.READ_COMMITTED)
public interface PostService {
	
	Post createPost(Post post, MultipartFile[] uploadFile);

	Post modifyPost(Post post, MultipartFile[] uploadFile);

	int removePost(Integer pNo);
	
	List<Post> selectMyList(Integer lastpNo, String userId, Integer queryGbn);
	
	List<Post> selectYouList(Integer lastpNo, String userId, Integer queryGbn);

	Post selectPost(Integer pNo, String mId);
 
	List<PostImage> selectContents(Integer pNo);
	
	String insert_like(Likes lk);

	int status_change(Integer pNo, String status);

	ModelAndView main_page(String mId);
	
	ModelAndView you_main_page(String mId,String mIdYou);

	ModelAndView personal_main_page(String mId);

	
}