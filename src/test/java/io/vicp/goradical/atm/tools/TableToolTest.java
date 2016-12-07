package io.vicp.goradical.atm.tools;

import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.RecordDao;
import io.vicp.goradical.atm.dao.UserDao;
import io.vicp.goradical.atm.entity.Account;
import io.vicp.goradical.atm.entity.Record;
import io.vicp.goradical.atm.entity.User;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class TableToolTest {
	@Test
	public void getTableData() throws Exception {
		UserDao userDao = DaoManager.getDao(UserDao.class);
		RecordDao recordDao = DaoManager.getDao(RecordDao.class);
		Connection conn = JDBCTools.getConnection();
		User user = userDao.getUserWithUserId(conn, 2);
		List<Account> accountList = user.getAccountList();
		List<Record> recordList = recordDao.getRecordListWithAccountId(conn, 1, 1, 30);
//		String[] columnsName = {"bankCard", "bank", "balance"};
//		Object[][] tableData = TableTool.getTableData(accountList, Account.class, columnsName);
		String[] columnsName = {"account", "actionType", "amount", "date"};
		Object[][] tableData = TableTool.getTableData(recordList, Record.class, columnsName);
		for (int i = 0; i < tableData.length; i++) {
			for (int j = 0; j < tableData[i].length; j++) {
				System.out.print(tableData[i][j] + "\t");
			}
			System.out.println();
		}
	}

}