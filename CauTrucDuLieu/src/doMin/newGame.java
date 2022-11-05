package doMin;

import java.util.Random;

public class newGame {
	private int hight;
	private int wigth;
	private int[][] array;
	private int numberOfBom;

	public newGame(int hight, int wigth, int numberOfBom) {
		this.hight = hight;
		this.wigth = wigth;
		this.numberOfBom = numberOfBom;
		this.array = new int[hight][wigth];
		array = createArr(array, numberOfBom);
		array = countBom(array);
	}

	private int[][] countBom(int[][] array2) {
		// TODO Auto-generated method stub
		int[][] arr = new int[array2.length + 2][array2[0].length + 2];
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[0].length - 1; j++) {
				arr[i][j] = array2[i - 1][j - 1];
			}
		}
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[0].length - 1; j++) {
				if(arr[i][j]!=-1) {
					array2[i-1][j-1]=Math.abs(arr[i-1][j-1])+Math.abs(arr[i-1][j])+Math.abs(arr[i-1][j+1])
			+ Math.abs(arr[i][j-1])+Math.abs(arr[i][j+1])+Math.abs(arr[i+1][j-1])+
			Math.abs(arr[i+1][j])+Math.abs(arr[i+1][j+1]);;
				}
			}
		}

		return array2;
	}

	private int[][] createArr(int[][] arr, int numberOfBom) {
		// TODO Auto-generated method stub
		if (numberOfBom <= 0)
			return arr;
		Random rd = new Random();
		int h = rd.nextInt(arr.length);
		int w = rd.nextInt(arr[0].length);
		if (arr[h][w] == -1) {
			return createArr(arr, numberOfBom);
		}
		arr[h][w] = -1;
		return createArr(arr, numberOfBom - 1);
	}

	public static void prlArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		newGame ng = new newGame(5, 5, 5);
		prlArr(ng.array);
	}

}
