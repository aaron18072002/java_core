package view;

import utils.NumberUtils;

public class Ex08Prime {
	public static void main(String[] args) {
		int n = NumberUtils.inputNumber(0, 100, 5, "Nhâp n[0,100): ");
		System.out.println("Kiểm tra số nguyên tố --> " + NumberUtils.isPrime(n));
	}
}
