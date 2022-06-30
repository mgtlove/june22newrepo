package com.cognixia.jump.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDriver {

	public static void main(String[] args) {

		int[] primitive = { 2, 4, 6, 6, 2, 4, 12, 3, 11 };

		Integer[] integers = Arrays.stream(primitive).boxed().toArray(Integer[]::new);

		System.out.println(Arrays.toString(integers));

		List<Integer> numbers = Arrays.asList(integers);

		List<Integer> primConvertList = Arrays.stream(primitive).boxed().collect(Collectors.toList());

		primConvertList.forEach(System.out::println);

		// Reduce is an aggregate method, with variable implementation
		// we take the items of a collection and reduce them into a single output value.

		int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);

		System.out.println("Sum of numbers = " + sum);

		int biggest = numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).get();

		Optional<Integer> smallest = numbers.stream().reduce((num1, num2) -> num1 < num2 ? num1 : num2);

		System.out.println("The largest num: " + biggest);

		// Using the Optional for its designed protections against possible null
		// pointers
		if (smallest.isPresent()) {
			System.out.println("The smallest num: " + smallest.get());
		}
		// Reduce with Strings
		String[] strings = { "Hello", " ", "World" };

		String result = Arrays.asList(strings).stream().reduce("", (s1, s2) -> s1 + s2);

		Integer sum2 = numbers.stream().reduce(Integer::sum).get();

		System.out.println(result);

		System.out.println(sum2);

		double avgInt = numbers.parallelStream().mapToInt(Integer::new).average().getAsDouble();

		System.out.println(avgInt);

		List<Employee> employees = new LinkedList<>();

		employees.add(new Employee("Matthew", 0, "CS"));
		employees.add(new Employee("Yamil", 90_000, "Developer"));
		employees.add(new Employee("Jacob", 70_000, "QA"));
		employees.add(new Employee("Fahad", Integer.MAX_VALUE, "QA"));
		employees.add(new Employee("Trent", Integer.MAX_VALUE, "Dog"));
		employees.add(new Employee("Mohamed D.", Integer.MAX_VALUE, "Developer"));

		Employee lowestSalary = employees.stream().reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2).get();

		System.out.println("Lowest salaried employee: " + lowestSalary);

		String allDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).keySet()
				.stream().reduce((e1, e2) -> (e1 + " | " + e2)).get();

		Set<String> departments = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).keySet();

		System.out.println(allDepartment);

		System.out.println(departments);

		// Find the highest salaried employee(s)
		Employee highest = employees.stream()
				.max(Comparator.comparing(Employee::getSalary)).get();
		
		List<Employee> allHighest = employees.stream()
				.filter(e -> e.getSalary() == highest.getSalary())
				.collect(Collectors.toList());
		
		allHighest.forEach(System.out::println);

		// Find the lowest 2 salaried employees
		List<Employee> lowestTwo = employees.stream()
				.sorted()
				.limit(2)
				.collect(Collectors.toList());
		
		List<Employee> altLowestTwo = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.limit(2)
				.collect(Collectors.toList());
		
		System.out.println("\nLowest Two Employees:");
		altLowestTwo.forEach(System.out::println);

		// Return a List from our employees are under 100,000 salary
		List<Employee> under6figs = employees.stream()
				.filter(e -> e.getSalary() < 100_000)
				.collect(Collectors.toList());
		
		System.out.println("\nEmployees under 100k:");
		under6figs.forEach(System.out::println);

		// Get the average salary of the employees here
		double avgSalary = employees.stream()
				.mapToDouble(Employee::getSalary)
				.average().getAsDouble();
		
		// Need to 
		int altAvgSalary = employees.stream()
				.map(e -> Integer.valueOf(e.getSalary())) //convert stream of employees to ints from salary
				.reduce(0, (e1, e2) -> e1 + e2);
		
		System.out.println("Employee avg salary:" + String.format("%.2f", avgSalary));

	}

}
