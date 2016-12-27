package io.vicp.goradical.atm.other;

import java.util.Arrays;

public class Temp1 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int[] newArray = getOldArray(array);
		for (int num : newArray) {
			System.out.println(num);
		}
	}

	public static int[] getOldArray(int[] array) {
		for (int i = 0, j = 0; i < array.length; i += 2, j++) {
			array[j] = array[i];
		}
		int temp = array.length;
		return Arrays.copyOfRange(array, 0, temp % 2 == 0 ? temp / 2 : temp / 2 + 1);
	}
}
