package com.willsta.boot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.willsta.boot.domain.DmContents;
import com.willsta.boot.domain.DmContentsCount;
import com.willsta.boot.mapper.DmContentsMapper;

@Repository
public class DmContentsDaoImpl implements DmContentsDao {
	@Autowired
	private DmContentsMapper dmContentsMapper;
	
	//메시지 전송
	@Override
	public int dmcInsert(DmContents dmContents) {
		return dmContentsMapper.dmcInsert(dmContents);
	}
	
	//메시지 전체 조회
	@Override	
	public List<DmContents> dmcSelectAll() {
		return dmContentsMapper.dmcSelectAll();
	}
	// 특정 방번호 메시지 전체 조회
	@Override
	public List<DmContents> dmNoSelectAll(Integer dmNo) {
		return dmContentsMapper.dmNoSelectAll(dmNo);
	}

	// 특정 메시지 조회
	@Override
	public DmContents dmcSelectOne(int dmContentsNo) {
		return dmContentsMapper.dmcSelectOne(dmContentsNo);
	}

	// 특정 메시지 업데이트
	@Override
	public int dmcUpdate(DmContents dmContents) {
		return dmContentsMapper.dmcUpdate(dmContents);
	}
	
	// 특정 메시지 삭제
	@Override
	public int dmcDelete(int dmContentsNo) {
		return dmContentsMapper.dmcDelete(dmContentsNo);
	}
	// DM메시지 수신 시 플래그 변경
	@Override
	public int dmcReadChat(DmContents dmContents) {
		return dmContentsMapper.dmcReadChat(dmContents);
	}

	// DM메시지 읽지 않은 메세지 갯수
	@Override
	public int dmNotReadCount(DmContents DmContents) {
		return dmContentsMapper.dmNotReadCount(DmContents);
	}

	@Override
	public List<DmContents> dmAllNotReadMessage(DmContents dmContents) {
		return dmContentsMapper.dmAllNotReadMessage(dmContents);
	}

	@Override
	public List<DmContentsCount> dmAllNotReadCount(String mId) {
		return dmContentsMapper.dmAllNotReadCount(mId);
	}

}
