package ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class fileUtils {
	public static ArrayList<String> readFile(String url) {
		ArrayList<String> result = new  ArrayList<String>();
		File file = new File(url);
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bfRrader = new BufferedReader(reader);
			String line= bfRrader.readLine();
			  while (line != null) {
				  result.add(line);
				  line = bfRrader.readLine();
			  }
			  
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(fileUtils.readFile("D://programing//StudyProgram//CauTrucDuLieu//list//ArrayList/ds.txt"));
	}
	
}
