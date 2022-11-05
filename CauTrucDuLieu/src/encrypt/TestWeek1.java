package encrypt;
import java.util.Arrays;

public class TestWeek1 {
	//Insert
	public static int[] insert(int[] arr, int index, int value) {
		int[] result = new int[arr.length + 1];
		int indexResult = 0;
		for(int i=0; i<arr.length; i++) {
			if(i== index) {
				result[indexResult] = value;
				indexResult ++;
				result[indexResult] = arr[i];
				indexResult ++;
			}else {
				result[indexResult] = arr[i];
				indexResult ++;
			}
		}
		return result;
	}
	
	public static int[] insert2(int[] arr, int index, int value) {
		int[] result = new int[arr.length+1];
		for (int i = 0; i < result.length; i++) {
			if (i==index) {
				result[i] = value;
			} else if ( i> index) {
				result[i] = arr[i-1];
			} else {
				result[i] = arr[i];
			}
		}
		return result;
	}
	
	//Delete
	public static int[] delete(int[] arr, int index) {
		int[] result = new int [arr.length - 1];
		for(int i = 0; i < index; i++)
			result[i] = arr[i];
		for(int i = index + 1; i < arr.length; i++)
			result[i-1] = arr[i];
		return result;
	}
	public static int[] delete2(int[] arr, int index) {
		int[] result = new int[arr.length-1];
		for(int i = 0;i < arr.length;i++) {
			if(i == index) continue;
			if(i < index) {
				result[i] = arr[i];
			} else {
				result[i-1] = arr[i];
			}
		}
		return result;
	}
	//Max or min in array
	public static int getMax(int[] arr) {
		int result = 0;
		for(int a : arr) {
			if(a> result) {
				result = a;
			}
		}
		return result;
	}
	
	public static int getMin(int[] arr) {
		int result = 0;
		for(int a : arr) {
			if(a < result) {
				result = a;
			}
		}
		return result;
	}
	// append array
	public static int[] append(int[] arr1, int[] arr2) {
		int[] result =  new int[arr1.length + arr2.length];
		for(int i=0; i<arr1.length; i++) {
			result[i]= arr1[i];
		}
		for(int j=arr1.length; j<result.length; j++) {
			result[j] = arr2[j - arr1.length];
		}
		return result;
	}
	/* C1:
	 * Viáº¿t hÃ m reverse 
	 * nháº­n vÃ o 1 máº£ng cÃ¡c con sá»‘ int
	 * tráº£ vá»� 1 máº£ng cÃ¡c con sá»‘ int theo thá»© tá»± Ä‘áº£o ngÆ°á»£c
	 * VD: [1,2,3,4] --reverse--> [4,3,2,1]
	 */
	public static int[] reverse(int[] input){
		int[] result = new int[input.length];
		for(int i=0; i< input.length; i++){
			result[i] = input[input.length-i-1];
		}
		return result;
	}
	
	/* C2:
	 * Viáº¿t hÃ m swap
	 * nháº­n vÃ o 1 máº£ng int, vá»‹ trÃ­ 1, vi trÃ­ 2
	 * hoÃ¡n Ä‘á»•i 2 giÃ¡ trá»‹ táº¡i hai vá»‹ trÃ­
	 * tráº£ vá»� máº£ng
	 * VD: [1,2,3,4], index1 = 0; index 2 = 1
	 * ==> [2,1,3,4]
	 */
	public static int[] swap(int[] input, int index1, int index2){
		int tmp = input[index1];
		input[index1] = input [index2];
		input[index2] = tmp;
		return input;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {0,1,2,3,4};
		int[] test2 = {5,6,7};
		System.out.println(TestWeek1.getMax(test));
		System.out.println(TestWeek1.getMin(test));
		System.out.println(Arrays.toString(TestWeek1.reverse(test)));
		System.out.println(Arrays.toString(TestWeek1.append(test,test2)));
		System.out.println(Arrays.toString(TestWeek1.insert(test2, 0, 4)));
		System.out.println(Arrays.toString(TestWeek1.insert2(test2, 0, 4)));
		System.out.println(Arrays.toString(TestWeek1.delete(test2, 0)));
		System.out.println(Arrays.toString(TestWeek1.delete2(test2, 0)));
		System.out.println(Arrays.toString(TestWeek1.swap(test2, 0, 1)));
		
	}

}