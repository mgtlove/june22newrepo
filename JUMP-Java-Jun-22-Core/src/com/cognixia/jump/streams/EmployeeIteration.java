package com.cognixia.jump.streams;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeIteration {

	public static void main(String[] args) {

		// List of Employee
		List<Employee> employees = new LinkedList<>();

		employees.add(new Employee("Matthew", 0, "CS"));
		employees.add(new Employee("Yamil", 90_000, "Developer"));
		employees.add(new Employee("Jacob", 70_000, "QA"));
		employees.add(new Employee("Fahad", Integer.MAX_VALUE, "QA"));
		employees.add(new Employee("Trent", Integer.MAX_VALUE, "Dog"));
		employees.add(new Employee("Mohamed D.", Integer.MAX_VALUE, "Developer"));

		

		System.out.println(writeObjectsToFile(employees));
		List<Employee> methodList = readObjectsFromFile(Employee.class);

		methodList.forEach(System.out::println);
	}

	// This method demos writing several different data types in java using
	// objectstream
	public static <T> boolean writeObjectsToFile(Collection<T> inputCollection) {
		
		// Grab the generic type of the collection for the print
		Object generic = null;
		if (inputCollection.iterator().hasNext()) {
			generic = inputCollection.iterator().next().getClass().getSimpleName();
		}
		
		// Set filename standard format and see if file already exists
		String fileName = generic + "Objects.data";
		File file = new File("resources/" + fileName);

		// Create new File if needed.
		if (!file.exists()) {
			try {

				file.createNewFile();
				System.out.println("File: " + file.getName() + " created.");

			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		}
		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))) {

			inputCollection.forEach(e -> {
				try {
					writer.writeObject(e);
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			});

			file.setLastModified(LocalDateTime.now().getLong(ChronoField.EPOCH_DAY));
			System.out.println(inputCollection.size() + " objects of " 
			+ generic + " written to file: " + fileName + ". Modfied at " + file.lastModified());
			
			// success write
			
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// fail write, above exception thrown
		return false;

	}

	public static <T> List<T> readObjectsFromFile(Class<T> classfile) {
		
		List<T> employees = new ArrayList<>();
		Object obj = null;
		T element = null;
		String filepath = "resources/" + classfile.getSimpleName() + "Objects.data";
		File file = new File(filepath);

		// Must read in order of the written objects
		try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))) {

			while ((obj = reader.readObject()) != null) {
				element = (T) obj;
				employees.add(element);
			}

		} catch(StreamCorruptedException e) {
			System.out.println("Object stream previously wrote to this file.  Header causing some issues.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("End of file.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employees;

	}
}
