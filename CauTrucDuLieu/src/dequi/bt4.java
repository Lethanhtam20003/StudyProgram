package dequi;
/** 
 * Hãy tính tổng các chữ số của số nguyên dương
 * 
 * 11.Tìm chữ số lớn nhất của số nguyên dương
 * @author tam14
 *
 */
public class bt4 {
	public static int sum(int num) {
		int result=0;
		if(num!=0) result=num%10+sum(num/10);
			return result;
	}
	public static int max(int num) {
		int result= findMax(num,num%10);
		return result;
		
	}
	private static int findMax(int num, int max) {
		// TODO Auto-generated method stub
		if(num!=0) {
			if(num%10>max)max=num%10;
			num=num/10;
			max=findMax(num/10, max);
		}
		return max;
	}
	public static int min(int num) {
		int result= findMin(num,num%10);
		return result;
		
	}
	private static int findMin(int num, int min) {
		// TODO Auto-generated method stub
		if(num!=0) {
			if(num%10<min)min=num%10;
			num=num/10;
			min=findMin(num/10, min);
		}
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(200333));
		System.out.println(max(176290210));
		System.out.println(min(176290210));
	}
}
