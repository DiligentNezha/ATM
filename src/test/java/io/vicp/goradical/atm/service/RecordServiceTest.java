package io.vicp.goradical.atm.service;

import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.RecordDao;
import io.vicp.goradical.atm.entity.Record;
import org.junit.Test;

import java.util.List;

public class RecordServiceTest {
	private RecordService recordService = new RecordService(DaoManager.getDao(RecordDao.class));

	@Test
	public void getRecordCountWithAccountId() throws Exception {
		int count = recordService.getRecordCountWithAccountId(1);
		System.out.println(count);
	}

	@Test
	public void getRecordListWithAccountId() throws Exception {
		List<Record> recordList = recordService.getRecordListWithAccountId(1, 1, 10);
		System.out.println(recordList);
	}

}