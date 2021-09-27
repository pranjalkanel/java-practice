package streamsPac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExercise {
	
	public static void main(String[] args) {
		StreamExercise obj = new StreamExercise();
		
		//obj.streamFuncs1();
		obj.streamFuncs2();
	}
	
	public void streamFuncs1() {
		List<PersonData> people = getPeople();
		
		// looping through collection forEach
		// people.forEach((p)->{System.out.println(p.getName());});
		
		
		// converting tostring output of the peopleData class
		// people.stream().map(person -> person.toString() + "hehe").forEach(System.out::println);
		
		
		Map<Gender,List<PersonData>> result = people.stream()
			.collect(Collectors.groupingBy(PersonData::getGender));
		
		result.forEach((a, b) ->{
			System.out.println(a);
			b.forEach(System.out::println);
			System.out.println();
		});
		
		// calculate the average age of the people in the list using getAge as the function for collector function
		double averageAge = people.stream().collect(Collectors.averagingInt(PersonData::getAge));
		
		System.out.println(averageAge);
		
		// filtering female objects from the list
		List<PersonData> result2 =  people.stream()
			.filter(p -> p.getGender().equals(Gender.FEMALE))
			.collect(Collectors.toList());
		
		//result2.forEach(p -> {System.out.println(p);});
		
		// Using max and comparator to get the object with maximum age
		// IfPresent, apply the lambda expression if value is present
		result2.stream()
			.max(Comparator.comparing(PersonData::getAge))
			.ifPresent(p -> System.out.println(p.getName()));
	}
	
	
	// intermediate and terminal operations
	public void streamFuncs2() {
		
		List<PersonData> people = getPeople();
		
		// Creating integer stream using IntStream class
		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println("-----");
		
		// Skip function skips the number of elements specified -> here it skips the first 8 elements
		IntStream.range(1, 10).skip(8).forEach(System.out::println);
		
		// Sum of an integer stream --> here sum is the terminal operation (reducer)
		System.out.println("Sum of the range is " +
				IntStream.range(1, 10).sum()
				);
		
		// Getting sum of all the ages using Collector type
		System.out.println("Sum of all the ages is " + 
				people.stream()
					.collect(Collectors.summingInt(PersonData::getAge))
				);
		
		// Making Stream out of string using Stream.of --> usage of ascending sort
		Stream.of("Pranjal","Udaya","Adarsh","Meru","Sodip")
			.sorted()
			.findFirst().ifPresent(System.out::println);
		
		// Filtering out string that equals to "Pranjal"
		Stream.of("Pranjal","Udaya","Adarsh","Meru","Sodip")
		.filter(name -> name.equalsIgnoreCase("pranjal"))
		.forEach(System.out::println);
		
		
		// Usage of map and average to find the average of the squared values
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(x -> x * x)	// making changes to each value of the stream -- returns a new stream to work with
		.average()			// returns an optional, calculates the average of provided stream
		.ifPresent(System.out::println);
		
	}
	
	public static List<PersonData> getPeople(){
		return List.of(
				new PersonData("Pranjal Deep Kanel",20,Gender.MALE),
				new PersonData("Pranjali Kanel",23,Gender.FEMALE),
				new PersonData("Pradip Raj Kanel",58,Gender.MALE),
				new PersonData("Pramila Kanel",46,Gender.FEMALE),
				new PersonData("Adarsh Subedi",21,Gender.MALE)
				);
	}
}
