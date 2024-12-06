package view;

import java.util.Scanner;

public class Ex03RetreatElement {
	
	/*
		Bài 3: Bài toán phần tử yên ngựa
		Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99].
		Phần tử Aij được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất 
		trong hàng của nó đồng thời là
		phần tử lớn nhất trong cột của nó.
		47	47	36
		23	43	31
		46	7	29
		Theo ví dụ trong bảng số sau đây thì phần tử Ao₂ c
		hính là phần tử yên ngựa.
		Bạn hãy lập chương trình nhập từ bàn phím một bảng số 
		kích thước MxN và kiểm tra xem nó có phần tử yên ngựa hay không?
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2D
		// Mỗi phần tử là 1 mảng 1 chiều
		
		int[][] matrix = enterNumbersOfMatrix(sc, 3, 3);
		
		printMatrix(matrix,3,3);
		
	}
	
	private static void printMatrix(int[][] matrix,int n,int m) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf("%d",matrix[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
	
	private static int[][] enterNumbersOfMatrix(Scanner sc,int n, int m) {
		int[][] matrix = new int[n][m];
		String text = null;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m;) {
				System.out.printf("Nhập N[%d][%d] = ",i,j);
				text = sc.nextLine();
				if(isValidNumber(text)) {					
					matrix[i][j] = Integer.parseInt(text);
					j++;
				}
			}
		}
		return matrix;
	}
	
	private static boolean isValidNumber(String text) {
		if(text.length() == 0 || text == null) {
			return false;
		}
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) < '0' || text.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
}
