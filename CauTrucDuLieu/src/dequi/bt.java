package dequi;

public class bt {
	public static double biToDec(String num) {
		Double result=0.0;
		if(num.length()-1!=-1)
			result= Integer.parseInt(num.charAt(0)+"")*Math.pow(2, num.length()-1)
				+biToDec(num.substring(1));
		return result;
	}
	public static void main(String[] args) {
		System.out.println(biToDec("11111111"));
	}
	
}
