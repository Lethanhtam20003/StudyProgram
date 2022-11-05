package dequi;

public class ChiaHetCho3Va9 {
	public static boolean ChiaHet(int num) {
		boolean result = false;
		int tong=0;
		if(num!=0) {
			tong+=num%10;
			num=num/10;
			
		}
		if(tong%9==0) {
			result=true;
		}
		return result;
	}
}
