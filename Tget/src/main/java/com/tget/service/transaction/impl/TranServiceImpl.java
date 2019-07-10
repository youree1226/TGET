package com.tget.service.transaction.impl;

import java.io.File;
import java.util.Map;

import com.tget.common.domain.Search;
import com.tget.service.transaction.TranService;
import com.tget.service.transaction.domain.Transaction;

public class TranServiceImpl implements TranService{

	@Override
	public void addTran(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDelivery(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTranCode(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDeliveryAddr(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction getTran(int tranNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getTranList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getTranWhere(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getDeliveryImageInfo(File file) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(String userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
