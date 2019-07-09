package com.tget.service.transaction;

import com.tget.common.domain.Search;
import com.tget.service.transaction.domain.Transaction;

public interface TranDao {
	
	public void insertTran(Transaction transaction) throws Exception;
	
	public void updateTran(Transaction transaction) throws Exception;
	
	public void updateTranCode(Transaction transaction) throws Exception;
	
	public Transaction selectTran(int tranNo) throws Exception;
	
	public int selectListTran(Search search) throws Exception;
		
	public int selectTotalCount(Search search) throws Exception;
	
}
