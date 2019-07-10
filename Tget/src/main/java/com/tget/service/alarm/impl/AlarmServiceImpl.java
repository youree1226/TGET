package com.tget.service.alarm.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tget.common.domain.Search;
import com.tget.service.alarm.AlarmDao;
import com.tget.service.alarm.AlarmService;
import com.tget.service.alarm.domain.Alarm;

@Service("alarmServiceImpl")
public class AlarmServiceImpl implements AlarmService{
	
	@Autowired
	@Qualifier("alarmDaoImpl")
	private AlarmDao alarmDao;
	
	public void setAlarmDao(AlarmDao alarmDao) {
		this.alarmDao = alarmDao;
	}
	
	public AlarmServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass());
	}	
	
	//MetaData화 하기
	@Override
	public void addAlarm(Alarm alarm) throws Exception {
		// TODO Auto-generated method stub
		switch (alarm.getAlarmCode()) {
		case 0:
			alarm.setAlarmBody("티켓결제가 완료되었습니다.");
			break;
		case 1:
			alarm.setAlarmBody("관심이벤트의 신규티켓이 등록되었습니다.");
			break;	
		case 2:
			alarm.setAlarmBody("판매티켓이 배송완료 되었습니다.");
			break;
		case 3:	
			alarm.setAlarmBody("구매티켓의 배송이 시작되었습니다.");
			break;
		case 4:
			alarm.setAlarmBody("쿠폰이 발급되었습니다.");
			break;
		case 5:
			alarm.setAlarmBody("신고된 글이 있습니다. 확인해주세요.");
			break;
		case 6:
			alarm.setAlarmBody("작성글에 댓글이 등록되었습니다.");
			break;
		case 7:
			alarm.setAlarmBody("환불이 처리되었습니다.");
			break;
		case 8:
			alarm.setAlarmBody("판매등급이 조정되었습니다. 확인해주세요.");
			break;	
		default:
			break;
		}
		
		alarmDao.insertAlarm(alarm);
		
	}

	@Override
	public int getNoReadAlarmCount(String userId) throws Exception {
		// TODO Auto-generated method stub		
		return alarmDao.selectNoReadAlarmCount(userId);
	}

	@Override
	public Map<String, Object> getAlarmList(Search search) throws Exception {
		// TODO Auto-generated method stub
		
		List<Alarm> list = alarmDao.selectListAlarm(search);
		int totalCount = alarmDao.selectTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("totalCount", totalCount);
		
		return map;
	}

	@Override
	public void deleteAlarm(int alarmNo) throws Exception {
		// TODO Auto-generated method stub
		alarmDao.deleteAlarm(alarmNo);
	}

	@Override
	public void updateAlarmRead(int alarmNo) throws Exception {
		// TODO Auto-generated method stub
		alarmDao.updateAlarmRead(alarmNo);
	}

}
