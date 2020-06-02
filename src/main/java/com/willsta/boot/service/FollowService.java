package com.willsta.boot.service;

import java.util.List;

import com.willsta.boot.domain.Follow;

public interface FollowService {

	int follow(Follow follow);

	int unfollow(String mIdYou, String mId);

	List<Follow> followerList(String mId);

	List<Follow> followingList(String mId);

	int followingCount(String mIdYou);

	int followersCount(String mId);
	
	int followCheck(String mId,String mIdYou);

	/*
	 * List<Map> followingList(String mId);
	 * 
	 * List<Map> followerList(String mIdYou);
	 */
}
