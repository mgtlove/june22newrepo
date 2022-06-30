package com.cognixia.jump.fileio;

import java.io.File;
import java.io.IOException;

// Will work with multiple Java classes for File interaction (Reading / Writing)
public class FileInOutDriver {

	public static void main(String[] args) {

		try {
			File file = new File("resources/temp.txt");

			System.out.println("Does file exist?" + file.exists());
			
			if(!file.exists()) {
				if(file.createNewFile()) {
					System.out.println("Created file at Location: " + file.getAbsolutePath());
				};
				
			}
			
			System.out.println("Last modified: " + file.lastModified());
			
			// make a directory (folder)
			File dir = new File("resources/dir2/dir3");
			
			if(!dir.exists()) {
				if(dir.mkdirs()) {
					System.out.println("directories made.");
				}
				else System.out.println("not made.");
			}
			
			// continue using relative path to make a file in our new directories
			
			File fileInDir = new File("resources/dir2/dir3/newFile.txt");
			
			if(!fileInDir.exists()) {
				if(fileInDir.createNewFile()) {
					System.out.println("directories made.");
				}
				else System.out.println("not made.");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
