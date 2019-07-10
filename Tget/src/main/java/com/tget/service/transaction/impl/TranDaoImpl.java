package com.tget.service.transaction.impl;

import java.util.List;

import com.tget.common.domain.Search;
import com.tget.service.transaction.TranDao;
import com.tget.service.transaction.domain.Transaction;

public class TranDaoImpl implements TranDao{

	public TranDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertTran(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDeliveryInfo(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDeliveryAddr(Transaction transaction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTranCode(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Transaction selectTran(int tranNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> selectListTran(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
