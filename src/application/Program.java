package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		String path = "C:\\Users\\minha\\workspace-java-completo\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				list.add(line);
				line = br.readLine();
			}
			
			Collections.sort(list);
			for (String string : list) {
			System.out.println(string);	
			}
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
