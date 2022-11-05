package dequi;

public class coso {
	/**
	 * Hãy viết hàm chuyển đổi hệ cơ số 10 sang cơ số 2 và ngược lại theo 2 cách sử
	 * dụng đệ quy và không sử dụng đệ quy?
	 * 
	 * @param num
	 * @return
	 */
	public static String hecToDecBydequi(int num) {
		String result = "";
		if (num > 0) {
			int n = num % 2;
			num = num / 2;
			result = hecToDecBydequi(num) + n;
		}
		return result;
	}

	public static String hecToDec(int num) {
		String result = "";
		while (num > 0) {
			int n = num % 2;
			num = num / 2;
			result = n + result;
		}
		return result;
	}

	public static int count(int num) {
		int result = 0;
		if (num != 0) {
			result = 1 + count(num / 10);
		}
		return result;
	}
	public static String c(int n,String a,String b,String c) {
		if(n==1) {
			return "move from "+a+" to "+c; 
		}else {
			return c(n-1,a,c,b)+"\n"+("move from "+a+" to "+c)+"\n"+c(n-1,b,a,c);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println(hecToDecBydequi(8));
		System.out.println(count(10));
		System.out.println(c(3, "a", "b", "c"));

	}
}
