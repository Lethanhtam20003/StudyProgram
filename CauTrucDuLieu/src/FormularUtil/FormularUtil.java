/**
 * 
 */
package FormularUtil;

import java.util.Random;

/**
 * @author tam14
 *
 */
public class FormularUtil {
	public static double getAreaByHeronFormula(double a, double b, double c) {
		if (a + b < c || a + c < b || b + c< a) {
			throw new RuntimeException("Input value is not edge 0f triangle");
		} else {
			double p = (a + b + c) / 2;
			return Math.sqrt(p * (p - a) * p - b) * (p - c);
		}
	}

	public static String captchaCreate(int l) {
		if (l < 3 || l > 8) {
			throw new RuntimeException("length must then 4 and less 8");
		} else {
			String result = "";
			for (int i = 0; i < l; i++) {
				result += ranChar();
			}
			return result;
		}
	}

	private static char ranChar() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		switch (rd.nextInt(3)) {
		case 0:
			return (char) ('0' + rd.nextInt(9));

		case 1:
			return (char) ('A' + rd.nextInt(26));
		case 2:
			return (char) ('a' + rd.nextInt(26));
		}
		return '!';
	}

	public static void main(String[] args) {
		System.out.println(getAreaByHeronFormula(17.7, 16.4, 10.0));
		System.out.println(captchaCreate(4));
	}
}
