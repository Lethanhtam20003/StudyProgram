package array;

import java.util.Random;

class arrayBasic {
	public arrayBasic() {
	}

	public void updateArray(int[] arr, int index, int value) {
		arr[index] = value;
	}

	public boolean isContain(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) { // for normal
			if (arr[i] == k)
				return true;
		}
		for (int i : arr) {// foreach
			if (i == k)
				return true;
		}
		return false;
	}

	public int findIndex(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k)
				return i;

		}
		return -1;
	}

	public int[] findIndex2(int[] arr, int k) {
		int[] mang = new int[arr.length];
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == k)
				mang[count++] = j;// j =4 count =0 j=7 count = 1
		}
		int[] result = new int[count];
		System.arraycopy(mang, 0, result, 0, count);
		return result;
	}

	public void printlnArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public int minOfArr(int[] arr) {
		int result = arr[0];
		for (int i : arr) {
			result = (result > i) ? i : result;
		}
		return result;
	}

	public int[] chenValua(int[] arr, int index, int value) {
		int[] result = new int[arr.length + 1];
		for (int i = 0; i < index; i++) {
			result[i] = arr[i];
		}
		result[index] = value;
		System.arraycopy(arr, index, result, index + 1, arr.length - index);
		return result;
	}

	public int[] deleteOneValueInArr(int[] arr, int index, int value) {

		int[] result = new int[arr.length - 1];
		for (int i = 0; i < index; i++) {
			result[i] = arr[i];
		}
		System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
		return result;
	}

	public int[] noiArr(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		return result;
	}

	public int[] changeINdex(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * (arr.length + 1) - 1);
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}

		return arr;
	}

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; i < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public void arr() {
		String s = ("ddssdfs");
		char[] d = s.toCharArray();
	}

	public boolean j() {
		int x = 100;
		String s = String.valueOf(x);
		s.length();
		int i = 0;
		if (s.indexOf(i) != s.indexOf(s.length() - i))
			return false;
		return true;

	}

	public int romanToInt(String s) {
		int result = 0;
		int lengthChar = s.length();
		int[] arrNums = new int[lengthChar];
		char[] arrChar = new char[lengthChar];
		for (int i = 0; i < lengthChar; i++) {
			arrChar[i] = s.charAt(i);
		}
		for (int i = 0; i < lengthChar; i++) {
			arrNums[i] = checkCharacter(arrChar[i]);
		}
		for (int i = 0; i < lengthChar - 1; i++) {
			if (arrNums[i] < arrNums[i + 1]) {
				result = arrNums[i + 1] - arrNums[i++];
			}
			result += arrNums[i];
		}
		result += arrNums[lengthChar - 1];
		return result;
	}

	public static int checkCharacter(char s) {
		switch (s) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return -1;
	}
	public void s() {
		String s = "sds"
				;
		String d = "sdsddd";

        s= s.substring(1,s.length()-1);
	}

	public static void main(String[] args) {
		arrayBasic main = new arrayBasic();
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		int[] arr2 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

		// System.out.println("a1 : "+main.findIndex(arr, 15));
		// main.printlnArray(main.findIndex2(arr, 15));

		// main.printlnArray(main.deleteOneValueInArr(arr, 4, 999));
//		main.printlnArray(main.noiArr(arr,arr2));
		// main.printlnArray(main.changeINdex(arr));
//		String test = "vo tan te";
//		System.out.println(test.indexOf("t"));
		String s = "sds"
				;
		String d = "sdsddd";

        s= s.substring(0,s.length()-1);
        System.out.println(s);
        int target =0,i=0;
        int[] nums= {0,0,0,0,0};
        String[] hh= {"fd","dff","sss"};
        String l="dsd";
        if(nums[i]<target && nums[i+1]>target){i= i+1;}
        if(hh[0].substring(0,2).equals(l)) {
        	
        }
        int ss= (s.endsWith("")==true)?s.substring(9).length()-s.lastIndexOf(" ")-1:s.length()-s.lastIndexOf(" ")-1;
	}

};
