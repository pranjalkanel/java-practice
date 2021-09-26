package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFunc {
	
	
	public static void main(String[] args) {
		List<PersonData> people = getPeople();
		
		//List<PersonData> female = new ArrayList<>();
		
//		for(PersonData i : people) {
//			if(i.getGender().equals(Gender.FEMALE)) {
//				female.add(i);
//			}
//		}
		
		// filtering collection -- collect command makes new list
		//FILTER
		List<PersonData> females = people.stream()
			.filter(p -> p.getGender().equals(Gender.FEMALE))
			.collect(Collectors.toList());
				
		// Sort
		List<PersonData> sortedList =  people.stream()
			.sorted(Comparator.comparing(PersonData::getAge).reversed())
			.collect(Collectors.toList());
		
		//All Match
		// every body in this list has an age bigger than 5
		boolean allMatch = people.stream().allMatch(person -> person.getAge()>5);
		
		// Any Match
		// check if any one data in collection satisfies the condition
		boolean anyMatch = people.stream().anyMatch(p -> p.getAge()<5);
		
		// None match
		// check if no element satisfies the given condition
		boolean noneMatch = people.stream().noneMatch(p->p.getAge()<7);
		
		// Max
		// max value within a collection
		people.stream()
			.max(Comparator.comparing(PersonData::getAge))
			.ifPresent(System.out::println);
		
		// Min
		// min value within  a collection
		people.stream()
			.min(Comparator.comparing(PersonData::getAge))
			.ifPresent(System.out::println);
		
		// Group
		// group informatoin based on condition
		Map<Gender,List<PersonData>> groupByGender = people.stream()
			.collect(Collectors.groupingBy(PersonData::getGender));
		
		groupByGender.forEach((gender,people1) -> {
			System.out.println(gender);
			people1.forEach(System.out::println);
			System.out.println();
		});
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
