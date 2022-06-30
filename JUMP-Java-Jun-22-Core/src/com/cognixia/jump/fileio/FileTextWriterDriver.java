package com.cognixia.jump.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTextWriterDriver {

	public static void main(String[] args) {
		
		File file = null;
		FileWriter fileWriter = null;
		BufferedWriter buffWriter = null;
		PrintWriter printWriter = null;
		
		try {
			file = new File("resources/hello.txt");
			
			// Could do a custom exception here
			if (!file.exists()) {
				if (file.createNewFile()) {
					System.out.println("File: " + file.getName() + " created.");
				}
			}
			
			// layering of composition to ultimately create our PrintWriter tool
			// The true boolean of fileWriter causes us to append all writes
			fileWriter = new FileWriter(file, true);
			buffWriter = new BufferedWriter(fileWriter);
			printWriter = new PrintWriter(buffWriter);
			
			//use the various writer static methods from below and see the effects on the file.
			if(writeUsingPrintWriter(printWriter, "hello world.")) {
				System.out.println("Write successful.");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try to close the buffWriter, if instantiated
			if (buffWriter !=null) {
				try {
					buffWriter.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			// try to close the FileWriter, if instantiated
			if (fileWriter !=null) {
				try {
					fileWriter.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			// try to close the PrintWriter, if instantiated
			if (printWriter !=null) {
				try {
					printWriter.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		}

	}

	public static boolean writeToFile(BufferedWriter writer, String str) throws IOException {
		
		// i in the loop will be the # of lines we print
		for (int i = 0; i < 3; i++) {
			writer.write(str);

		}
		
		return true;
	}
	
	// change the boolean in the fileWriter to false, to cause a rewrite
	public static boolean appendToFile(BufferedWriter writer, String str) throws IOException {
		
		// i in the loop will be the # of lines we print
		for (int i = 0; i < 3; i++) {
			writer.append("\n"+str);
		}
		
		return true;
		
	}
	
	public static boolean writeUsingPrintWriter(PrintWriter writer, String str) throws IOException {
		
		writer.println();
		writer.print(str);
		writer.println(str);
		writer.println(str);
		
		return true;
		
	}
}
