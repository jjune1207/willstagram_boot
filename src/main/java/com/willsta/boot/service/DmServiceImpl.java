package com.willsta.boot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willsta.boot.domain.DM;
import com.willsta.boot.domain.DmContents;
import com.willsta.boot.domain.DmContentsCount;
import com.willsta.boot.domain.Member;
import com.willsta.boot.repository.DmContentsDao;
import com.willsta.boot.repository.DmDao;
@Service
public class DmServiceImpl implements DmService {
	@Autowired
	private DmDao dmDao;
	@Autowired
	private DmContentsDao dmContentsDao;
	@Autowired
	private MemberService memberService;
	
	//첫 채팅방 생성
	@Override
	public int dmFirstInsert(String mId) {
		return dmDao.dmFirstInsert(mId);
	}
	// 상대 채팅방 생성
	@Override
	public int dmLastInsert(Integer dmNo, String mId) {
		return dmDao.dmLastInsert(dmNo, mId);
	}
	
	@Override
	public List<DM> dmRoomSelectAll(String mId) {
		return dmDao.dmRoomSelectAll(mId);
	}
	@Override
	public DM dmSelectOne(int dmNo) {
		return dmDao.dmSelectOne(dmNo);
	}
	@Override
	public int dmUpdate(DM dm) {
		return dmDao.dmUpdate(dm);
	}
	@Override
	public int dmDelete(int dmNo) {
		return dmDao.dmDelete(dmNo);
	}
	@Override
	public int dmcInsert(DmContents dmContents) {
		return dmContentsDao.dmcInsert(dmContents);
	}
	@Override
	public List<DmContents> dmcSelectAll() {
		return dmContentsDao.dmcSelectAll();
	}
	@Override
	public List<DmContents> dmNoSelectAll(Integer dmNo) {
		return dmContentsDao.dmNoSelectAll(dmNo);
	}
	@Override
	public DmContents dmcSelectOne(int dmContentsNo) {
		return dmContentsDao.dmcSelectOne(dmContentsNo);
	}
	@Override
	public int dmcUpdate(DmContents dmContents) {
		return dmContentsDao.dmcUpdate(dmContents);
	}
	@Override
	public int dmcDelete(int dmContentsNo) {
		return dmContentsDao.dmcDelete(dmContentsNo);
	}
	@Override
	public boolean duplicateCheck(String mId, String mIdYou) {
		boolean isDuplicated = false;
		List<DM> dmList = dmDao.dmRoomSelectAll(mId);
		for (DM dm : dmList) {
			if(dm.getmId().equalsIgnoreCase(mIdYou)) {
				isDuplicated = true;
			}
		}
		return isDuplicated;
	}
	@Override
	public String dmGetCurrentDmNo() {
		return dmDao.dmGetCurrentDmNo();
	}
	@Override
	public Map<String, Member> getMemberInfo(String mId) {
		Map<String, Member> memberInfo = new HashMap<String, Member>();
		Member member = memberService.selectById(mId);
		memberInfo.put("member", member);
		return memberInfo;
	}
	@Override
	public int dmcReadChat(DmContents dmContents) {
		return dmContentsDao.dmcReadChat(dmContents);
	}
	@Override
	public int dmNotReadCount(DmContents DmContents) {
		return dmContentsDao.dmNotReadCount(DmContents);
	}
	@Override
	public List<DmContents> dmAllNotReadMessage(DmContents dmContents) {
		return dmContentsDao.dmAllNotReadMessage(dmContents);
	}
	@Override
	public List<DmContentsCount> dmAllNotReadCount(String mId) {
		return dmContentsDao.dmAllNotReadCount(mId);
	}
}
