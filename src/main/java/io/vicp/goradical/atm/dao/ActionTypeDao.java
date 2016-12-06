package io.vicp.goradical.atm.dao;

import java.util.HashMap;
import java.util.Map;

public class ActionTypeDao {
	private static Map<Integer, String> actionTypeMap = new HashMap<>();

	static {
		init();
	}

	private static void init(){
		actionTypeMap.put(1, "存钱");
		actionTypeMap.put(2, "取钱");
		actionTypeMap.put(3, "转账");
		actionTypeMap.put(4, "刷卡");
	}

	public static String getActionTypeStr(int actionType) {
		return actionTypeMap.get(actionType);
	}

	public static Map<Integer, String> getActionTypeMap() {
		return actionTypeMap;
	}
}
