package ArrayList;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Award {
	private ArrayList<customer> list = new ArrayList<customer>();

	public Award(String url) {
		this.list = loadCustomer(url);
	}

	private ArrayList<customer> loadCustomer(String url) {
		// TODO Auto-generated method stub
		ArrayList<String> lines = fileUtils.readFile(url);
		ArrayList<customer> customerList = new ArrayList<customer>();
		for(String line : lines) {
			StringTokenizer token = new StringTokenizer(line,"/t");// tương ứng với tap
			customer c = new customer(token.nextToken(),Integer.valueOf( token.nextToken()), token.nextToken());
			customerList.add(c);
		}
		return null;
	}
	
}
