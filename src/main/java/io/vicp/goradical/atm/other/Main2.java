package io.vicp.goradical.atm.other;

import java.util.Scanner;

/**
 * 题目描述
 编写程序，将一个键盘输入的正整数分解质因数
 输入
 90
 输出
 90=2*3*3*5
 样例输入
 90
 样例输出
 90=2*3*3*5
 */
public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		StringBuffer sb = new StringBuffer(num + "=2");
		int sum = 2;
		num = num / 2;
		while (num != 0){
			sb.append("*" + getZhi(num));
			num /= num;
		}
		System.out.print(sb);
	}

	public static int getZhi(int num) {
		int i;
		for (i = 5; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return i;
	}

	public static boolean isZhi(int num) {
		if (num == 2 || num == 3) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
