package streamsPac;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExercise {
	
	public static void main(String[] args) {
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
