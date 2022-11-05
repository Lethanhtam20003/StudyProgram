package sort;

public class selectionSort {
	public static int[] selectionSort_min(int[] arr) {
		return sort_Min(arr,0);
	}

	private static int[] sort_Min(int[] arr, int step) {
		// TODO Auto-generated method stub
		if(step==arr.length-2) {
			return arr;
		}else {
			int minIndex = findMinIndex(arr,step,step+1);
			swap(arr,step,minIndex);
			return sort_Min(arr, step+1);
		}
	}

	private static void swap(int[] arr, int step, int minIndex) {
		// TODO Auto-generated method stub
		int tempt = arr[step];
		arr[step] = arr[minIndex];
		arr[minIndex]= tempt;
	}

	private static int findMinIndex(int[] arr, int step,int min) {
		// TODO Auto-generated method stub
		if(arr.length-1==step) {
			return min;
		}
		if(arr[step]<arr[min]) min = step;
		return findMinIndex(arr, step+1, min);
	}
	public static void main(String[] args) {
		int[] arr= {2,33,5,23,56,77,10,-1};
		for(int i : selectionSort_min(arr))
		System.out.print(i+" , ");
	}
}
