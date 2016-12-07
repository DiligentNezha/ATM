package io.vicp.goradical.atm.service;

import io.vicp.goradical.atm.dao.RecordDao;
import io.vicp.goradical.atm.entity.Record;
import io.vicp.goradical.atm.tools.JDBCTools;

import java.sql.Connection;
import java.util.List;

public class RecordService {
	private RecordDao recordDao;

	public RecordService(RecordDao recordDao) {
		this.recordDao = recordDao;
	}

	public int getRecordCountWithAccountId(int accountId){
		Connection conn = JDBCTools.getConnection();
		int recordCount = recordDao.getRecordCountWithAccountId(conn, accountId);
		JDBCTools.closeConnection(conn);
		return recordCount;
	}
	public List<Record> getRecordListWithAccountId(int accountId, int pageNum, int pageSize){
		Connection conn = JDBCTools.getConnection();
		List<Record> recordList = recordDao.getRecordListWithAccountId(conn, accountId, pageNum, pageSize);
		JDBCTools.closeConnection(conn);
		return recordList;
	}
}
