package com.tget.service.transaction;

import java.io.File;
import java.util.Map;

import com.tget.common.domain.Search;
import com.tget.service.transaction.domain.Transaction;

public interface TranService {
	
	public void addTran(Transaction transaction) throws Exception;
	
	public void addDelivery(Transaction transaction) throws Exception;
	
	public void updateTranCode(Transaction transaction) throws Exception;
	
	public void updateDeliveryAddr(Transaction transaction) throws Exception;
	
	public Transaction getTran(int tranNo) throws Exception;
	
	public Map<String,Object> getTranList(Search search) throws Exception;
	//�����ȸ
	public Map<String,Object> getTranWhere(Transaction transaction) throws Exception;
	//������̹������	
	public Map<String,Object> getDeliveryImageInfo(File file) throws Exception;
	
	public String deposit(String userId) throws Exception;
	
}