package io.vicp.goradical.atm.other;
import java.util.Scanner;

/**
 * 题目描述
 从键盘输入一串数字字符串，将串从数字不连续的位置断开，打印输出多个连续的串
 输入
 1232345676
 输出
 123
 234567
 6
 样例输入
 1232345676
 样例输出
 123
 234567
 6
 */
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] chars = new char[str.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = str.charAt(i);
		}
		int[] index = new int[str.length()];
		int j = 0;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] < chars[i - 1]) {
				index[j++] = i;
			}
		}
		int i;
		if (index[1] != 0) {
			System.out.println(str.substring(0, index[0]));
		}
		for (i = 1; i < index.length; i++) {
			if (index[i] != 0) {
				System.out.println(str.substring(index[i - 1], index[i]));
			} else {
				break;
			}
		}
		System.out.print(str.substring(index[i - 1], str.length()));
	}
}
