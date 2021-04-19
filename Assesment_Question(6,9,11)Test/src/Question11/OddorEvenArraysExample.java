package Question11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OddorEvenArraysExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(19, 22, 34, 45, 35);

		Predicate<Integer> evenNumber = (a) -> a % 2 == 0;
		Predicate<Integer> oddNumber = evenNumber.negate();

		List<Integer> even = list.stream().filter(evenNumber).collect(Collectors.toList());
		List<Integer> odd = list.stream().filter(oddNumber).collect(Collectors.toList());

		System.out.println("The Even Numbers Are : " + even);
		System.out.println("The Odd Numbers Are: " + odd);

	}

}
