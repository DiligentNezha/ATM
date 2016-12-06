package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.model.Record;
import io.vicp.goradical.atm.tools.JDBCTools;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class RecordDaoTest {
	private RecordDao recordDao = DaoManager.getDao(RecordDao.class);
	private Connection conn = null;

	@Before
	public void setUp() throws Exception {
		conn = JDBCTools.getConnection();
	}

	@After
	public void tearDown() throws Exception {
		JDBCTools.closeConnection(conn);
	}

	@Test
	public void getRecordCountWithAccountId() throws Exception {
		int count = recordDao.getRecordCountWithAccountId(conn, 2);
		System.out.println(count);
	}

	@Test
	public void getRecordListWithAccountId() throws Exception {
		List<Record> recordList = recordDao.getRecordListWithAccountId(conn, 1, 1, 10);
		for (Record record : recordList) {
			System.out.println(record);
		}
	}

	@Test
	public void saveMoney() throws Exception {
		Connection conn = JDBCTools.getConnection();
		System.out.println(recordDao.balanceIncreaseRecord(conn, 1, 1000));
		JDBCTools.closeConnection(conn);
	}

	@Test
	public void drawMoney() throws Exception {
		Connection conn = JDBCTools.getConnection();
		System.out.println(recordDao.balanceDecreaseRecord(conn, 1, 500));
		JDBCTools.closeConnection(conn);
	}

}