package io.vicp.goradical.atm.temp;

import io.vicp.goradical.atm.tools.JDBCTools;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MeteDataTest {

	@Test
	public void meteDataTest(){
		Connection conn = JDBCTools.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("select * from t_user where user_id = 0");
			ResultSetMetaData metaData = pstmt.getMetaData();
			String tableName = metaData.getTableName(1);
			System.out.println(tableName);
			int columnCount = metaData.getColumnCount();
			System.out.println(columnCount);
			System.err.println("---------------------------------------------");
			for(int i = 1; i <= columnCount; i++) {
				System.out.println("columnClassName:" + metaData.getColumnClassName(i));
				System.out.println("columnDisplaySize:" + metaData.getColumnDisplaySize(i));
				System.out.println("columnLabel:" + metaData.getColumnLabel(i));
				System.out.println("columnName:" + metaData.getColumnName(i));
				System.out.println("columnTypeName:" + metaData.getColumnTypeName(i));
				System.out.println("columnType:" + metaData.getColumnType(i));
				System.out.println("precision:" + metaData.getPrecision(i));
				System.out.println("schemaName:" + metaData.getSchemaName(i));
				System.out.println("scale:" + metaData.getScale(i));
				System.err.println("---------------------------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
