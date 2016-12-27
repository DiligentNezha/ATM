package io.vicp.goradical.atm.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 题目描述
 编写程序，将16进制表示的串转换为3进制表示的串
 输入
 5
 输出
 12
 样例输入
 5
 样例输出
 12
 */
public class Temp {
	public static Map<Character, Integer> map = new HashMap<>();
	static {
		map.put('0', 0);
		map.put('1', 1);
		map.put('2', 2);
		map.put('3', 3);
		map.put('4', 4);
		map.put('5', 5);
		map.put('6', 6);
		map.put('7', 7);
		map.put('8', 8);
		map.put('9', 9);
		map.put('A', 10);
		map.put('B', 11);
		map.put('C', 12);
		map.put('D', 13);
		map.put('E', 14);
		map.put('F', 15);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int sum = 0;
		for (int length = str.length() - 1; length >= 0; length--) {
			sum += Math.pow(map.get(str.charAt(length)), str.length() -length);
			System.out.println(sum);
		}
	}
}
