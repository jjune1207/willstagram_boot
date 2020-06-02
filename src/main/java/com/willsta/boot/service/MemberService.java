package com.willsta.boot.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.willsta.boot.domain.Member;

public interface MemberService {
	
	boolean insertMember(Member member);
	
	boolean updateMemberImg(String mId, MultipartFile mImage);
	
	boolean updateMember(Member member);

	Member selectById(String mId);
	
	Member selectByIdContainFollowInfo(String mId);
	
	List<Member> selectByRandom(String mId);

	boolean deleteMember(String mPass, String mEmail, String mRetire);
	
	boolean accountOn(String mRetire, String mEmail);
	
	boolean existedMember(String mId);
	
	boolean existedPassword(String mPass);
	
	Member findId(String mEmail, String mName);
	
	Member findPw(String mId, String mEmail);
	
	Member getTempPw(String mPass, String mId);
	
	Member signIn(String mId, String mPass) throws Exception;
	
	List<Member> memberList();
	
	List<Member> addMemberList(String lastId);
	
	List<Member> findMemberList(String search);
	
	List<Member> addFindMemberList(String lastId, String search);

}
