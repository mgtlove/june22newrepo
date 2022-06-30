package com.cognixia.jump.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectStreamsDriver {

	public static void main(String[] args) {

		File file = new File("resources/objectFile.data");

		try {

			file.createNewFile();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		writeObjectsToFile(file);
		readObjectsFromFile(file);
		
	}
	
	// This method demos writing several different data types in java using objectstream
	public static void writeObjectsToFile(File file) {
		
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))){
			
			Person person = new Person("Jacob", 25);
			Student student = new Student("Brett", 4.0);
			String hello = "Hello World";
			
			writer.writeObject(person);
			writer.writeObject(student);
			writer.writeObject(hello);
			
			// **primitives - actually going to be autoboxed to the Wrapper
			int num =4;
			boolean bool = true;
			char ch = '#';
			
//			writer.writeChars(hello);;
			writer.writeInt(num);
			writer.writeBoolean(bool);
			writer.writeChar(ch);
			
			//Arrays and Collections in Java, are Objects in of themselves
			int[] numArr = {1, 5, 4, 9};
			writer.writeObject(numArr);
			
			List<String> strList = new ArrayList<>();
			strList.add("str1");
			strList.add("str2");
			strList.add("str3");
			writer.writeObject(strList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readObjectsFromFile(File file) {
		
		// Must read in order of the written objects
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))){
			
			Person person = (Person)reader.readObject();
			System.out.println("1st Object: " + person);
			
			Student student = (Student)reader.readObject();
			System.out.println("2nd Object: " + student);
			
			String str = (String)reader.readObject();
			System.out.println("2nd Object: " + str);
			
//			String str2 = reader.toString();
//			System.out.println("3rd Object: " + str2);
			
			//The "primitives"
			int num = reader.readInt();
			System.out.println("1st primitive: " + num);
			
			boolean bool = (Boolean)reader.readBoolean();
			System.out.println("2nd primitive: " + bool);
			
			char ch = (char)reader.readChar();
			System.out.println("3rd primitive: " + ch);
			
			//Arrays and Collections
			int[] numArr = (int[])reader.readObject();
			System.out.println("1st array: " + Arrays.toString(numArr));
			
			@SuppressWarnings("unchecked")
			List<String> strList = (List<String>) reader.readObject();
			System.out.println("The List<String>:");
			//This is part of the Java 8 Stream API and an example of Method Reference
			// this is a preview, will look at these more soon
			strList.forEach(System.out::println);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
