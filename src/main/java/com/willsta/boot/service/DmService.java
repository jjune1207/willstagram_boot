package com.willsta.boot.service;

import java.util.List;
import java.util.Map;

import com.willsta.boot.domain.DM;
import com.willsta.boot.domain.DmContents;
import com.willsta.boot.domain.DmContentsCount;
import com.willsta.boot.domain.Member;

public interface DmService {
	// 로그인한 유저의 정보얻기
	public Map<String, Member> getMemberInfo(String mId);
	// 첫 채팅방 생성
	public int dmFirstInsert(String mId);
	
	// 상대 채팅방 생성
	public int dmLastInsert(Integer dmNo, String mId);

	// DM 채팅방 유저 전체 조회
	public List<DM> dmRoomSelectAll(String mId);
	// 현재 마지막 방번호 조회
	public String dmGetCurrentDmNo();
	
	// 채팅방 중복 체크
	public boolean duplicateCheck(String mId, String mIdYou);
	// 특정 DM 채팅방 조회
	public DM dmSelectOne(int dmNo);
	
	// DM 채팅방 업데이트
	public int dmUpdate(DM dm);
	
	// DM 채팅방 삭제
	public int dmDelete(int dmNo);
	
	//DM 메시지 전송
	int dmcInsert(DmContents dmContents);
	
	//DM 메시지 전체 조회
	List<DmContents> dmcSelectAll();
	
	//DM 특정 방번호에 대한 메시지 전체 조회
	List<DmContents> dmNoSelectAll(Integer dmNo);
	
	//DM 특정 메시지 조회
	DmContents dmcSelectOne(int dmContentsNo);
	
	//DM 메시지 수정
	int dmcUpdate(DmContents dmContents);
	
	//DM 메시지 삭제
	int dmcDelete(int dmContentsNo);
	
	// DM메시지 수신여부 체크
	public int dmcReadChat(DmContents dmContents);
	
	// DM메시지 읽지 않은 메세지 갯수
	public int dmNotReadCount(DmContents DmContents);
	
	// DM메세지 전체 유저 읽지않은 메세지 갯수
	public List<DmContents> dmAllNotReadMessage(DmContents dmContents);
	
	public List<DmContentsCount> dmAllNotReadCount(String mId);
}
