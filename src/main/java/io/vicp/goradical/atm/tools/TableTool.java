package io.vicp.goradical.atm.tools;

import java.lang.reflect.Method;
import java.util.List;

public class TableTool {

	public static <T> Object[][] getTableData(List<T> list, Class<T> cla, String[] columnsName) {
		Object[][] tableData;
		int size = list.size();
		Method method;
		tableData = new Object[size][columnsName.length];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < columnsName.length; j++) {
				try {
					method = cla.getMethod("get" + columnsName[j].substring(0, 1).toUpperCase() + columnsName[j].substring(1));
					tableData[i][j] = method.invoke(list.get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return tableData;
	}

	public static void printDyadicArray(Object[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\n");
			}
			System.out.println();
		}
	}

	public static void printArray(Object[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
