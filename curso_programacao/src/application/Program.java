package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("Tamano da Lista: " + list.size());
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		list.removeIf(x-> x.charAt(0) == 'M');
		System.out.println("Tamano da Lista: " + list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("-------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		String name = list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("-------------------------------");
		String nameJ = list.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nameJ);
		
		
		
		
		sc.close();
	}
}
