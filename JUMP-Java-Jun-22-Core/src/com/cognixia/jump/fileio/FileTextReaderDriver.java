package com.cognixia.jump.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReaderDriver {

	public static void main(String[] args) {
		
		File file = new File("resource/hello.txt");
		FileReader fileReader = null;
		BufferedReader buffReader = null;
		
		try {
			fileReader = new FileReader(file);
			buffReader = new BufferedReader(fileReader);
			
			// read the first line of text from file
			String line = buffReader.readLine();
			System.out.println(line);
			
			System.out.println("\nContents of: " + file.getName());
			String fileText = "";
			
			while((fileText = buffReader.readLine()) != null) {
				System.out.println(fileText);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				buffReader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
